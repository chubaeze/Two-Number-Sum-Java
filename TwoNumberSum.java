package com.chuba.training.arrays;

public class TwoNumberSum {
//array = [3, 5, 1, -1, -4, 8, 6, 11] length is 8
	public static int[] twoNumberSum(int[] array, int targetSum) {
	    for (int i = 0; i < array.length - 1; i++) {
	      int firstNum = array[i];
	      for (int j = i + 1; j < array.length; j++) {
	        int secondNum = array[j];
	        System.out.println(firstNum + secondNum);
	        if (firstNum + secondNum == targetSum) {
	          return new int[] {firstNum, secondNum};
	        }
	      }
	    }
	    return new int[0];
	  }

	
	
}
