package me.mbcu.practice;

import java.util.ArrayList;

public class Election {

    public static void main(String[] args) {
        int candidates = 100;
        int[] votes = new int[candidates + 1];
        int undecideds = 100;

        int[] speeches = {2,2,2,1, 45, 53, 52, 67, 23, 56, 67, 98, 32, 33, 44, 1, 4, 7, 4, 3, 5, 67, 86,22};

        for (int i = 0; i < speeches.length; i++){

            int cand = speeches[i];
            int newVotes = 0;

            for(int v = 0; v < votes.length; v++){
                if (v != cand && votes[v] > 0 ){
                    votes[v] = votes[v] - 1;
                    newVotes = newVotes + 1;
                }
            }
            if (undecideds > 0 ){
                undecideds = undecideds - 1;
                newVotes = newVotes + 1;
            }
            votes[cand] = votes[cand] + newVotes;
        }

        int maxVotes = 0;
        ArrayList<Integer> winners = new ArrayList<>();


        for(int i = 0; i < votes.length; i++){
            if (i != 0 && votes[i] >= maxVotes){
                maxVotes = votes[i];
            }
        }

        for(int i = 0; i < votes.length; i++) {
            if (i != 0 && votes[i] == maxVotes){
                winners.add(i);
            }
        }


            winners.forEach(System.out::println);

    }




}
