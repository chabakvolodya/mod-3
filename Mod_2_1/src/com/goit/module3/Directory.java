package com.goit.module3;

import java.util.List;


/**
 * Created by Администратор on 09.12.2015.
 */
public class Directory {

    private String name;
    private String absolutePath;

    private List<Directory> childDirectories;
    private List<File> files;

    public Directory(String name, String absolutePath) {
        this.name = name;
        this.absolutePath = absolutePath;
    }

    public List<Directory> getChildDirectories() {
        return childDirectories;
    }

    public void setChildDirectories(List<Directory> childDirectories) {
        this.childDirectories = childDirectories;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
