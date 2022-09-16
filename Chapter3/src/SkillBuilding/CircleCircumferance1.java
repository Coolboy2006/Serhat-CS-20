package SkillBuilding;
import java.text.DecimalFormat;
import java.util.*;

public class CircleCircumferance1 
{

	public static void main(String[] args) 
	{
		Scanner Circle = new Scanner(System.in);
		DecimalFormat sa = new DecimalFormat("0.00");
		System.out.println("What is the radius of the circle");
		double radius= Circle.nextDouble();
		double circumferance = (double) (2*3.141592653*(radius));
		System.out.print("Here is the circumferance of your circle ");
		System.out.print(sa.format(circumferance));	
	}

}
