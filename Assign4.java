/*
4. Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number
*/

import java.util.*;

class Assign4 {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("To Check if Locker Number is Even or Odd..");
		
		//int n=25;
		System.out.print("Enter locker number : ");
		int num;		
		num=sc.nextInt();
		
		if(num%2==0){
			System.out.println(num + " Locker Number is Even number..");
		}
		
		else{
			System.out.println(num + " Locker Number is Odd number..");
		}
			
	}
	
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign4.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign4
To Check if Locker Number is Even or Odd..
Enter locker number : 50
50 Locker Number is Even number..
*/