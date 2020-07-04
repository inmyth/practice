package me.mbcu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Orange {

    public static void main(String[] args) {
        int res = orangesRotting(new int[][]{{2,0,1,2,1,2}});
        System.out.println(res);
    }

    public static int orangesRotting(int[][] grid) {
        int res = 0;

        int fresh = 0;
        Stack<List<Integer>> rots1 = new Stack<>();
        Stack<List<Integer>> rots2 = new Stack<>();
        Stack<List<Integer>> rots3 = new Stack<>();


        for(int d = 0; d < grid.length; d++){
            for(int r = 0; r < grid[0].length; r++){
                int v = grid[d][r];
                if(v == 2){
                    rots1.push(new ArrayList<Integer>(Arrays.asList(d,r)));
                } else if (v == 1){
                    fresh++;
                }
            }
        }


        while(!rots1.isEmpty() && fresh > 0){

            List<Integer> rot = rots1.pop();
            int d = rot.get(0);
            int r = rot.get(1);

            //up
            rots3.add(new ArrayList<Integer>(Arrays.asList(d - 1, r)));
            //right
            rots3.add(new ArrayList<Integer>(Arrays.asList(d, r + 1)));
            //down
            rots3.add(new ArrayList<Integer>(Arrays.asList(d + 1, r)));
            //left
            rots3.add(new ArrayList<Integer>(Arrays.asList(d, r - 1)));

            while(!rots3.isEmpty()){
                List<Integer> ev = rots3.pop();
                int dn = ev.get(0);
                int rn = ev.get(1);
                if(dn < 0 || rn < 0 || dn >= grid.length || rn >= grid[0].length){
                    continue;
                }
                if(grid[dn][rn] == 1){
                    grid[dn][rn] = 2;
                    rots2.push(new ArrayList<Integer>(Arrays.asList(dn, rn)));
                    fresh--;
                }
            }

            if(rots1.isEmpty()){
                res++;
                Stack<List<Integer>> temp = rots1;
                rots1 = rots2;
                rots2 = temp;
            }
        }

        if(fresh > 0){
            return -1;
        }
        else {
            return res;
        }
    }
}
