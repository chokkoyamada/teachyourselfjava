package com.kirishikistudios.Exam5;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 20:41
 */

public class Exam5_3 {
    public static void main(String args[]) {
        Person2 person = new Person2("yamada", 20, 10.2f);
        System.out.println("name is " + person.name);
        System.out.println("age is " + person.age);
        System.out.println("income is " + person.income);

        Sphere2 sphere = new Sphere2(10, 5);
        System.out.println("radius is " + sphere.radius);
        System.out.println("center is " + sphere.center);
    }
}

class Person2{
    String name;
    int age;
    float income;

    Person2(String n, int a, float i){
        name = n;
        age = a;
        income = i;
    }
}

class Sphere2{
    double radius;
    double center;
    Sphere2(double r, double c){
        radius = r;
        center = c;
    }
}
