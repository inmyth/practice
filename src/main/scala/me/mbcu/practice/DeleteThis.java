package me.mbcu.practice;

import java.util.Arrays;

public class DeleteThis {

    public static void main(String[] args) {

        int[] a = {1,2,3};

        for(int i = 0; i < a.length; i++){

            a[i] = a[i] + 1;

        }

        System.out.print(Arrays.toString(a));

    }
}
