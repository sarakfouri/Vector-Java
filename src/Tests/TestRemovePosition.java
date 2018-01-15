package Tests;

import CostumersDS.Costumer;
import CostumersDS.Vector;

public class TestRemovePosition {

	public static void main(String[] args){
		Costumer c1 = new Costumer();
		Costumer c2 = new Costumer();
		c1.setName("Mark");
		c2.setName("Mary");
			Vector  list = new Vector();
			
			list.addCostumer(c1);
			list.addCostumer(c2);
			
			list.remove(0);
		System.out.println(list);
	}
}
