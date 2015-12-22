package com.goit.module3;

import com.goit.module3.instrument.*;

import java.util.ArrayList;

/**
 * Created by Администратор on 22.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop("MyShop", 453.2546, 5);


        ArrayList<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();

        instruments.add(new Piano("Piano 320", 1500));
        instruments.add(new Guitar("Guitar", 244));
        instruments.add(new Trumpet("Trumplet Super", 900));



        musicShop.setMusicalInstruments(instruments);

        for (MusicalInstrument musicalInstrument : musicShop.getMusicalInstruments())
        {
            System.out.println("Назва інструменту: " + musicalInstrument.getName() + " ціна " + musicalInstrument.getPrice() + " грн.");
        }


    }
}
