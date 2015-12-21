package my.pack;

import my.pack.file.*;

import java.util.ArrayList;


/**
 * Created by Администратор on 09.12.2015.
 */
public class Directory {

    public static void main(String[] args) {

        ArrayList<File> files = new ArrayList<File>();

        files.add(new Text("TextFile"));
        files.add(new Audio("AudioFile"));
        files.add(new Image("ImageFile"));

        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
