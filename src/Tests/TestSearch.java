package Tests;

import CostumersDS.Costumer;
import CostumersDS.Vector;

public class TestSearch {

	public static void main (String[] args){
		Costumer c1 = new Costumer();
		Costumer c2 = new Costumer();
		c1.setName("Mary");
		c2.setName("John");
		
		Vector list = new Vector();
		list.addCostumer(c1);
		list.addCostumer(c2);
System.out.println(list.contains(c1));
System.out.println(list.contains(c2));

Costumer c3 = new Costumer();
c3.setName("James");
System.out.println(list.contains(c3));

	
	}
}
