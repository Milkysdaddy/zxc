/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.zxcc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.Element;

/**
 *
 * @author ois
 */
public class Zxcc {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer i = 2;
        while (i < 101) {
            list.add(i);
            i++;
        }
        for(Integer element : list){
            BigInteger bigInteger = BigInteger.valueOf(element);
            if(bigInteger.isProbablePrime((int) Math.log(element))){
                System.out.println(element);
            }
        }
    }
}
