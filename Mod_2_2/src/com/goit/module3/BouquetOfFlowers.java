package com.goit.module3;

import java.util.ArrayList;

/**
 * Created by Администратор on 09.12.2015.
 */
public class BouquetOfFlowers {

    private ArrayList<Flower> flowers;
    private int price;

    public BouquetOfFlowers(ArrayList<Flower> flowers, int price) {
        this.flowers = flowers;
        this.price = price;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
