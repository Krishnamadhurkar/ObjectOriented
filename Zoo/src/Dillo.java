
public class Dillo extends AbsAnimal {//implements IAnimal {

	//Parameters
	
	//int length; 
	boolean isDead;
	
	//Constructor
	Dillo (int length, boolean isDead){
		//this.length = length; 
		super(length);
		this.isDead = isDead;
	}
	
	//Methods 
	
//can shelter
	public boolean canShelter(Dillo aDillo) {
		return this.length < aDillo.length;
	}
//length below
	public boolean lengthBelow(int size) {
		return this.length < size;
	}
//isShorterThan
	public boolean isShorterThan(int size) {
		return this.length < size;
	}

	
	
	
	
	
	
	
	
	
}
