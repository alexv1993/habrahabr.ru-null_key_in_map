package com.github.alexv1993;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 08.10.2017.
 */
public class NullKeyMapImpl implements NullKeyMap {
    Map map;

    public NullKeyMapImpl() {
        map = new HashMap();
        map.put(null, "test");
    }

    @Override
    public void showSize() {
        System.out.println(map.size()); // вывод: 1
        System.out.println(map.get(null)); // вывод: test
    }

    @Override
    public void get() {

    }

    @Override
    public void addHash0() {
        map.put(0, "0");
        System.out.println(map.size());
    }

    @Override
    public void nullText() {
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map.get(null));
        System.out.println(map.containsKey(null));
    }
}
