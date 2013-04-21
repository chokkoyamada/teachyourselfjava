package com.kirishikistudios.Exam1;

/**
 * Created with IntelliJ IDEA.
 * User: yamadanaoyuki
 * Date: 2013/02/03
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class Exam1_9 {
    private Exam1_9() {
    }

    public static void main(String args[]){
        int num = 1000;
        System.out.println(num + " is the value of num");
        //uninitializedValuables();
    }

    public static Exam1_9 createExam1_9() {
        return new Exam1_9();
    }

    /*
    private static void uninitializedValuables(){
        char c;
        boolean flag;
        System.out.println(c);
        System.out.println(flag);
    }
    */
}