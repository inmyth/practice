package me.mbcu.practice;

import java.util.Arrays;

public class Quicksort {


    public static void main(String[] args) {
        int[] a = {1,9,8,4, 72, 34,2,7,6,2};
        rec(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }


// 1,9,8,4,2,7,6,2
    private static void rec(int[] a, int l, int r){
        if(l >= r){
            return;
        }
        int LEFT = l;
        int RIGHT = r;


        swap(a, (l + r) / 2, r);
        int pivot = r;
        r = r - 1;


        while(l <= r){

            while(l <= r){
                if (a[l] >= a[pivot]){
                    break;
                }
                l++;
            }

            while(l <= r){
                if(a[r] < a[pivot]){
                    swap(a, l, r);
                    break;
                }
                r--;
            }
        }
        swap(a, l, pivot); // new pivot is l
        rec(a, LEFT, l-1);
        rec(a, l + 1, RIGHT);
    }

    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
