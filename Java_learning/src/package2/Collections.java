package package2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collections {
public static void main(String[] args) {
	//--------------ArrayList-----------------\\
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Sec0");	al.add("Sec1");	al.add("Sec2");	al.add(2, "Second");  // appending the data
	
	//al.clear(); //empties entire array
	
	//al.remove("Sec0");
	
	System.out.println(al);
	
	System.out.println(al.get(3)); 
	
	System.out.println(al.indexOf("Sec1"));
	//--------------LinkedList-----------------\\
	LinkedList<String> ll = new LinkedList<String>();
	
	ll.add("lol");
	ll.addFirst("Jello"); //removeFirst  //getFirst   //pollFirst
	ll.addLast("Despo");  //removeLast   //getLast    //pollLast
	 
	ll.addAll(ll);
	System.out.println(ll);
	System.out.println(ll.element());// returns the first element in the list
	System.out.println(ll.get(4));   //lol
	System.out.println(ll.peek());   //Jello
    System.out.println(ll.poll());   //Jello + Jello removed from the list
    System.out.println(ll);
	
	//--------------Iterator-----------------\\
	Iterator<String> it = ll.iterator();

    System.out.println(it.next());
    System.out.println(it.hasNext());
    
    Iterator<String> itrev = ll.descendingIterator();     // --- Reverse Iterator
    
    System.out.println(itrev.next());
	
  //--------------ListIterator-----------------\\
    ListIterator<String> li = ll.listIterator(5);
    System.out.println(li.previous());  // same as Iterator + "previous"
    
    
}
}
