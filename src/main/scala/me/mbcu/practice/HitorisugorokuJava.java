package me.mbcu.practice;

import java.util.HashMap;
import java.util.Map;

public class HitorisugorokuJava {

    public static void main(String[] args) {
        Map<Integer, Integer> dMap = new HashMap<>();
        dMap.put(1, 0);
        dMap.put(6, 1);
        dMap.put(2, 2);
        dMap.put(5, 3);
        dMap.put(4, 4);
        dMap.put(3, 5);

        int[] board = {1, 5, 3, 4};

//          Map<Integer, Integer> dMap = new HashMap<>();
//          dMap.put(6, 0);
//          dMap.put(5, 1);
//          dMap.put(4, 2);
//          dMap.put(3, 3);
//          dMap.put(2, 4);
//          dMap.put(1, 5);
//
//
//          int[] board = {6, 2, 1, 3, 4, 3};

        int i = 1;
        int ans = 0;

        while (i < board.length){
            int diceTopNow = dMap.get(board[i]);
            int diceTopPrev = dMap.get(board[i - 1]);

            if ((diceTopNow == 0 && diceTopPrev == 1) || (diceTopNow == 1 && diceTopPrev == 0) ||
                (diceTopNow == 2 && diceTopPrev == 3) || (diceTopNow == 3 && diceTopPrev == 2) ||
                (diceTopNow == 4 && diceTopPrev == 5) || (diceTopNow == 5 && diceTopPrev == 4)
            ){
                ans += 2;
            } else if (diceTopNow == diceTopPrev){
                ans += 0;
            } else {
                ans += 1;
            }
            i++;

        }

        System.out.println(ans);



    }
}
