package com.company;

import com.company.dog.Dog;

public class Main {

    public static void main(String[] args) {
	System.out.println(" Hello World");
	Cat cat= new Cat ();
	cat.setName( " Kolbasa");
	cat.setAge (5);
        System.out.println( cat.toString());

        Dog dog= new Dog ();
        dog.setName ( "Bobic");
        dog.setAge(8);
        System.out.println(dog.toString());





        cat.eat();


    }
}
