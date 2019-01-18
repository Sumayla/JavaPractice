package newPackage;

import videoCourses.Test;
//import videoCourses.*;
import videoCourses.VideoCourses;


public class NewClass {

	public static void main(String[] args) {
		
		VideoCourses v = new VideoCourses();
		//cant access  int a of Test class here since it has a default modifier
		
		Test t = new Test();
		
		
	}

}
