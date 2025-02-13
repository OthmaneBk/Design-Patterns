package designPattern.Bridge;

import java.io.File;
import java.util.List;

public interface ImplementorSource{
    List<File> load();
}
