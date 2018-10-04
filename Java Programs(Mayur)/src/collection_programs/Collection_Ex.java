package collection_programs;

import java.util.*;

public class Collection_Ex {

	public static void main(String[] args) 
	{
		Collection<String> c=new ArrayList<>();
		c.add("Hello");
		c.add("\tMayur");
		
		Iterator<String> i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next());
		}	
		
	}

}
