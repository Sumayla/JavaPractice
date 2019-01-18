package javaBasics;

public class OopsBasics {

	public static void main(String[] args) {
		
		Monitor monitor1 = new Monitor();
		monitor1.width=100;
		
		
		
		Monitor monitor2 = new Monitor();
		monitor2.width=500;
		
		
		
		monitor1.getWidth();
		monitor2.getWidth();

		
		
		String name ="Adnan";
				System.out.println(name.charAt(4));
		
		
		
	}
}

	
	class Monitor{
		
		int width =1000;
		int height;
		int brightness;
		
		void changeBrightness() {
			
		}
		
	void getWidth() {
			
			System.out.println(width);
		}
	}

