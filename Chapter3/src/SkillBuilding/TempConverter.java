package SkillBuilding;
import java.text.DecimalFormat;
import java.util.*;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		Scanner Temp = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.0");// This allows the program to round to whatever decimal place I want //
		System.out.println("What is your temperature in degrees Fahrenheit");
		double Temperature= Temp.nextFloat();
		double Tempr= (0.555*(Temperature-32));
		System.out.print("Your temperature in degrees Celsius is  ");
		System.out.print(dc.format(Tempr));

	}

}
