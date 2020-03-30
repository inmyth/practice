package me.mbcu.practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.time.LocalDate.*;

abstract class Writer {public static void write() {System.out.println("Writing...");}}

class SuperClass {SuperClass(int x) {System.out.println("Super");}}



public class OracleCert extends Writer{

    public static void write() {System.out.println("Writing code");}
        static Integer in;

    public static void main(String[] args) {

            for (int i = 5, j = 0; i > 0; i--, j++){
                System.out.println(i + " " + j);
            }
    }




}

class A {

    static void method(){
        System.out.print("A");
    }

}

class B extends A {
    static void method(){
        System.out.print("B");
    }

}


interface AAA {

    String getType();

      public default String print(){
        return "";
    }
    public static  String bla(){
         return "aaa";
    }

}

interface BBB extends AAA {
    @Override
    default String print() {
        return "bbb";
    }
}

 class BB {

    public void print(){

    };
}

class CC extends BB {

    @Override
    public void print() {

    }
}

class Person {
    Person(String s){
        super();
    }
}


class Employee extends Person{

    Employee(String s) {
        super(null);
        System.out.println(s);
    }

    Employee(){this("Kent");}
}