package com.kirishikistudios.Exam2;

/**
 * User: yamadanaoyuki
 * Date: 2013/02/24
 * Time: 18:38
 */
public class Exam2_4 {
    public static void main(String args[]){
        display16style();
        useParseInt();
    }

    private static void display16style() {
        int myint = 10;
        String mystr = Integer.toHexString(myint);
        System.out.println(mystr);
    }

    private static void useParseInt() {
        String mystr = "134";
        int myint = Integer.parseInt(mystr);
        System.out.println(myint);
    }
}
