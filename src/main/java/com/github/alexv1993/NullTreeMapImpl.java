package com.github.alexv1993;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Alex on 08.10.2017.
 */
public class NullTreeMapImpl implements NullTreeMap {
    @Override
    public void test1() {
        Map map = new TreeMap();

        try {
            map.put(null, "null");
        } catch (Exception ex) {
            System.out.println("Can't to add a null key in red-black tree");
            ex.printStackTrace();
        }


        System.out.println(map.size());

        try {
            System.out.println(map.get(null));
        } catch (NullPointerException ex) {
            System.out.println("Value is not exist");
            ex.printStackTrace();

        }

    }

    @Override
    public void test2() {
        Map map = new TreeMap();
        try {
            map.put(null, "null");
        } catch (NullPointerException ex) {
            System.out.println("Can't to add a null key in red-black tree");
            ex.printStackTrace();
        }
        System.out.println(map.size());
        map.put(0, "0");
        System.out.println(map.size());
    }

    @Override
    public void test3() {
        Map map = new TreeMap();
        map.put(0, "0");
        map.put(1, 1);
        System.out.println(map.size());
        try {
            map.put(null, "null");
        } catch (NullPointerException ex) {
            System.out.println("Can't to add a null key in red-black tree");
            ex.printStackTrace();
        }
    }
}
