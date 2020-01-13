package me.mbcu.practice;

import java.util.ArrayList;
import java.util.List;

public class IntegerPermutation {

    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        permute(nums, 0, nums.size() -1);
    }

    private static  void permute(List<Integer> nums, int l, int r)
    {
        for (int i = l; i <= r; i++) {
            if ( l == r){
                System.out.println(nums);
            }
            else {
                List<Integer> x = swap(nums, l, i);
                permute(x, l + 1, r);
            }
        }

    }

    public static List<Integer> swap(List<Integer> a, int i, int j) {

        List<Integer> res = new ArrayList<>(a);

        res.set(i, a.get(j));
        res.set(j, a.get(i));
        return res;
    }
}
