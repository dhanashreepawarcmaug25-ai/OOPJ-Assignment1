/*
45. Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.
Input:
Enter numbers: 45, 12, 78
Output:
Ascending order: 12, 45, 78
*/

import java.util.Scanner;
public class Assign45
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[3];
		System.out.print("Enter numbers: ");
		
		for(int i=0;i<3;i++){
			arr[i]=sc.nextInt();
		}
		
		//bubble sort
		for(int i=0; i< arr.length ; i++){
			for(int j=0; j < arr.length-i-1 ; j++){
				if(arr[j] > arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Ascending order: ");
		for(int i:arr){
			System.out.print(i+"  ");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign45
Enter numbers: 45
12
78
Ascending order:
12  45  78
*/