package CostumersDS;

import java.util.Arrays;

public class Vector {
// declaring and initializing vector
private Costumer[] costumer = new Costumer[100];
// count Costumers 
private int totalCostumers;



//methods add, remove, 



public void addCostumer(Costumer costumer){
	this.costumer[this.totalCostumers] = costumer;
	this.totalCostumers ++;
}
	public void addCostumer(int position, Costumer costumer ){
		if(!this.chekPosition(position)){
			throw new IllegalArgumentException("Don't have any costumer");
		}
		
		for (int i= this.totalCostumers -1 ; i>= position; i -=1){
			this.costumer [i + 1] = this.costumer[i];
		}
		this.costumer[position] = costumer;
		this.totalCostumers ++;
	}
public Costumer take(int position){
 if(!this.chekPosition(position)){
	 throw new IllegalArgumentException();
 }
	return this.costumer[position]; 
 }




public void remove(int position){
	if (!this.chekPosition(position)){
		throw new IllegalArgumentException();
	}
	for ( int i = position; i < this.totalCostumers -1; i++){
		this.costumer[i] = this.costumer[ i + 1];
		
	}
	this.totalCostumers--;
}
public boolean chekPosition(int position){
	return position >= 0 && position < this.totalCostumers;
}
public boolean contains(Costumer costumer){
	for (int i = 0; i < this.totalCostumers ; i++){
		if(costumer.equals(this.costumer[i])){
			return true;
		}
	}
return false;
}
public int sizeTotal(){
	return this.totalCostumers;
}

public String toString(){
	if (this.totalCostumers == 0){
		return "[]";
	}
	StringBuilder builder = new StringBuilder();
	builder.append("[");
	for (int i =0; i < this.totalCostumers -1; i++){
	builder.append(this.costumer[i]);
	builder.append(", ");
	}
	builder.append("]");
	return builder.toString();
}


}
