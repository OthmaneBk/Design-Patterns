package designPattern.Composite;


import java.io.File;
import java.util.List;
import java.util.Vector;

import designPattern.Bridge.ImplementorSource;

public class FolderSource implements ImplementorSource{
	private Component tree;
	private List<File> files;
	
	public Component getTree() {
		return tree;
	}
	
	public void setTree(Component tree) {
		this.tree = tree;
	}
	
	public FolderSource(String path) {
		files=new Vector<File>();
		tree=createComponent(new File(path));
	}
	
	
	public Component createComponent(File f) {

		if(f.isDirectory()) {
			Component cmp=new Composite(f.getName());
			File content[]=f.listFiles();
			for (File file : content) {
				cmp.add(createComponent(file));
			}
			return cmp;
		}else {
			files.add(f);
			return new Leaf(f.getName());
		}
	}

	@Override
	public List<File> load() {
		return files;
	}
}
