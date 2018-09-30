package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoguoqing on 2018-09-13.
 */
public class For {
    public static void main(String[] args) {
        retry:
       for (int i = 0 ;i < 2; i++){
           System.out.println("i"+i);
           for (int j = 0 ;j < 5 ; j++){
               if (j == 2){
                   break retry;
               }
               System.out.println("j"+j);
           }
       }


       int a = 10;
        if (a>1) {
            System.out.println("哈哈");
        } else if (a>2) {
            System.out.println("嘿嘿");
        }else {
            System.out.println("姑姑");
        }
       /* Map map = new HashMap(2);
        map.put("1","1.1");
        map.put("2","1.1");
        map.put("3","1.1");
        System.out.println(map);*/
    }

}
