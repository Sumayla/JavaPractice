package anonymousclass;

public class AnonymousClass {

	public static void main(String[] args) {
		
		ActionAfterClick a = new ActionAfterClick() {
			
			@Override
			public void action() {
				
				System.out.println("I am behaviour from interface actionAfterClick for buton p ");
				
			}
		};
		
		
		Button p = new Button();
		Button p2 = new Button();
		Button p3= new Button();
		
		p.addAction(a);
		
		
		p2.addAction(new ActionAfterClick() {
			
			@Override
			public void action() {
				
				System.out.println("I am behaviour from interface actionAfterClick for buton p2");
				
			}
		});
		
		
		
				
		
	}

}


interface ActionAfterClick{
	
	void action();
	
	
	
}

class Button {
	void addAction(ActionAfterClick a) {
		
		a.action();
		
	}
}