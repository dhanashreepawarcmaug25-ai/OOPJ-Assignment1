/*
15. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number
*/
import java.util.Scanner;

public class Assign15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter 4-digit number:");
		n=sc.nextInt();
			
			//ab, cd
			int cd=n%100;
			n/=100;	
			int ab=n;
			
			//a,b
			int a=ab%10;
			ab/=10;
			int b=ab;
			System.out.println(a+" "+b);
			int sum1=a+b;  //a+b	
			
			//c,d
			int c=cd%10;
			cd/=10;
			int d=cd;
			System.out.println(c+" "+d);
			int sum2=c+d;  //c+d
		
		
		if(sum1==sum2){
			System.out.println("Lucky number..");
		}
		else{
			System.out.println("Not a lucky number");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign15.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign15
Enter 4-digit number:1221
2 1
1 2
Lucky number..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign15
Enter 4-digit number:5421
4 5
1 2
Not a lucky number
*/