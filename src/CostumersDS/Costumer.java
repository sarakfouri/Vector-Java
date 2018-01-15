package CostumersDS;

public class Costumer {
//fields
	private String name;
//getter and setters
	public String getName(){
		return name;
 	}
public void setName(String name){
	this.name = name;
}
// method toString and boolean equals
public String toString(){
	return this.name;
}
public boolean equals(Object o){
	Costumer another = (Costumer)o;
	return this.name.equals(another.name);
}






}
