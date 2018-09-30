package com.company;

/**
 * Created by zhaoguoqing on 2018-09-03.
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        boolean modified = false;
        int j = 23;
        //j = j >> 3;
        modified = modified | false;
        j = j | 2;
        j = j & 2;
        System.out.println(j);
    }
}
