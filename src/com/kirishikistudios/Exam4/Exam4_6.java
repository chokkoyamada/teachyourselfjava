package com.kirishikistudios.Exam4;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 19:55
 */
public class Exam4_6 {
    public static void main(String args[]) {
        forLoop();
        whileLoop();
        doLoop();
        nestedLoop();
    }

    private static void nestedLoop() {
        ILoop: for(int i = 0; i< 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(j);
                if(i > 4 && j > 5){
                    break ILoop;
                }
            }
            System.out.println("");
        }
    }

    private static void doLoop() {
        int i = 0;
        do {
            if(i > 5){
                break;
            }
            System.out.print(i);
            i++;
        }while(i<10);
        System.out.println("");
    }

    private static void whileLoop() {
        int i = 0;
        while(i<10){
            System.out.print(i);
            if(i > 5){
                break;
            }
            i++;
        }
        System.out.println("");
    }

    private static void forLoop() {
        for(int i = 0; i < 5; i++){
            System.out.print(i);
            if(i > 3){
                break;
            }
        }
        System.out.println("");
    }
}
