package com.kirishikistudios.Exam2;

/**
 * User: yamadanaoyuki
 * Date: 2013/02/24
 * Time: 19:23
 */
public class Exam2_7 {
    public static void main(String args[]){
        characterUsage();
        analyzeStrings();
    }

    private static void analyzeStrings() {
        String str8 = "76";
        String str10 = "100";
        String str16 = "2f";
        System.out.println(Short.parseShort(str8, 8));
        System.out.println(Short.parseShort(str10, 10));
        System.out.println(Short.parseShort(str16, 16));
    }

    private static void characterUsage() {
        char a = '1';
        if (Character.isDigit(a)){
            System.out.println("a is digit.");
        }
        char b = 'b';
        System.out.println(Character.toUpperCase(b));
    }
}
