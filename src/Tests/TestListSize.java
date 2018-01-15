package Tests;
import CostumersDS.Costumer;
import CostumersDS.Vector;

public class TestListSize {

	public static void main(String arg[]){
		Costumer c1 = new Costumer();
		Costumer c2 = new Costumer();
		Costumer c3 = new Costumer();
		
		c1.setName("John");
		c2.setName("Jonas");
		
		Vector list = new Vector();
		
		list.addCostumer(c1);
		list.addCostumer(c2);
		
		System.out.println(list.sizeTotal());
		
		c3.setName("Sophia");
		list.addCostumer(c3);
		
		System.out.println(list.sizeTotal());
		
		
		
	}
	
	
	
}
