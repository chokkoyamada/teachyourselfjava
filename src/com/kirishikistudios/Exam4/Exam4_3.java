package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 4:08
 */
public class Exam4_3 {
    public static void main(String args[]) {
        sum(new int[]{1, 2, 3, 4, 5});
        random();
    }

    private static void sum(int args[]) {
        int count = 0;
        int sum = 0;
        while(count < args.length){
            sum += args[count];
            count++;
        }
        System.out.println("SUM: " + sum);
    }

    private static void random() {
        Double sum = 0.0;
        while(sum < 20){
            sum += Math.random();
            System.out.println(sum);
        }
    }
}
