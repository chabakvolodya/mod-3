package com.goit.module3;

/**
 * Created by Администратор on 09.12.2015.
 */
abstract public class File {

    protected String name;
    protected long size;
    protected String extension;

    public File(String name, String extension, long size) {
        this.name = name;
        this.size = size;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;

    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
