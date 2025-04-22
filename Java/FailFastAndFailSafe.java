package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
	
	public static void main(String[] args) {
		 List<String> failSafe = new CopyOnWriteArrayList<>();
		   List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        
	        
	        failSafe.add("Apple");
	        failSafe.add("Banana");
	        failSafe.add("Cherry");

	        Iterator<String> iterator = list.iterator();
	        
	        // Modify the list while iterating
	        list.remove("Banana");  // This is a structural modification
	        failSafe.remove("Apple");

	        // This will throw a ConcurrentModificationException
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	}

}
