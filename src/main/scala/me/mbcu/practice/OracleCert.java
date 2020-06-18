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

    public static void ae()  {
    }

    public static void write(){System.out.println("Writing code");}
        static Integer in;
    public static void main(String args[]) {

       int[] a = new int[-1];
    }
    static void inc(char c){

    }

    static void inc2(int a){}

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

class A implements AAA {

    public static int aint = 0;

    A( ){
        System.out.println("Constructor A");
    }

      void method() throws  FileNotFoundException{
        System.out.print("A");
    }

    static {System.out.println("Class A");}

    @Override
    public String getType() {
        return null;
    }

    protected Object bla(){
        return new Object();
    }

    @Override
    public void par() {
        System.out.println("aa");
    }

    @Override
    public void priv() {

    }

    ;

}

class B extends A implements AAA, ZZZ{

    B(){
        super();
    }
     void method(){
        System.out.print("B");

        System.out.println(print());
        defA();
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String print() {
        return null;
    }


    @Override
    public void par() {
        System.out.println("bb");

    }

    @Override
    public void priv() {

    }

    @Override
    public String bla(){
        return new String();
    }


}


interface AAA {

    String getType();

    public default String print(){
        return "default method AAA";
    }

    public default void defA(){
    }

    public static  String bla(){
         return "aaa";
    }

    public void par();

    public void priv();

}

interface ZZZ {
    public default String print(){
        return "default method BBB";
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

