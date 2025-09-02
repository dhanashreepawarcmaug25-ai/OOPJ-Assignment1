/*
42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. 
Output:
153
370
371
407
*/

import java.util.Scanner;
public class Assign42
{
	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
				
		for(int num=100; num<=500 ;num++)
		{			
			int a = num / 100;        // hundreds
            int b = (num / 10) % 10;  // tens
            int c = num % 10;         // ones

            int sum = (a*a*a) + (b*b*b) + (c*c*c);

            if (sum == num) 
			{
                System.out.println(num);
			}
		}		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign42.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign42
153
370
371
407
*/