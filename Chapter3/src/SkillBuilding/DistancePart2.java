package SkillBuilding;
import java.util.*;

public class DistancePart2 
{

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Input first segment");
		double Segment1 = S.nextDouble();
		System.out.println("Input second segment");
		double Segment2= S.nextDouble();
		System.out.println("Input third segment");
		double Segment3= S.nextDouble();
		double total= Segment1 + Segment2+ Segment3;
		System.out.print("Here is the total distance traveled:  ");
		System.out.print(total);

	}

}
