package Wissen;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {

	
	public static void main(String[] args) {
	     int[][] inputMatrix = {
	             {1, 2, 3, 4, 5},
	             {6, 7, 8, 9, 10},
	             {11, 12, 13, 14, 15},
	             {16, 17, 18, 19, 20}
	         };
	     System.out.println(spiralTraversal(inputMatrix));
	}
	
	public static List<Integer> spiralTraversal(int[][] arr){
		
		List<Integer> list= new ArrayList<>();
		
		int top=0;
		int left=0;
		int bottom=arr.length-1;
		int right=arr[0].length-1;
		
		while(top<=bottom && left<=right) {
			
			
			for(int i=left; i<=right; i++) {
				list.add(arr[top][i]);
			}
			top++;
			
			for(int i=top; i<=bottom; i++) {
				list.add(arr[i][right]);
			}
			right--;
			
			if(left<=right) {
				
				for(int i=bottom; i>=top; i--) {
					list.add(arr[i][left]);
				}
				left++;
			}
			
			if(top<=bottom) {
				for(int i=left; i>=right; i--) {
					list.add(arr[bottom][i]);
				}
				bottom--;
			}
			
		}
		return list;
	}
}
