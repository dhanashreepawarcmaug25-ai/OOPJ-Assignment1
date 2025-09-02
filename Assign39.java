/*
39. Bonus Eligibility (Ternary)
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print
bonus eligibility using ternary.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus: 2500

*/

import java.util.Scanner;
public class Assign39
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int sal,n;
		System.out.print("Enter salary: ");
		sal=sc.nextInt();
		System.out.print("Enter years of service: ");
		n=sc.nextInt();
		
		String str= (n>5) ? ("Bonus: " + sal*0.05) : "No Bonus";
				  
		System.out.println(str);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign39
Enter salary: 50000
Enter years of service: 6
Bonus: 2500.0

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign39
Enter salary: 80000
Enter years of service: 10
Bonus: 4000.0
*/