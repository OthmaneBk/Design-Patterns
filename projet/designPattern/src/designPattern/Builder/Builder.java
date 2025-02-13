package designPattern.Builder;

import java.io.File;
import java.util.List;
import java.util.function.Predicate;

public interface Builder {
	public void load();
	public void filter(Predicate<File> fileCondition);
	public void select(String extension);
	public void print();
	public Object getResult();
}
