package Practice;

public class MaximumDepthOfParanthesis {

	
	
	public static void main(String[] args) {
		System.out.println(maxDepth("(((A)))"));
	}
	
	public static int maxDepth(String input) {
		int max=0;
		int openBracket=0;
		
		for(char c :input.toCharArray()) {
			if(c=='(') {
				openBracket++;
			}else if(c==')') {
				openBracket--;
			}
			
			max=Math.max(max, openBracket);
		}
		return max;
	}
}
