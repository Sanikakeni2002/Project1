package hospital_management;

import java.util.Scanner;

public class Main {
	void options() {
		System.out.println("******* Welcome to Hosptial Management System *********");

		String cdata = "";
		do {
			System.out.println("  1.Display patient details for the pateint id\n"
					+ "  2.Display the visiting list for the patient id\n"
					+ "  3.Display the list of patient by doctor id\n" + "  4.Display all patient who are in-patient\n"
					+ "  5.Display only the out-patient\n" + "  6.Display the visit details for given date range\n"
					+ "  7.Display the today's visited patient");

			System.out.println("  Enter your choice: ");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				new Process().patientDetails();
				break;

			case 2:
				new Process().appointmentDetails();
				break;

			case 3:
				new Process().appointmentByDoctor();
				break;

			case 4:
				new Process().InPatientList();
				break;

			case 5:
				new Process().outPatientList();
				break;

			case 6:
				new Process().dataRangePatient();
				break;

			case 7:
				new Process().todayVisits();
				break;

			default:
				System.out.println("Enter a valid option \n");
				options();
			}
			System.out.println("Enter Y to continue: N to disconnect");
			cdata = scanner.next();
			if (cdata.equalsIgnoreCase("N"))
				System.out.println("exit the program....");

		} while (cdata.equalsIgnoreCase("Y"));

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.options();
	}

}
