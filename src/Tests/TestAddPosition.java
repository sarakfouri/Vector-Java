package Tests;


import CostumersDS.Vector;
import CostumersDS.Costumer;

public class TestAddPosition {
 public static void main(String[] args){
	 Costumer c1 = new Costumer();
	 Costumer c2 = new Costumer();
	 Costumer c3 = new Costumer();
	 
	 c1.setName("Raphael");
	 c2.setName("Paul");
	 c3.setName("Anne");
	
	 Vector list = new Vector();
	 
	 list.addCostumer(c1);
	 list.addCostumer(0,c2);
	 list.addCostumer(1, c3);
	 System.out.println(list);
 }
	
	
	
	
	
}
