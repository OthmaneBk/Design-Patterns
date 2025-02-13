package designPattern.Builder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import designPattern.Bridge.ImplementorSource;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;

public class ResourceExplorer implements Builder{

    private ImplementorSource implementorSource;
    private List<File> files;
    private List<File> result;
	private DefaultTableModel model;
	private String titles[];
	private JTable table;

    public ResourceExplorer(ImplementorSource implementorSource,String... titles){
        this.implementorSource = implementorSource;
        this.titles=titles;
    }

    public void load(){
    	model=new DefaultTableModel(titles,0);
    	result=new Vector<File>();
    	table=new JTable(model);
        files = implementorSource.load();
    }


    public void filter(Predicate<File> fileCondition){
    	result=new Vector<File>();
        for (File fileItem : files) {
            if (fileCondition.test(fileItem)){
                result.add(fileItem);
            }
        }
        files=result; 
    }


    public void select(String extension){
    	result=new Vector<File>();
        for (File fileItem : files){
            if (fileItem.getName().endsWith(extension)){
                result.add(fileItem);
            }
        }
        files=result;
    }

    public void print(){
        JFrame frame = new JFrame("Explorateur de fichiers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        for (File file : files){
        	String fileName=file.getName();
        	long fileLength=file.length();
            Object[] row = {fileName, fileLength / 1024.0};
            model.addRow(row);
        }

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.setVisible(true);
    }

	@Override
	public Object getResult() {
		return table;
	}
}
