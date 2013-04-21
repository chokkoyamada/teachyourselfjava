package com.kirishikistudios.Exam5;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 20:51
 */
public class Exam5_4 {
    public static void main(String args[]) {

    }
}

class Circle{
    double radius;
    double point_x;
    double point_y;

    Circle(double r){
        radius = r;
        point_x = 0;
        point_y = 0;
    }

    Circle(double x, double y, double r){
        radius = r;
        point_x = x;
        point_y = y;
    }
}

class Sphere3{
    double radius;
    double x;
    double y;
    double z;

    Sphere3(){
        radius = 1;
        x = 0;
        y = 0;
        z = 0;
    }

    Sphere3(double r){
        radius = r;
        x = 0;
        y = 0;
        z = 0;
    }

    Sphere3(double px, double py, double pz, double r){
        radius = r;
        x = px;
        y = py;
        z = pz;
    }
}
