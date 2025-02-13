package designPattern.Command.Commands;

import java.io.File;
import java.util.function.Predicate;

import designPattern.Command.Command;
import designPattern.Command.Receiver;


public class FilterCommand implements Command{
	private Receiver receiver;
	private Predicate<File> predicates;
	
	public FilterCommand(Receiver receiver,String extension) {
		super();
		this.receiver = receiver;
		this.predicates=file -> file.getName().endsWith(extension);
	}



	@Override
	public void execute() {
		receiver.filter(predicates);	
	}
}