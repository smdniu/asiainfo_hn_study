package com.asiainfo.chapter1.liangzhiqiang.day2;

import com.asiainfo.chapter1.sunmd.StringDemo;

/**
 * Created by 君不悔 on 2017/7/25.
 */
public class count {
    public static void main(String[]args){
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+(j*i));
                System.out.print("");
            }
            System.out.print("");
        }
    }
}
