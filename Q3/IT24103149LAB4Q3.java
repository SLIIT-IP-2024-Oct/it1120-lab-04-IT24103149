import java.util.Scanner;

public class IT24103149LAB4Q3
{
	public static void main(String[]args)
{
	//declare variable
	double digit;
	String output;
			
	//create an object called input to scanner class
	Scanner input = new Scanner(System.in);
	
	//take a digit input from user
	System.out.println("Enter a number: ");
	digit = input.nextDouble();
		
	//conditions with ternary operator
	output = (digit>0)? "The number is: positive." :
		 (digit<0)? "The number is: negative." :
		 "The number is Zero.";
	
	//display result
	System.out.println(output);

	}
}