package com.synergyit.lesson7;

import java.util.Random;

public class RunningWay implements Block{
    private int distance;
    private Random random = new Random();

    public RunningWay() {
        this.distance = random.nextInt(100);
    }

    @Override
    public int getBlock() {
        return distance;
    }

    @Override
    public boolean needJump() {
        return false;
    }
}
