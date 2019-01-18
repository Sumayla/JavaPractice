package javaBasics;

public class ForLoop {

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
	        
	        //for (INITILIZATION; CONDITION; THINGS TO DO AFTER EACH ITERATION)
	        for(int i = 0; i < videoCourses.length;  i++) //6
	        {
	            System.out.println(videoCourses[i]); 
	        }
	       
	    }
	    
	}

