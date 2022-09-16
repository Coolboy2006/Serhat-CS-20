package SkillBuilding;
import java. util.*;

public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner num= new Scanner(System.in);
		System.out.println("What is your two-digit number");
     	int numbers= num.nextInt();
     	System.out.println("This is your ones digit");
     	int firstDigit= numbers %10;
     	System.out.println(firstDigit);
     	System.out.println("This is your tens digit");
        int secondDigit= numbers /10;
        System.out.println(secondDigit);	
	}

}
