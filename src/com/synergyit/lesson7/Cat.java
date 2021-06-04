package com.synergyit.lesson7;

import java.util.Random;

public class Cat implements User{

    private Random random = new Random();
    private int rMax = random.nextInt(100);
    private int jMax = random.nextInt(100);

    public Cat(){};

    public Cat(int rMax,int jMax){
        this.rMax=rMax;
        this.jMax=jMax;
    }
    public int getrMax() {
        return rMax;
    }
    public int getjMax() {
        return jMax;
    }
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }
    @Override
    public String getName() {
        return "Кот";
    }
}
