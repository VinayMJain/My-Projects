package Event_Management;
import java.util.*;
public class Main {
	void college_sel() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter option of your Institute:\n 1.PIT\n 2.PIET\n 3.Exit");
	int option =sc.nextInt();
	switch(option) {
		case 1:
			System.out.println("Welcome to PIT");
			dept();
			break;
		case 2:
			System.out.println("Welcome to PIET");
			dept();
			break;
		case 3:
			System.out.println("Exit");
			System.exit(0);
		default:
			System.out.println("Wrong! option selected \nSelect correct option");
			college_sel();
		}
	sc.close();
	}
	
	void dept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your department:\n 1.CSE\n 2.EEE\n 3.ECE\n 4.Mech\n 5.Civil\n 6.Back to college selection\n 7.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to CSE department");
			sub_dp_cse();
			break;
		case 2:
			System.out.println("Welcome to EEE department");
			sub_dp_eee();
			break;
		case 3:
			System.out.println("Welcome to ECE department");
			sub_dp_ece();
			break;
		case 4:
			System.out.println("Welcome to Mech department");
			sub_dp_mech();
			break;
		case 5:
			System.out.println("Welcome to Civil department");
			sub_dp_civil();
			break;
		case 6:
			college_sel();
		case 7:
			System.out.println("Exit");
			System.exit(0);
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			dept();
		}
		sc.close();
	}
	
	void sub_dp_cse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your sub-department:\n 1.CC\n 2.IOT\n 3.BDA\n 4.AI\n 5.Back to departments\n 6.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to Cloud computing");
			cc();
			break;
		case 2:
			System.out.println("Welcome to Internet of things");
			iot();
			break;
		case 3:
			System.out.println("Welcome to Big Data Analytics");
			bda();
			break;
		case 4:
			System.out.println("Welcome to Artificial Intelligence");
			ai();
			break;
		case 5:
			dept();
			break;
		case 6:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sub_dp_cse();
		}
		sc.close();
	}
	
    void cc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.RDBMS\n 2.SDLC\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Event RDBMS");
			System.out.println("3 Lines of description about the event");
			cc_venue_detail1();
		case 2:
			System.out.println("Event SDLC");
			System.out.println("3 Lines of description about the event");
			cc_venue_detail2();
		case 3:
			sub_dp_cse();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			cc();
		}
		sc.close();
	}
    
	void cc_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:359\n");
		cc();
	}
	void cc_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:360\n");
		cc();
	}
	
	void iot() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Face recognition bot\n 2.Li-Fi\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Face recognition bot");
			System.out.println("3 Lines of description about the event");
			iot_venue_detail1();
		case 2:
			System.out.println("Li-Fi");
			System.out.println("3 Lines of description about the event");
			iot_venue_detail2();
		case 3:
			sub_dp_cse();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			iot();
		}
		sc.close();
	}
	void iot_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:259\n");
		iot();
	}
	void iot_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:260\n");
		iot();
	}
	
	void bda() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Anomoly detection in cloud servers\n 2.Text-Mining\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Anomoly detection in cloud servers");
			System.out.println("3 Lines of description about the event");
			bda_venue_detail1();
		case 2:
			System.out.println("Text-Mining");
			System.out.println("3 Lines of description about the event");
			bda_venue_detail2();
		case 3:
			sub_dp_cse();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			bda();
		}
		sc.close();
	}
	void bda_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:370\n");
		bda();
	}
	void bda_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:A \nRoom NO:265\n");
		bda();
	}

	void ai() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Google cloud mahcine learning Engine\n 2.TensorFlow\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Google cloud machine learning Engine");
			System.out.println("3 Lines of description about the event");
			ai_venue_detail1();
		case 2:
			System.out.println("TensorFlow");
			System.out.println("3 Lines of description about the event");
			ai_venue_detail2();
		case 3:
			sub_dp_cse();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			ai();
		}
		sc.close();
	}
	void ai_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:B \nRoom NO:270\n");
		ai();
	}
	void ai_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:B \nRoom NO:253\n");
		ai();
	}
	void sub_dp_eee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your sub-department:\n 1.Power Engineering\n 2.Microelectronics\n 3.Back to departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to Power Engineering");
			pe();
			break;
		case 2:
			System.out.println("Welcome to Microelectronics");
			me();
			break;
		case 3:
			dept();
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sub_dp_eee();
		}
		sc.close();
	}
	void pe() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Event of Power Engineering\n 2.Back to sub-departments\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Event of Power Engineering");
			System.out.println("3 Lines of description about the event");
			pe_venue_detail1();
		case 2:
			sub_dp_eee();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			pe();
		}
		sc.close();
	}
	void pe_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:D \nRoom NO:279\n");
		pe();
	}
	void me() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Event of Microelectronics\n 2.Back to sub-departments\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Event of Microelectronics");
			System.out.println("3 Lines of description about the event");
			me_venue_detail1();
		case 2:
			sub_dp_eee();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			me();
		}
		sc.close();
	}
	void me_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:279\n");
		me();
	}
	
	void sub_dp_ece() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your sub-department:\n 1.Signal Processing\n 2.Telecomunication\n 3.Computer Engineering\n 4.Back to departments\n 5.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to Signal Processing");
			sp();
			break;
		case 2:
			System.out.println("Welcome to Telecomunication");
			tlc();
			break;
		case 3:
			System.out.println("Welcome to Computer Engineering");
			ce();
			break;
		case 4:
			dept();
			break;
		case 5:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sub_dp_ece();
		}
		sc.close();
	}
	
	void sp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Digital video registring\n 2.Channel Coding\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Digital video registring");
			System.out.println("3 Lines of description about the event");
			sp_venue_detail1();
		case 2:
			System.out.println("Channel Coding");
			System.out.println("3 Lines of description about the event");
			sp_venue_detail2();
		case 3:
			sub_dp_ece();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sp();
		}
		sc.close();
	}
	void sp_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:C \nRoom NO:249\n");
		sp();
	}
	void sp_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:C \nRoom NO:339\n");
		sp();
	}
	void tlc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Voice Recognition System\n 2.Nano Size Satelite\n 3.Back to sub-departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Voice Recognition System");
			System.out.println("3 Lines of description about the event");
			tlc_venue_detail1();
		case 2:
			System.out.println("Nano Size Satelite");
			System.out.println("3 Lines of description about the event");
			tlc_venue_detail2();
		case 3:
			sub_dp_ece();
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			tlc();
		}
		sc.close();
	}
	void tlc_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:223\n");
		tlc();
	}
	void tlc_venue_detail2() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:B \nRoom NO:330\n");
		tlc();
	}
	void ce() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Data Science\n 2.Back to sub-departments\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Data Science");
			System.out.println("3 Lines of description about the event");
			ce_venue_detail1();
		case 2:
			sub_dp_ece();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			ce();
		}
		sc.close();
	}
	void ce_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:C \nRoom NO:353\n");
		ce();
	}
	
	void sub_dp_mech() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your sub-department:\n 1.CAD\n 2.Back to departments\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to CAD");
			cad();
			break;
		case 2:
			dept();
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sub_dp_mech();
		}
		sc.close();
	}
	void cad(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Workshop on AutoCAD\n 2.Back to sub-departments\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Workshop on AutoCAD");
			System.out.println("3 Lines of description about the event");
			cad_venue_detail1();
		case 2:
			sub_dp_mech();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			cad();
		}
		sc.close();
	}
	void cad_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:A \nRoom NO:371\n");
		cad();
	}
	
	void sub_dp_civil() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of your sub-department:\n 1.Structural Engineering\n 2.Envionmental Engineering\n 3.Back to departments\n 4.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Welcome to Structural Engineering");
			se();
			break;
		case 2:
			System.out.println("Welcome to Envionmental Engineering");
			ee();
			break;
		case 3:
			dept();
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			sub_dp_civil();
		}
		sc.close();
	}
	void se() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Seminar on Demolition of buildings\n 2.Back to sub-department\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Seminar on Demolition of buildings");
			System.out.println("3 Lines of description about the event");
			se_venue_detail1();
		case 2:
			sub_dp_civil();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			se();
		}
		sc.close();
	}
	void se_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIT \nBlock:B \nRoom NO:312\n");
		se();
	}
	void ee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option of Event:\n 1.Seminar on activated carbon adsorption\n 2.Back to sub-department\n 3.Exit");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Seminar on activated carbon adsorption");
			System.out.println("3 Lines of description about the event");
			ee_venue_detail1();
		case 2:
			sub_dp_civil();
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong! option Selected \nSelect correct option");
			ee();
		}
		sc.close();
	}
	void ee_venue_detail1() {
		System.out.println("Venue Details \nCollege:PIET \nBlock:B \nRoom NO:315\n");
		ee();
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		obj.college_sel();
	}
}
