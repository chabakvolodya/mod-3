package com.goit.module3;

import com.goit.module3.file.*;

import java.util.ArrayList;

/**
 * Created by Администратор on 22.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        Directory dir = new Directory("mydir", "C:/local/");

        ArrayList<File> files = new ArrayList<File>();

        files.add(new AudioFile("AudioFile" , ".mp3", 5958449));
        files.add(new ImageFile("ImageFile", ".jpg", 84484 ));
        files.add(new TextFile("TextFile", ".txt", 165415684));

        dir.setFiles(files);

        System.out.println("Files is " + dir.getName().toUpperCase() + " " + "path to " + dir.getAbsolutePath() + dir.getName() + "\n");

        for (File file : dir.getFiles())
        {
            System.out.println(file.getName() + file.getExtension() + " " + "[" + file.getSize() + "]");
        }
    }
}
