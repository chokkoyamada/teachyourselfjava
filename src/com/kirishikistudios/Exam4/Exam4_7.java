package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 20:08
 */
public class Exam4_7 {
    public static void main(String args[]) {
        printOdds();
    }

    private static void printOdds() {
        for(int i = 1; i < 101; i++){
            if(i % 2 == 0){continue;}
            System.out.println(i);
        }
    }
}
