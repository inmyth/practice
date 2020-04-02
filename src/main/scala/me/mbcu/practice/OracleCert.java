package me.mbcu.practice;

import java.io.FileNotFoundException;
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
    static int y = 10;
    int yy;



    public static void ae() throws FileNotFoundException {System.out.println("Writing code");}

    public static void write(){System.out.println("Writing code");}
        static Integer in;

    public static void main(String[] args) {
        int i = 3, j =2;
        System.out.println(i-- + --j);

        A xx = new B();
        xx.method();

        System.out.println(new OracleCert().yy);

        System.out.println(div(20,2));
        int in =6;
        nom(in);
        System.out.println(in);

        int[] ar= {1,2,3};
        cha(ar);
        System.out.println(Arrays.toString(ar));
    }

    static double div(int i, int j){
        return i/j;
    }

    static void nom(int i){
        i = 2;
    }

    static void cha(int[] i){
        i[0] = 2;
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

abstract interface BBB extends AAA {
    static final int a = 1;

    @Override
    default String print() {
        return "bbb";
    }
}

 class BB {

    public void print(){

    };

     int  other(){
        return 1;
    }
}

class CC extends BB {

    @Override
    public void print() {

    }

    @Override
    int other(){
        return 2;
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