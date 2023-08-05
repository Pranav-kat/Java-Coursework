package package2;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashmap - Dictionary in Java
		//implement stack using LinkedList - addfirst(push)/removefirst(pop) OR addlast/removelast
		
		//hashing - distributing contents to different location with unique key index; *minimize clustering
		//(key, value) pairs
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "0");
		hm.put(2,"Pranav");
		hm.put(3, "ok");
		hm.put(4, "NULL");
		hm.put(1, "+1"); 
		
		System.out.println(hm);
		
        Map<Character, Integer> map = new HashMap<>();
        //How different is MAP from HashMap.
		
	}

}
