package com.synergyit.lesson7;
import java.util.Random;

public class Kiborg implements User{
    private Random random = new Random();
    private int rMax = random.nextInt(100);
    private int jMax = random.nextInt(100);

    public Kiborg(){};

    public Kiborg(int rMax,int jMax){
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
    public String getName() {
        return "Киборг";
    }
    @Override
    public void run() {
        System.out.println("Киборг бежит");
    }
    @Override
    public void jump() {
        System.out.println("Киборг прыгнул");
    }
}



