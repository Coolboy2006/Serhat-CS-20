package Mastery;
import java.util.*;


public class Number5 
{

	public static void main(String[] args) 
	{
		Scanner Sa = new Scanner(System.in);
		float money= Sa.nextFloat();
		System.out.println("Enter the change in cents:");
		if (money>1) {
			System.out.println("ERROR! CHANGE CAN'T BE OVER $1.00");
		}
    }

}
