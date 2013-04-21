package com.kirishikistudios.Exam3;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 2:58
 */
public class Exam3_2 {
    public static void main(String args[]){
        String arg[] = new String[2];
        arg[0] = "3.4";
        arg[1] = "10.4";
        Double num1 = new Double(arg[0]);
        Double num2 = new Double(arg[1]);
        if(num2 == 0){
            System.out.println("cannnot divide by zero.");
        }else{
            System.out.println(num1 / num2);
        }

    }
}
