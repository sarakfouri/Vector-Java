package Tests;
import CostumersDS.Costumer;
import CostumersDS.Vector;

public class TestTakePosition {
public static void main(String[] args){
	Costumer c1 = new Costumer();
	Costumer c2= new Costumer();
	c1.setName("James");
	c2.setName("Sophia");
	Vector list = new Vector();
	
	Costumer c3 = list.take(0);
	Costumer c4 = list.take(1);
	
	System.out.println(c3);
	System.out.println(c4);
	
}
}
