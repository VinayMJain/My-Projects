package p2;
import java.util.*;

public class BungeeJump {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age:");
		int wt;
		int age =sc.nextInt();
		if(age>=18 && age<=55)
		{
			System.out.println("Enter Height:");
			if(sc.nextFloat()>=4.5f)
			{
				System.out.println("Enter weight:");
				wt=sc.nextInt();
				if(wt>=45 && wt<=120) {
					if(wt>=80)
						System.out.println("add extra ropes");
					System.out.println("eligibile");
					
				}
				else 
					System.out.println();
			}
		}
		sc.close();
		
	}
	

}
