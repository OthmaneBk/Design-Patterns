package designPattern.Bridge;

import java.io.File;
import java.util.List;

import designPattern.Composite.FolderSource;

public class ConcreteImplementor implements ImplementorSource{
    
    private FolderSource folderSource;
    
    public ConcreteImplementor(String folderPath){
        this.folderSource = new FolderSource(folderPath);
    }
    
    @Override
    public List<File> load() {
        return folderSource.load();
    }
}
