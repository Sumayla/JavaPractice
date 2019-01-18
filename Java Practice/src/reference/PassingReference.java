package reference;

public class PassingReference {

	public static void main(String[] args) {
		
		int a=10;
		
		Test1 test= new Test1();
		
		test.changeValue(a);
		System.out.println(a);
		//value would still be 10 since we are passing a as an arguement to the parameter var
		//if we want 15 to be printed ,we have return something from the changeValue method and assign the result to what was changed
		
		Foo foo = new Foo();
		test.changeFoo(foo);//we are sending address as an arguement
		System.out.println(foo.x);
		

	}

}

class Test1{
	
	void changeValue(int var) {
		var = var+5;
		
		
	}
	
	void changeFoo(Foo var)//we are changing value under the address foo
	{
		var.x= var.x+10;
		
		
		
	}
}

class Foo{
	
	int x= 10;
	
}
