package com.chuba.training.arrays;

import java.util.Arrays;
//array = [3, 5, 1, -1, -4, 8, 6, 11] length is 8
//[-4,-1,1,3, 5, 6, 8, 11] sorted array

public class TwoNumberSum3 {
	public static int[] twoNumberSum(int[] array, int targetSum) {
	    Arrays.sort(array);
	    int left = 0;
	    int right = array.length - 1;
	    
	    while (left < right) {
	      int currentSum = array[left] + array[right];
	      System.out.println(array[left] + "+" + array[right] +" = " + currentSum);
	      
	      if (currentSum == targetSum) {
	        return new int[] {array[left], array[right]};
	      } else if (currentSum < targetSum) {
	        left++;
	      } else if (currentSum > targetSum) {
	        right--;
	      }
	    }
	    return new int[0];
	  }

}
