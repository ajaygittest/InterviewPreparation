package Practice;

public class LargetElement {

	
	
	public static void main(String[] args) {
		System.out.println(reverseWords("welcome to the jungle"));
	}
	
	
	  public static String reverseWords(String s) {

	        String[] values=s.split(" ");
	        String output="";
	        for(int i=values.length-1; i>=0; i--){
	           output=output+values[i]+" ";
	        }
	        return output.trim();
	        
	    }
}
