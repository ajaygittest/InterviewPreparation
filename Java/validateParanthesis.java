package Codings;

import java.util.Stack;

public class validateParanthesis {
	
	public static void main(String[] args) {
		String s = "([{}])";
        System.out.println(validate(s));
	}
	
	
	public static boolean validate(String s) {
		
		char[] valid=s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c: valid) {
			
			if(c=='(' || c=='{' || c=='[') {
				stack.add(c);
			}
			else if(c==')' && stack.peek()=='(') {
				stack.pop();
				
			}
			else if(c=='}' && stack.peek()=='{') {
				stack.pop();
				
			}
			else if(c==']' && stack.peek()=='[') {
				stack.pop();
				
			}else {
				return false;
			}
			
		}
		return stack.isEmpty();
	}

}
