package sampleProject;

import java.util.Scanner;

public class SampleProject
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //you define input object

        System.out.println("Please enter your name : ");//show message to the user
        String name = input.next(); // getting a String value
        System.out.println("Your name is: " + name );

        System.out.println("Please enter your age : ");
        int age = input.nextInt(); // getting an integer
        System.out.println("Your age is: " + age);

        System.out.println("Please enter your salary : ");
        double salary = input.nextDouble(); // getting a double
        System.out.println("Your name is: " + salary );
    }
    
}
