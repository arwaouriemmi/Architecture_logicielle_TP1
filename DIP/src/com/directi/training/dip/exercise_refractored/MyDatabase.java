package com.directi.training.dip.exercise_refractored;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IDatabase {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void write(String inputString) {
        _data.put(++_count, inputString);
    }
}
