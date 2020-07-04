package me.mbcu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JavaScratch {


    public static void main(String[] args) {
        int[][] matrix = {{ 5, 1, 9,11},  { 2, 4, 8,10},  {13, 3, 6, 7},  {15,14,12,16}};

        for(int N = 0; N < matrix.length /2; N++){
            int L = matrix.length - 1 - N;
            for(int i = N; i < L; i++){
                int temp = matrix[i][L];
                matrix[i][L] = matrix[N][i];

                int temp2 = matrix[L][L - i];
                matrix[L][L - i] = temp;

                matrix[N][i] = matrix[L - i][N];
                matrix[L - i][N] = temp2;
            }
        }

        /*
                for(int N = 0; N < matrix.length /2; N++){
            int L = matrix.length - 1 - N;
            for(int i = N; i < L; i++){
                int temp = matrix[i][L - N];
                matrix[i][L - N] = matrix[N][i];

                int temp2 = matrix[L - N][L - i];
                matrix[L - N][L - i] = temp;

                matrix[N][i] = matrix[L - i][N];
                matrix[L - i][N] = temp2;
            }
        }
         */


    }




}
