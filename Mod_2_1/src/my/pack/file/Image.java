package my.pack.file;

import my.pack.File;

/**
 * Created by Администратор on 09.12.2015.
 */
public class Image extends File {

    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
