package my.pack;

import my.pack.instrument.Guitar;
import my.pack.instrument.Piano;
import my.pack.instrument.Trumpet;

import java.util.ArrayList;

/**
 * Created by Администратор on 21.12.2015.
 */
public class MusicShop {
    public static void main(String[] args) {

        ArrayList<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();

        instruments.add(new Piano());
        instruments.add(new Guitar());
        instruments.add(new Trumpet());
    }
}
