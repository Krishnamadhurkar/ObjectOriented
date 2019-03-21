
public class Boa extends AbsAnimal implements IStatus{// implements IAnimal {
	// Parameters 
	String name;
	int length;
	String eats; 
	
	// Constructor 
	Boa (String name, int length, String eats){
		super(length);
		this.name = name;
		this.eats = eats; 
	}
	
	//methods
	
	//likesSameFood
	public boolean likesSameFood(Boa aboa) {
		return this.eats.equals(aboa.eats);
	}
	//lengthBelow
	public boolean lengthBelow(int size) {
		return this.length < size;
	}
	//isShorterThan
	public boolean isShorterThan(int size) {
		return this.length < size;
	}

	public boolean isWorthStealing() {
		return false;
	}








}
