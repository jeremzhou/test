/**
 * created on 2017年12月7日 下午6:12:45
 */
package com.utstart;

/**
 * @author BenQ
 * @date 2017年12月7日
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] src = new int[] {1,3,5,7,9};
		System.out.println(binarySearch(src,7));
	}
	
	public static int binarySearch(int[] srcArray,int des) {
		int low=0;
		int high=srcArray.length-1;
		while(low <= high) {
//			int middle =(low + high)/2;
			int middle =low + (high-low)/2;
			if(des == srcArray[middle]) {
				return middle;
			}else if(des <srcArray[middle]) {
				high=middle -1;
			}else {
				low=middle +1;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int [] dataset,int data,int beginIndex,int endIndex) {
		int midIndex=(beginIndex+endIndex)/2;
		if(data<dataset[beginIndex] || data>dataset[endIndex] || beginIndex>endIndex) {
			return -1;
		}if(data<dataset[midIndex]) {
			return binarySearch(dataset,data,beginIndex,midIndex-1);
		}else if (data>dataset[midIndex]) {
			return binarySearch(dataset,data,midIndex+1,endIndex);
		}else {
			return midIndex;
		}
		
	}

}
