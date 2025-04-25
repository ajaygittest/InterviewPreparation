package Practice;

public class removeCharacter {
	
	public static void main(String[] args) {
		System.out.println(skip("aabbadada"));
		
	}
	
	
	public static String skip(String p) {
		if(p.isEmpty()) {
			return "";
		}
		
		char c=p.charAt(0);
		
		if(c=='a') {
			return skip(p.substring(1));
		}else {
			return c+skip(p.substring(1));
		}
	}

}
