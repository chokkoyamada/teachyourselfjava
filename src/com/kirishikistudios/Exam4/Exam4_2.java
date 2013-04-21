package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 3:50
 */
public class Exam4_2 {
    public static void main(String args[]) {
        String num = "57";
        int i = Integer.valueOf(num);
        for (int j = i; j> 0; j--){
            System.out.print(j + " ");
        }
        System.out.print("\u0007");
        System.out.println("");

        for (int l = 1; l < 999; l = l+l){
            System.out.println(l);
        }
    }
}
