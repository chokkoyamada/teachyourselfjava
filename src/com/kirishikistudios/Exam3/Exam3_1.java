package com.kirishikistudios.Exam3;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/07
 * Time: 2:45
 */
public class Exam3_1 {
    public static void main(String args[]){
        kisuu_or_guusuu(9);
        convert_meter_to_feet(1.0, "meter");
    }

    private static void kisuu_or_guusuu(Integer arg){
        if (arg % 2 == 0){
            System.out.println("guusuu");
        }else {
            System.out.println("kisuu");
        }
    }

    private static void convert_meter_to_feet(Double num, String unit){
        if(unit == "meter"){
            Double ret = new Double(num / 3.28);
            System.out.println(ret);
        }else if (unit == "feet"){
            Double ret = new Double(num * 3.28);
            System.out.println(ret);
        }else{
            System.out.println("cannot convert.");
        }
    }
}
