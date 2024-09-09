package com.nhnacademy.Lab_2;

import java.util.Random;
import org.apache.commons.math3.random.RandomDataGenerator;

public class test02 { // isNull?
    public static void main(String[] args) {
        RandomDataGenerator rd = new RandomDataGenerator();
        Random rand = new Random();
        System.out.println(new Random().nextInt(10));
        System.out.println(rd.nextInt(1, 10));
    }
}
