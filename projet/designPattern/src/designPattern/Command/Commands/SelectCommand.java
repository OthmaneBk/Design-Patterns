package designPattern.Command.Commands;

import designPattern.Command.Command;
import designPattern.Command.Receiver;

public class SelectCommand implements Command{
	private Receiver receiver;
	private String extension;
	
	public SelectCommand(Receiver receiver,String extension) {
		super();
		this.receiver = receiver;
		this.extension=extension;
	}



	@Override
	public void execute() {
		receiver.select(extension);	
	}
}
