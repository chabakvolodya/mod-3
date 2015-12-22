package com.goit.module3.flowers;

import com.goit.module3.Root;
import java.util.ArrayList;

/**
 * Created by Администратор on 09.12.2015.
 */
public class RoseBush {

    private ArrayList<Rose> roses;
    private ArrayList<Root> roots;

    public RoseBush(ArrayList<Root> roots) {
        this.roots = roots;
    }


    public ArrayList<Rose> getRoses() {
        return roses;
    }

    public void setRoses(ArrayList<Rose> roses) {
        this.roses = roses;
    }

    public ArrayList<Root> getRoots() {
        return roots;
    }

    public void setRoots(ArrayList<Root> roots) {
        this.roots = roots;
    }
}
