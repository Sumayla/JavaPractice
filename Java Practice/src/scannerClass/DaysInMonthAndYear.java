package scannerClass;

import java.util.Scanner;

public class DaysInMonthAndYear {

	public static void main(String[] strings) {

		
		/*
		 * Write a Java function with 2 arguments representing month and year to return the number of days in the given month and year.
		 *  If the month is invalid return -1 and if the year is invalid (year<=0) return -2. ## Example  Input:   2 2013  Output:   28
		 */
		
		boolean flag= true;
		
        Scanner input = new Scanner(System.in);

        int DaysInMonth = 0; 
        String MonthName = "";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();
        


        switch (month) {

        	
        
            case 1:
            	MonthName = "January";
                DaysInMonth = 31;
                break;
            case 2:
            	MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                	DaysInMonth = 29;
                	
                } else {
                	DaysInMonth = 28;
                }
                break;
            case 3:
            	MonthName = "March";
            	DaysInMonth = 31;
                break;
            case 4:
            	MonthName = "April";
            	DaysInMonth = 30;
                break;
            case 5:
            	MonthName = "May";
            	DaysInMonth = 31;
                break;
            case 6:
            	MonthName = "June";
            	DaysInMonth = 30;
                break;
            case 7:
            	MonthName = "July";
            	DaysInMonth = 31;
                break;
            case 8:
            	MonthName = "August";
            	DaysInMonth = 31;
                break;
            case 9:
            	MonthName = "September";
            	DaysInMonth = 30;
                break;
            case 10:
            	MonthName = "October";
            	DaysInMonth = 31;
                break;
            case 11:
            	MonthName = "November";
            	DaysInMonth = 30;
                break;
            case 12:
            	MonthName = "December";
            	DaysInMonth = 31;
            	
              
                    
                    
            	
        }
       
        
       
        if(month<=0||month>12)
            System.out.println(-1); 
            else if (year<=0)
            	System.out.println(-2); 
        
        
        
        System.out.print(DaysInMonth + " " + year + " has " + DaysInMonth + " days\n");
        
    }
	
}



