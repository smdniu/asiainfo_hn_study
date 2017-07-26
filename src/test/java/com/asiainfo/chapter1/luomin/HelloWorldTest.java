package com.asiainfo.chapter1.luomin;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Luoo on 2017/7/25.
 */
public class HelloWorldTest {
    @Test
    public void change() throws Exception {
        HelloWorld.Hello h1 = new HelloWorld.Hello("h1");
        HelloWorld.Hello h2 = new HelloWorld.Hello("h2");


        assertEquals("1111",HelloWorld.change(h1,h2));
    }

}