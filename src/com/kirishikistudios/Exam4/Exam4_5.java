package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 19:42
 */
public class Exam4_5 {
    public static void main(String args[]) {
        findPrime();
    }

    private static void findPrime() {
        for(int num = 100; num <= 200; num++){
            boolean prime = true;
            for(int j = 2; j < num / 2 + 1; j++){
                if(num%j == 0) {
                    prime = false;
                }
            }
            if(prime == true){
                System.out.println(num);
            }
        }
    }
}
