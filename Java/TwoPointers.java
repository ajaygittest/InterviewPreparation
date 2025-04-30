package Codings;

public class TwoPointers {

	public static void main(String[] args) {
	System.out.println(twoPointers());

	}
	
	
	public static boolean twoPointers() {
		int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 14;
        int left=0;
        int right=arr.length-1;
        
        while(right>left) {
        	
        	int sum=arr[left]+arr[right];
        	
        	if(sum<target) {
        		left++;
        	}else if(sum==target) {
        		return true;
        	}else {
        		right--;
        	}
        }
        return false;
	}

}
