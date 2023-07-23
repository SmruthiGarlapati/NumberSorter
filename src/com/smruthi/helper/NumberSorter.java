package com.smruthi.helper;

//import java.util.ArrayList;

public class NumberSorter {

	
	
	public static void main(String[] args) {
		//Assume a list has 5 integer in some order
		//sort this list
			//we will we will iterate over the integers in the list to identify smallest
			//take that out of the list and add it to a new list
			//continue doing this until first list is exhausted
		int[] myOriginalArray = new int[] {6,8,3,5,4};
		
		
		
		int[] mySortedArray = new int[5];
		int xSmallest = myOriginalArray[0];
		int s = 0;
		int k = 0;

		while(myOriginalArray.length>1) {
			
			for (int i = 0; i < myOriginalArray.length-1; i ++) {
				if (xSmallest > myOriginalArray[i+1]) {
					xSmallest = myOriginalArray[i+1];
					s = i+1;
					} //if
				
				} //for
			myOriginalArray = removeArrayElement(myOriginalArray, s);
			mySortedArray[k++] = xSmallest;
		}

		
		
		System.out.println(mySortedArray[0]);
		
	}
	
	public static  int[] removeArrayElement(int[] ArrayOne, int index) {
		
		int[] modifiedArray = new int[ArrayOne.length-1];
		int i = 0;
		int j = 0;
		for ( i = 0; i < ArrayOne.length; i++) {
			if (i != index) {
				modifiedArray[j] = ArrayOne[i];
				j++;
			}
			
		}
		
		return modifiedArray;
		
		
	}

}
