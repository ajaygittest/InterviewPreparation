package Codings;

public class MajorityOfElement {
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static int majorityElement(int[] arr) {
		int n=arr.length;
		int c=0;
		int ele=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(c==0) {
				c=1;
				ele=arr[i];
			}else if(ele==arr[i]) {
				c++;
			}else {
				c--;
			}
		}
		
		int c1=0;
		
		for(int num:arr) {
			if(num==ele) {
				c1++;
			}
		}
		if(c1>n/2) {
			return c1;
		}else {
			return -1;
		}
	}

}
