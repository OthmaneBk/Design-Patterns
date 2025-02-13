package designPattern.Command.MacroCommand;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import designPattern.Command.Command;

public class MacroCommand implements Command{
	
	private List<Command> commands;
	
	
	public MacroCommand(Command...commands) {
		this.commands= Arrays.asList(commands);
	}
	
	public MacroCommand() {
		commands=new LinkedList<Command>();
	}
	
	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}
	
	
	public void add(Command command) {
		commands.add(command);
	}
	
	
	
}
