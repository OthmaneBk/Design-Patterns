package designPattern.Client;

import java.awt.FlowLayout;
import java.io.File;
import java.util.Hashtable;
import java.util.Set;
import java.util.function.Predicate;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

import designPattern.Bridge.ConcreteImplementor;
import designPattern.Bridge.ImplementorSource;
import designPattern.Builder.ResourceExplorer;
import designPattern.Builder.RessourceManager;
import designPattern.Command.Command;
import designPattern.Command.Invoker;
import designPattern.Command.Receiver;
import designPattern.Command.Commands.FilterCommand;
import designPattern.Command.Commands.LoadCommand;
import designPattern.Command.Commands.PrintCommand;
import designPattern.Command.Commands.SelectCommand;
import designPattern.Command.MacroCommand.MacroCommand;
import designPattern.Proxy.AccessControlProxy;
import designPattern.Proxy.User;

public class Client extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private Predicate<File> testCondition=file -> file.getName().endsWith("java");
    private String extension="java";
    private ResourceExplorer explorer;
    private RessourceManager ressourceManager;
    
    
    private Invoker invoker;
	private Receiver receiver;
	private Hashtable<String, Command> commands;
    
	
	private Command load, filter, select, print;
	private Command macro;
	
	
	private AccessControlProxy accessControlProxy;
	private User user;
	public Client() {
		init();
		//config0();
		//config1();
		//config2();
		config3();
	}
	
	private void init() {
		ImplementorSource implementorSource = new ConcreteImplementor(".");
        explorer = new ResourceExplorer(implementorSource, "le nom de fichier","la taille de fichier");
        ressourceManager=new RessourceManager(explorer);
		receiver=new Receiver(explorer, testCondition, extension);
		invoker=new Invoker("Invoker");
		user=new User("designPattern@gmail.com","123");
		
		commands=new Hashtable<String, Command>();
		commands.put("Load", new LoadCommand(receiver));
		commands.put("Filter", new FilterCommand(receiver, "txt"));
		commands.put("Select", new SelectCommand(receiver, extension));
		commands.put("Print", new PrintCommand(receiver));
		
		
		load=new LoadCommand(receiver);
		filter=new FilterCommand(receiver, "java");
		select=new SelectCommand(receiver, extension);
		print=new PrintCommand(receiver);
		macro=new MacroCommand(load ,filter, select,print);
	}
	
	public JTable config0() {
        return (JTable)ressourceManager.construct(testCondition, extension);  
	}
	
	
	public void config1() {
	
		getContentPane().add("South",invoker);
		
		JPanel p=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new JLabel("Commands: "));
		getContentPane().add("North",p);
		
		
		Set<String> keys=commands.keySet();
		ButtonGroup group=new ButtonGroup();
		
		for (String key : keys) {
			JRadioButton b=new JRadioButton(key);
			p.add(b);
			group.add(b);
			
			b.addActionListener(e -> {
				Command command =commands.get(key);
				invoker.setCommand(command);
				});
		}
		
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public void config2() {
			
		invoker.setCommand(macro);
		invoker.invoke();
	
	}

	
	public void config3() {
		accessControlProxy=new AccessControlProxy(ressourceManager, user);
		accessControlProxy.construct(testCondition, extension);
	}
	public static void main(String[] args) {
        new Client();
    }
}
