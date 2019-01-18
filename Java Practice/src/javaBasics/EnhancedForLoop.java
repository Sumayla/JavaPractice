package javaBasics;

public class EnhancedForLoop {

	public static void main(String[] args) {
		 String[] videoCourses = 
		        {
		            "C++", 
		            "C++ operating on files", 
		            "Java",    
		            "Java Android",
		            "JavaScript",
		            "Grunt.js",
		            "SASS"
		        };
		 
		 for(String myvalue:videoCourses) {
			 
			 System.out.println(myvalue);
		 }
	}

}
