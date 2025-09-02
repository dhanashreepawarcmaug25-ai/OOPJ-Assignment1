/*
12. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3

*/

import java.util.Scanner;

public class Assign12
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Enter age of Friend 1:");
		a=sc.nextInt();
		System.out.print("Enter age of Friend 2:");
		b=sc.nextInt();
		System.out.print("Enter age of Friend 3:");
		c=sc.nextInt();
		
		// Find youngest
        if(a < b && a < c) {
            System.out.println("Friend 1 is youngest");
        } 
		else if(b < a && b < c) {
            System.out.println("Friend 2 is youngest");
        } 
		else if(c < a && c < b) {
            System.out.println("Friend 3 is youngest");
        } 
		else {
            System.out.println("Two or more friends have the same youngest age");
        }
        
        // Find oldest
        if(a > b && a > c) {
            System.out.println("Friend 1 is oldest");
        } 
		else if(b > a && b > c) {
            System.out.println("Friend 2 is oldest");
        } 
		else if(c > a && c > b) {
            System.out.println("Friend 3 is oldest");
        } 
		else {
            System.out.println("Two or more friends have the same oldest age");
        }
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign12.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign12
Enter age of Friend 1:22
Enter age of Friend 2:25
Enter age of Friend 3:20
Friend 3 is youngest
Friend 2 is oldest
*/