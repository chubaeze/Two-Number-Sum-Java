package com.chuba.training.arrays;

import java.util.*;
//array = [3, 5, 1, -1, -4, 8, 6, 11] length is 8

public class TwoNumberSum2 {
	public static int[] twoNumberSum(int[] array, int targetSum) {
	    Set<Integer> nums = new HashSet<>();
	    
	    for (int x : array) {
	      int y = targetSum - x;
	      System.out.println(y);
	      if (nums.contains(y)) {
	        return new int[] {y, x};
	      } else {
	        nums.add(x);
	      }
	    }
	    return new int[0];
	  }
}
