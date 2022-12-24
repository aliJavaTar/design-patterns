package com.erfagh.patterns.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final static Map<String, Eat> eatMap = new HashMap<>();

    static {
        eatMap.put("meat",new MeatEater());
        eatMap.put("vegetable",new Vegetarianism());
    }

    public static Map<String, Eat> getEatMap() {
        return eatMap;
    }
}
