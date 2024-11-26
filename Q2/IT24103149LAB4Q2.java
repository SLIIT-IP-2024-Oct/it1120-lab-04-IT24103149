import java.util.Scanner;
		
public class IT24103149LAB4Q2
{
	public static void main(String[]args)
{
	//declare variables
	double exmMrks,labMrks,exmPer,labPer,finalMrks;
	
	//create an object called input to Scanner class
	Scanner input = new Scanner(System.in);

	//Take input from user
	System.out.println("Please enter exam marks(out of 100): ");
	exmMrks = input.nextDouble();

	if (exmMrks<0 || exmMrks>100)
{		
	System.out.println("Invalid input for exam marks. Terminating program.");
	
	return;
}
	
	System.out.println("Please enter lab submission marks(out of 100): ");
	labMrks = input.nextDouble();
	
	if (labMrks<0 || labMrks>100)
{		
	System.out.println("Invalid input for lab submission marks. Terminating program.");
	
	return;
}
	
	System.out.println("Please enter the percentage given for the exam: ");
	exmPer = input.nextDouble();

	System.out.println("Please enter the percentage given for the lab submission: ");
	labPer = input.nextDouble();

	if (exmPer+labPer != 100)
{		
	System.out.println("The percentages must add up to 100. Terminating program.");
	return;
}
	//calculations
	finalMrks = (exmMrks * exmPer/100) + (labMrks * labPer/100);
	
	//display the output
	System.out.println("Final Exam Mark is : " +finalMrks);
		
	}
}