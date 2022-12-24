package com.erfagh.patterns.behavioral.strategy;

import static com.erfagh.patterns.behavioral.strategy.Context.*;

public class Application {
    public static void main(String[] args) {
      getEatMap().get("meat").eat();
    }
}
