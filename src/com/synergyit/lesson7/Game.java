package com.synergyit.lesson7;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Block[] blocks = new Block[10];
        for (int i = 0; i < blocks.length; i++){
            int j = random.nextInt(2);
            if (j == 0) {
                blocks[i] = new Barrier();
            } else {
                blocks[i] = new RunningWay();
            }
        }
        User[] users = new User[3];

        users[0] = new Kiborg();
        users[1] = new Human();
        users[2] = new Cat();

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < blocks.length; j++) {
                if (blocks[j].needJump()) {
                    if (users[i].getjMax() > blocks[j].getBlock()) {
                        users[i].jump();
                    } else {
                        System.out.println("Участник " + users[i].getName() + " сошел с дистанции");
                        System.out.println("Препятствие - Барьер");
                        System.out.println(users[i].getjMax() + " " + blocks[j].getBlock());
                        break;
                    }
                } else {
                    if (users[i].getrMax() > blocks[j].getBlock()) {
                        users[i].run();
                    } else {
                        System.out.println("Участник " + users[i].getName() + " сошел с дистанции");
                        System.out.println("Препятствие - Бег");
                        System.out.println(users[i].getrMax() + " " + blocks[j].getBlock());
                        break;
                    }
                }
            }
        }
    }
}