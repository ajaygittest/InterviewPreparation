package Striver;

public class MajorityOfElementBetter {
	
	public static void main(String[] args) {
		 int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		    System.out.println(majority(arr));
	}
	
	
	public static int majority(int [] arr) {
		
		int count=0;
		int el = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(count==0) {
				el=arr[i];
				count=1;
			}else if(el==arr[i]) {
				count++;
			}else {
				count--;
			}
		}
		
		int c1=0;
		for(int j=0; j<arr.length; j++) {
			if(el==arr[j]) {
				c1++;
			}
		}
		if(c1>arr.length/2) {
			return el;
		}
		return -1;
	}

}
