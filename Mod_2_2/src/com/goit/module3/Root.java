package com.goit.module3;

/**
 * Created by Администратор on 22.12.2015.
 */
public class Root {

    private int count;
    private int weight;
    private String size;

    public Root(int count, int weight, String size) {
        this.count = count;
        this.weight = weight;
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Root(int weight, String size) {
        this.weight = weight;
        this.size = size;


    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
