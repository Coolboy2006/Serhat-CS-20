package SkillBuilding;
import java.util.*;

public class GradeAVG1 
{

	public static void main(String[] args) 
	{
		Scanner grades= new Scanner(System.in);
		System.out.println("What is your first grade?");
		int grade1= grades.nextInt();
		System.out.println("What is your second grade?");
		int grade2= grades.nextInt();
		System.out.println("What is your third grade?");
		int grade3= grades.nextInt();
		System.out.println("What is your fourth grade?");
		int grade4= grades.nextInt();
		System.out.println("What is your fifth grade?");
		int grade5= grades.nextInt();
		double totalgradeaverage= (grade1 + grade2 + grade3 + grade4 + grade5)/5;
		System.out.print("Your average grade is ");
		System.out.print(totalgradeaverage);
	}

}
