package MathDsa;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=40;
		int p=4; // how many decimal value i want
		
		System.out.println(sqrt(25,p));
		System.out.println(Math.sqrt(25));

	}
	
	
	public  static double sqrt(int n, int p) {
		double root=0.0;
		
		int start=0;
		int end=n;
		
		while(start<=end) {
			int m=start+(end-start)/2;
			if(m*m==n) {
				return m;
			}else if(m*m>n) {
				end=m-1;
			}else {
				start=m+1;
			}
		}
		
		double incr=0.1;
		
		for(int i=0; i<=p; i++) {
			
			while(root*root <=n) {
				root+=incr;
			}
			
			root-=incr;
			incr /=10;
		}
		return root;
		
		
		
	}

}
