package com.asiainfo.chapter1.luomin;

/**
 * @author Luoo
 * @create 2017-07-26 15:53
 */

public class Animal {


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void barking() {
        System.out.println(this.name + " is barking!!!");
    }

    public String getName() {
        return name;
    }
}
