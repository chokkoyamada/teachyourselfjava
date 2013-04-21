package com.kirishikistudios.Exam3;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 3:04
 */
public class Exam3_4 {
    public static void main(String args[]) {
        print1to100();
        print17();
        printInsuu(14);
    }

    private static void printInsuu(Integer num) {
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }

    private static void print17() {
        for(int i = 17; i < 100; i++){
            if (i % 17 == 0){
                System.out.println(i);
            }
        }
    }

    private static void print1to100() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}


