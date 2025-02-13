package designPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> children = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component component){
        children.add(component);
    }

    @Override
    public Component remove(int index){
        return children.remove(index);
    }

    @Override
    public Component get(int index){
        return children.get(index);
    }

    @Override
    public int size(){
        return children.size();
    }

    @Override
    public void operation(){
        for (Component child : children) {
            child.operation();
        }
    }
}
