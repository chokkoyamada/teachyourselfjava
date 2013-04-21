package com.kirishikistudios.Exam5;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 20:31
 */
public class Exam5_2 {
    public static void main(String args[]) {
        Person person = new Person();
        person.name = "yamada";
        person.age = 20;
        person.income = 10.2f;
        System.out.println("name is " + person.name);
        System.out.println("age is " + person.age);
        System.out.println("income is " + person.income);

        Sphere sphere = new Sphere();
        sphere.radius = 10;
        sphere.center = 5;
        System.out.println("radius is " + sphere.radius);
        System.out.println("center is " + sphere.center);
    }
}

class Person{
    String name;
    int age;
    float income;
}

class Sphere{
    double radius;
    double center;
}
