package com.asiainfo.chapter1.luomin;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Luoo
 * @create 2017-07-26 15:56
 */

public class Dog extends Animal {


    private String tagNum;

    public Dog(String name,String tagNum) {
        super(name);
        this.tagNum = tagNum;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void barking() {
        System.out.print("woof-woof!!!");
        super.barking();
    }


    public void watchingDoor() {
        System.out.println(super.getName() + " is Watching door!!!");
    }

    public void setTagNum(String tagNum) {
        this.tagNum = tagNum;
    }

    public static void main(String[] args) {
        Animal dog = new Dog("lucky","num001");
        dog.barking();
    }
}
