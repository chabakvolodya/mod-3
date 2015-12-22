package com.goit.module3;

import com.goit.module3.instrument.Guitar;
import com.goit.module3.instrument.Piano;
import com.goit.module3.instrument.Trumpet;

import java.util.ArrayList;

/**
 * Created by Администратор on 21.12.2015.
 */
public class MusicShop {
    private String name;
    private double area;
    private int floor;
    private ArrayList<MusicalInstrument> musicalInstruments;

    public MusicShop(String name, double area, int floor) {
        this.name = name;
        this.area = area;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(ArrayList<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }
}
