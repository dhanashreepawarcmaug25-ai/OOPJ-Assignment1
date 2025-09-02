/*
26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
Input:
Enter month number: 12
Output:
Season is Winter

*/

import java.util.Scanner;

public class Assign26
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int month;
		
		System.out.print("Enter month number:");
		month=sc.nextInt();
		String season;
        
        if(month > 12) {
            season = "Invalid";
        } 
		else if(month ==1 | month==2 | month==12) {
            season = "Winter";
        } 
		else if(month ==3 | month==4 | month==5 ){
            season = "Summer";
        }
		else if(month ==6 | month==7 | month==8 ) {
            season = "Monsoon";
        } 
		else {
            season = "Autumn";
        } 
		
        switch(season) {
            case "Winter":
                System.out.println("Season: Winter");
                break;
            case "Summer":
                System.out.println("Season: Summer");
                break;
            case "Monsoon":
                System.out.println("Season: Monsoon");
                break;
            case "Autumn":
                System.out.println("Season: Autumn");
                break;
				
            default:
                System.out.println("Invalid Month");
        }
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign26.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign26
Enter month number:6
Season: Monsoon

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign26
Enter month number:12
Season: Winter

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign26
Enter month number:4
Season: Summer
*/