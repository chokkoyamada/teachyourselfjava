package com.kirishikistudios.Exam2;

/**
 * User: yamadanaoyuki
 * Date: 2013/02/24
 * Time: 19:53
 */
public class Exam2_9 {
    public static void main(String args[]){
        makeFloatArray();
        makeObjectArray();
    }

    private static void makeFloatArray() {
        Float array[] = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f};
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    private static void makeObjectArray() {
        Object array[] = new Object[5];
        array[0] = new Integer(1);
        array[1] = new String("Hello");
        array[2] = new Boolean(true);
        array[3] = new Character('a');
        array[4] = new Double(0.1);
        for (Object i : array){
            System.out.println(i);
        }
    }
}
