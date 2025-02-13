package designPattern.Composite;

import java.io.File;
import java.util.List;

public abstract class Component{
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

public void add(Component component) {
		
	}
	
	public Component remove(int index) {
		return null;
	}
	
	public Component get(int index) {
		return null;
	}
	
	public int size() {
		return 0;
	}

    public abstract void operation();
}
