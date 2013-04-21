package com.kirishikistudios.Exam3;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 3:24
 */
public class Exam3_5 {
    public static void main(String args[]) {
        print20to30();
        increment();
    }

    private static void increment() {
        int a, b;
        a = 1;
        a = ++a;
        b = a;
        b = --b;
        System.out.println(a + " " + b);
    }

    private static void print20to30() {
        for (int i = 0; i<=30; i++){
            System.out.println(i);
        }
    }
}
