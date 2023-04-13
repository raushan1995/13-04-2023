
import java.io.*;
import java.util.*;
public class SizeOfArray {

	public static void main (String[] args) {
		
		Collection<String> arraylist = new ArrayList<String>();
		
		arraylist.add("Geeks");
		arraylist.add("for");
		arraylist.add("geeks");
		
		// returns the size of the arraylist
		System.out.println("Size of the collection "+arraylist.size());
		
		// Check if list is empty using isEmpty() method
		System.out.println("Is the ArrayList empty: "
						+ arraylist.isEmpty());
	}
}
