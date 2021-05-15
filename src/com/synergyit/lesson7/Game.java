package com.synergyit.lesson7;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random=new Random();
        Block[] blocks = new Block[10];
        for (int i = 0; i < blocks.length; i++){
            int j = random.nextInt(2);
            if (j == 0) {
                blocks[i] = new Barrier();
            } else {
                blocks[i] = new RunningWay();
            }
        }
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            int j = random.nextInt(3);
            if (j == 0) {
                users[i] = new Kiborg();
            }
            if (j == 1) {
                users[i] = new Human();
            }
            if (j == 2) {
                users[i] = new Cat();
            }
        }

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < blocks.length; j++) {
                if (blocks[j].needJump()) {
                    if (users[i].getjMax() > blocks[j].getBlock()) {
                        users[i].jump();
                    } else {
                        System.out.println("Участник " + users[i].getName() + " сошел с дистанции");
                        System.out.println("арьер");
                        System.out.println(users[i].getjMax() + " " + blocks[j].getBlock());
                        break;
                    }
                } else {
                    if (users[i].getrMax() > blocks[j].getBlock()) {
                        users[i].run();
                    } else {
                        System.out.println("Участник " + users[i].getName() + " сошел с дистанции");
                        System.out.println(",ег");
                        System.out.println(users[i].getrMax() + " " + blocks[j].getBlock());
                        break;
                    }
                }
            }
        }

        /*for(int i=0;i<array.length;i++){
            if(array[i]<=f.getjMax()) {
                System.out.println("Дистанция m:"+array[i]+"\tКиборг бежит");
            }
            else if(i==10){
                System.out.println("Дистанция пройдена");
            }
            else{
                System.out.println("киборг отбегался");
                break;
            }
        }*/
    }
}