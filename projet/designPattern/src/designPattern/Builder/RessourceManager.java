package designPattern.Builder;

import java.io.File;
import java.util.function.Predicate;

public class RessourceManager {
	
	private Builder builder;
	
	public RessourceManager() {}

	public RessourceManager(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public Object construct(Predicate<File> fileCondition, String extension) {
		builder.load();  
        builder.filter(fileCondition);
        builder.select(extension);
        builder.print();
		
		return builder.getResult();
	}
}
