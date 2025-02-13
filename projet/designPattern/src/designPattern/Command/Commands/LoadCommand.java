package designPattern.Command.Commands;

import designPattern.Command.Command;
import designPattern.Command.Receiver;

public class LoadCommand implements Command{
	private Receiver receiver;

	public LoadCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void execute() {
		receiver.load();
	}
}
