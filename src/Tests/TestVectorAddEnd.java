package Tests;
import CostumersDS.Costumer;
import CostumersDS.Vector;
public class TestVectorAddEnd {

	//main
	public static void main(String[] args){
		Costumer c1 = new Costumer();
		Costumer c2 = new Costumer();
		
		c1.setName("Jhon");
		c2.setName("James");
	
		Vector list = new Vector();
		list.addCostumer(c1);
		list.addCostumer(c2);
		System.out.println(list);
	
	
	}
}
