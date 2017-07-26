package com.asiainfo.chapter1.luomin;

import java.util.Arrays;

/**
 * @author Luoo
 * @create 2017-07-10 18:26
 */



public class HelloWorld {

    static class Hello {
        String text;

        public Hello(String text) {
            this.text = text;
        }


        @Override
        public String toString() {
            return this.text;
        }
    }

    public static String change(Hello h1, Hello h2) {
        Hello tmp = h1;

        h1 = h2;
        h2 = tmp;
        System.out.println(h1.toString() + "&&" + h2.toString());
        return "111";
    }

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3};
        int[] b= Arrays.copyOf(a,11);
        System.out.println(b[0]);


        Hello h1 = new Hello("h1");
        Hello h2 = new Hello("h2");

        System.out.println(h1.toString()+"&&"+h2.toString());
        System.out.println("-----------");
        change(h1,h2);
        System.out.println("-----------");
        System.out.println(h1.toString()+"&&"+h2.toString());

    }
}
