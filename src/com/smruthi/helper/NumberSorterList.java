package com.smruthi.helper;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	
	public class NumberSorterList {


	
		public static void main(String[] args) {
			//Assume a list has 5 integer in some order
			//sort this list
				//we will we will iterate over the integers in the list to identify smallest
				//take that out of the list and add it to a new list
				//continue doing this until first list is exhausted
			
			
			List<Integer> myOriginalArray = new ArrayList<Integer>();
			List<Integer> mySortedArray = new ArrayList<Integer>();

			myOriginalArray.add(6);
			myOriginalArray.add(8);
			myOriginalArray.add(3);
			myOriginalArray.add(5);
			myOriginalArray.add(4);

			
			
			

			while(myOriginalArray.size()>=1) {
				Integer xSmallest = myOriginalArray.get(0);
				int s = 0;
				for (int i = 0; i < myOriginalArray.size(); i ++) {
					if(myOriginalArray.get(i) < xSmallest) {
						xSmallest = myOriginalArray.get(i);
						s = i;
					} 

				}
				
				myOriginalArray.remove(s);
				mySortedArray.add(xSmallest);
			}

			for (Iterator iterator = mySortedArray.iterator(); iterator.hasNext();) {
				Integer sortedInt = (Integer) iterator.next();
				System.out.println(sortedInt);
			}
						
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
