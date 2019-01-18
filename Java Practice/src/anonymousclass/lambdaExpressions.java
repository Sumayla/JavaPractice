package anonymousclass;

public class lambdaExpressions {

	public static void main(String[] args) {
		
		//Lambda exp is just implementation of behaviour which just looks simpler
//The arrow represents lampbda expression
		//parenthesis with no arguements refers to the method in the interface

		
		actionAfterClick1 a = () ->  {
				System.out.println("I am behaviour from interface actionAfterClick1 for buton p ");
			
		};
		
		Buton p = new Buton();
		p.addAction(a);
		
		
		//anonymous class
		Buton p2 = new Buton();
		p2.addAction(new actionAfterClick1() {
			
			@Override
			public void action() {
				System.out.println("I am behaviour from interface actionAfterClick1 for buton p2 ");
			}
		});
		
		
		 actionAfterClick2 a1= (x,y) -> {
			
			System.out.println(x+y);
		};
		
		p.addAction2(10, 16, a1);
	}

}
//only one behaviour per interface

interface actionAfterClick1
{
	void action();
	
}


interface actionAfterClick2
{
	void action2(int x,int y);
	
}
class Buton {
	void addAction(actionAfterClick1 a) {
		a.action();
	}
	
	void addAction2(int l,int q,actionAfterClick2 a1) {
		a1.action2(l, q);
		
	}
}



//even simpler way

/*


package anonymousclass;

public class AnonymousClass 
{

    public static void main(String[] args) 
    {
       ActionAfterClick x = () -> {
           System.out.println("I'm action from anonymous class");
       };
       
       ActionAfterClick2 x2 = (a, b) -> a + b;
       
       Button p = new Button();
       Button p2 = new Button();
       
       p2.addAction(new ActionAfterClick() {

           @Override
           public void action() {
               System.out.println("I'm action from anonymous class for button p2");
           }
       });
       p.addAction(x);
       
       int result =  p.addAction2(10, 15, x2);
       
        System.out.println(result);
    }
    
}

interface ActionAfterClick //REPRESENTS BEHAVIOUR
{
    void action();
}

interface ActionAfterClick2
{
    int action2(int a, int b);
}
class Button 
{
    void addAction(ActionAfterClick a)
    {
        
        a.action();//
    }
    
    int addAction2(int x, int y, ActionAfterClick2 a)
    {
       return a.action2(x, y);
    }
}


*/