package com.goit.module3;

import com.goit.module3.flowers.*;

import java.util.ArrayList;

/**
 * Created by Администратор on 22.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        ArrayList<Root> roots = new ArrayList<Root>();

        roots.add(new Root(1, 15, "low"));
        roots.add(new Root(2, 25, "long"));

        RoseBush roseBush = new RoseBush(roots);

        for(Root root : roseBush.getRoots())
        {
            System.out.println("Корінь № " + root.getCount() + " " + "висота" + " " + root.getWeight());
        }
        System.out.print("\n");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Rose> roses = new ArrayList<Rose>();

        roses.add(new Rose(45, "yellow", 20));
        roses.add(new Rose(43, "red", 20));
        roses.add(new Rose(44, "white", 20));

        roseBush.setRoses(roses);

        for(Rose rose : roseBush.getRoses())
        {
            System.out.println("Роза: " + rose.getWeight() + " см," + " колір " + rose.getColor() + ", ціна = " + rose.getPrice() + " грн.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Flower> flowers = new ArrayList<Flower>();

        flowers.add(new Rose(45, "червоний", 20));
        flowers.add(new Chamomile(15, "білий", 5));
        flowers.add(new Tulip(35, "жовтий", 25));
        flowers.add(new Aster(27, "голубий", 17));

        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers(flowers, 67);

        System.out.println("\nБукет квітів:");

        for(Flower flower : bouquetOfFlowers.getFlowers())
        {
            System.out.println("Квітка: " + flower.getWeight() + " см," + " колір " + flower.getColor() + ", ціна = " + flower.getPrice() + " грн.");
        }

        System.out.println("Ціна за букет " + bouquetOfFlowers.getPrice() + " грн.");
    }
}
