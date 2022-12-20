//self made code
package p1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int age,weight;
		float height;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Details: 1.Age 2.Height 3.Weight ");
		age=sc.nextInt();
		height=sc.nextFloat();
		weight=sc.nextInt();
		if(age >= 18 && age<=85 ) {
			if(height>=4.9) {
				if(weight>=45 && weight<=120) {
					if(weight>=85)
						System.out.println("Add Extra ropes");
					System.out.println("You are Eligible");
					
				}
				else
					System.out.println("Not Eligible, Reason:Weight");
			}
			else
				System.out.println("Not Eligible, Reason:Height");
		}
		else if(age>=13 && age<=17) {
			if(height>=4.2) {
				if(weight>=35 && weight<=80)
					System.out.println("You are Eligible");
				else
					System.out.println("Not Eligible, Reason:Weight");
			}
			else
				System.out.println("Not Eligible, Reason:Height");
		}
		else
			System.out.println("Not Eligible, Reason:Age");
		sc.close();
	}
}
