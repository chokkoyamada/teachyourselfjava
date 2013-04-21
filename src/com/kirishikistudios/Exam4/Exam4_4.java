package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 19:28
 */
public class Exam4_4 {
    public static void main(String args[]) {
        fibonnacchi();
        replacefor();
    }

    private static void replacefor() {
        int i = 0;
        while(i<10){
            System.out.println(i);
            i = i+2;
        }
    }

    private static void fibonnacchi() {
        int prev = 0;
        int succ = 1;
        int count = 0;
        do {
            int next = prev + succ;
            prev = succ;
            succ = next;
            System.out.println(next);
            count++;
        }while(count < 15);
    }
}
