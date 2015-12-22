package com.goit.module3;

/**
 * Created by Администратор on 09.12.2015.
 */
abstract public class MusicalInstrument {
    private String name;
    private int price;

    public MusicalInstrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
