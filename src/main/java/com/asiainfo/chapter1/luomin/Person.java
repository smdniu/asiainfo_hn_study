package com.asiainfo.chapter1.luomin;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Luoo
 * @create 2017-07-26 11:05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Person {
    String myName;
    int sex;
    Integer age;
    String address;


}
