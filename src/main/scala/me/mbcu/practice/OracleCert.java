package me.mbcu.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
//    static int y = 10;
    int yy;
       static Integer va;


    public static void ae() throws NullPointerException {
        throw new NullPointerException();
    }

    public static void write(){System.out.println("Writing code");}
        static Integer in;
    public static void main(String args[]) {

        String[] a = {"A", "a", "3", "$", "."};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int[] aaa= new int[0];

        StringBuilder sb = new StringBuilder("Whiz");
        sb.delete(5,7);
        System.out.println(sb);

    }

    static void dob(Double s){

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

    A( ){
        System.out.println("Constructor A");
    }

     void method() throws  IOException{
        System.out.print("A");
    }

}

class B extends A {

    B(){
        super();
    }
     void method() throws FileNotFoundException{
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

    public void par();

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

     int  other() throws Exception{
        return 1;
    }
}

class CC extends BB {

    @Override
    public void print() {

    }

    @Override
    int other() throws FileNotFoundException{
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

