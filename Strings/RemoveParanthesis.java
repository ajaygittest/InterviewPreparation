package Preparation;

public class StringStriver {
	
	public static void main(String[] args) {
		
		System.out.println(removeOuterParentheses("(()())(())"));
		
	}
	
	public static String removeOuterParentheses(String s) {

        int count=0;
        StringBuilder output=new StringBuilder();

        for(char c:s.toCharArray()){

            if(c=='('){

                if(count>0){
                    output.append(c);
                }
                count++;

            }else if(c==')'){
                count--;
                if(count>0){
                    output.append(c);
                }
            }
        }
        return output.toString();
    }

}
