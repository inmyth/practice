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

        short ba = 3;
        if (ba == 3){
            System.out.println("a");
        }

        char[] ch = new char[2];
        ch[0] = 1;

        final int xx = 1;
//        xx += 5;
        System.out.println("a" + 9 + 3);
        switch (in){
            case xx + 1:
        }

        System.out.println(Period.ofMonths(13).normalized());
        Writer w = new OracleCert();
        w.write();
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "a";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(s2);
        System.out.println(foundAt);

        switch (s2){
            case "a": System.out.println("a");
            default: System.out.println("b");
            case "A": System.out.println("x");
        }

        LocalDate ld = LocalDate.of(2012,2,2);
        Period period = Period.ofDays(1);
        System.out.println(ld.plus(period));

        Runnable run = () -> System.out.println("aaa");
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("coke");
        arrayList.add("pepsi");
        arrayList.add("miranda");
        String[] ws1 = new String[arrayList.size()];
        String[] ws2 = arrayList.toArray(ws1);
        System.out.println(Arrays.toString(ws1));
        System.out.println(Arrays.toString(ws2));
        ws1 = new String[1];
        ws1[0] = "Test data";
        ws2 = arrayList.toArray(ws1);
        System.out.println(Arrays.toString(ws1));
        System.out.println(Arrays.toString(ws2));

        int x = 0;


        String r = "aaa";
        String p = new String("aaa");
            x =5 ;
            --x;
        System.out.println( x);
        System.out.println(AAA.bla());

//        BB bb = new BB();
//        BB cc = (CC)bb;

        String s = "bbb";
        change(s);
        System.out.println(s);

        char c = 'c';
//        change(c);

        char a = changes((char) 71);
        System.out.println(a);
    }

    static void change(String s){
        s = "aaa";
    }

//    static int change(int i){
//        return i + 10;
//    }

    static char changes(char i){
        return i;
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