package genericType;

public class WildCard {

	
	//wildcard ? restrict what parameter can be used in generic type
	public static void main(String[] args) {
		
		Shelf<String> s = new Shelf<>();
		Shelf<Employe> s1 = new Shelf<>();
		Shelf<Object> s2 = new Shelf<>();
		
		processingShelf.processShelf(s2);//you can send s2 here ,since its for objects but you cant send s1 here since its for employees or s 
		//coz the types are wrong
		
	processingShelf.processShelf(s1);//it will work since u used the wild card in the method 
		
		
		
		
	//since superemployee extends employee uu can also use this
			//	static void processShelf(Shelf<? extends Employee > shelf) 
	Shelf<SuperEmployee> s4 = new Shelf<>();

	}

}
//now when you wanna send these boxes for processing somewhere


class processingShelf{
	
	//static void processShelf(Shelf<Object> shelf) 
	
	
	//so if you wanna process more than generic type with different parameters but with the same name of clas
	//then you use wildcard
	static void processShelf(Shelf<?> shelf) {
		//by default every class extends object so ? extends object so you can also write
		//static void processShelf(Shelf<? extends Object> shelf)
		
	}
	
	
}
class Employe{
	
}

class SuperEmployee extends Employe{
	
}

class Shelf<T>{
	T element;
	
	
	void setElement(T valueOfElement) {
		this.element= valueOfElement;
	}
	
	T getElement() {
		return this.element;
		
	}
}
