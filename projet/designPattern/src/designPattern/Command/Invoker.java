package designPattern.Command;

import javax.swing.JButton;

public class Invoker extends JButton{
	private static final long serialVersionUID = 1L;
	private Command command;

	public Invoker(String label) {
		super(label);
		command=() -> {};
		addActionListener(e -> command.execute());
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void invoke() {
		command.execute();
	}
}
