import java.util.Scanner;

public class IT24103149LAB4Q1
{
	public static void main(String[]args)
{
	//declare variable
	double digit;
			
	//create an object called input to scanner class
	Scanner input = new Scanner(System.in);
	
	//take a digit input from user
	System.out.println("Enter a number: ");
	digit = input.nextDouble();
		
	//conditions
	if (digit>0)
{		
	System.out.println("The number is: Positive.");
}
	else if (digit<0)
{
	System.out.println("The number is: Negative.");
}	
	else
{	
	System.out.println("The number is Zero");
}
	
	}
}