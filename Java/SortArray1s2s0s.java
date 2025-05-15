package MathDsa;

import java.util.Arrays;

public class SortArray1s2s0s {
	
	public static void main(String[] args) {
	int[] arr= {1,2,0,0,2,0,1,1,1,2,2,2};
		System.out.println(Arrays.toString(sortArray(arr)));
	}
	
	
	public static int[] sortArray(int[] arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
				swap(arr,low,mid);
				mid++;
				low++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				swap(arr,mid,high);
				high--;
			}
			
		}
		return arr;
	}
	
	public static void swap(int[] arr, int i,int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
