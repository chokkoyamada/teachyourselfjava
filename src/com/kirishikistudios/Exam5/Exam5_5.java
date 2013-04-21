package com.kirishikistudios.Exam5;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 22:48
 */
public class Exam5_5 {
    public static void main(String args[]) {

    }
}

class Sphere4{
    double radius;
    double x;
    double y;
    double z;

    Sphere4(){
        this(0,0,0,1);
    }
    Sphere4(double r){
        this(0,0,0,r);
    }
    Sphere4(double px, double py, double pz, double r){
        x = px;
        y = py;
        z = pz;
        radius = r;
    }
}
