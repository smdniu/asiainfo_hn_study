package com.asiainfo.chapter1.luomin.wangjz.java基础.javaday1;

import org.junit.Test;

/**
 * Created by wjz123456 on 2017/7/24.
 */
public class test {
    @Test
    public void test(){
        String str1[]=new String[]{"aa","bb","wjz","dd"};
        String str2[]=new String[4];
        System.out.println(str2.length);
        System.out.println(str1.equals(str2));
        System.out.println(str1.length==(str2.length));
        for(String s:str1){
            System.out.println(s);
        }
    }
}
