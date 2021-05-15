package com.synergyit.lesson7;

import java.util.Random;

public class Barrier implements Block{
    private int height;
    private Random random = new Random();

    public Barrier() {
        this.height = random.nextInt(100);
    }

    @Override
    public int getBlock() {
        return height;
    }

    @Override
    public boolean needJump() {
        return true;
    }
}
