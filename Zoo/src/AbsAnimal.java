// we use implements when we want two classes to implement a method in its wn different ways
// where as we use an abstract class when 2 classes both implement a method in the same way 
public abstract class AbsAnimal extends AbsLifeForm implements IAnimal{
	
	// we use abstract to make sure we cant make instances for such a class i.e we are creating an abstract entity 
	int length;

	public AbsAnimal(int length) {
		this.length = length;
	}
		
//	public boolean isShorterThan(int size) {
//		System.out.println(getNumberFour());
//		return this.length < size;
//	}
		
	public int getNumberFour() {
		return 4;
	}
	
	
}
