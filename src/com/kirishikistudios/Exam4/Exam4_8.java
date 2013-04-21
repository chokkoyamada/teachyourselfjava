package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 20:23
 */
public class Exam4_8 {
    public static void main(String args[]) {
        useSwitch();
    }

    private static void useSwitch() {
        int i = 5;
        switch(i){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("not 5");
                break;
            case 5:
                System.out.println("this is 5");
                break;
            default:
                System.out.println("invalid.");
                break;
        }
    }
}
