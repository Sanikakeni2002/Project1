package hospital_management;//Data Stored

import java.util.HashMap;
import java.util.Scanner;

public class Data {
	HashMap<Integer, Patient> patient() {
		Patient patient1 = new Patient("Ramesh", "12/02/1998", "9039847894", "Panvel", "OUT PATIENT");
		Patient patient2 = new Patient("Suresh", "22/09/1992", "9939847692", "Uran", "OUT PATIENT");
		Patient patient3 = new Patient("Rajesh", "10/12/1991", "7039847894", "Nashik", "IN PATIENT");
		Patient patient4 = new Patient("Sunaina", "02/02/1990", "98039847886", "Mumbai", "OUT PATIENT");
		Patient patient5 = new Patient("Ravina", "28/07/1999", "7023847894", "Vashi", "IN PATIENT");

		HashMap<Integer, Patient> patientData = new HashMap<Integer, Patient>();
		patientData.put(10001, patient1);
		patientData.put(10002, patient2);
		patientData.put(10003, patient3);
		patientData.put(10004, patient4);
		patientData.put(10005, patient5);
		return patientData;

	}

	HashMap<Integer, Doctor> doctor() {
		Doctor doctor1 = new Doctor("Dr.Vivek Gupta ", "Dentist");
		Doctor doctor2 = new Doctor("Dr.Akshay Johar", "Cardiologist");
		Doctor doctor3 = new Doctor("Dr.Sanjay Sharma", "Allergist");
		Doctor doctor4 = new Doctor("Dr.Shailendra Trivedi", "Heart Surgon");

		HashMap<Integer, Doctor> doctorData = new HashMap<Integer, Doctor>();
		doctorData.put(2001, doctor1);
		doctorData.put(2002, doctor2);
		doctorData.put(2003, doctor3);
		doctorData.put(2004, doctor4);

		return doctorData;

	}

	HashMap<Integer, Appointment> appointment() {
		Appointment appointment1 = new Appointment(10001, "07/08/2022", "Heart Pain", 90, 37, 2004);
		Appointment appointment2 = new Appointment(10002, "20/08/2022", "Cavity Problem", 92, 37, 2001);
		Appointment appointment3 = new Appointment(10003, "22/08/2022", "Low BP", 80, 37, 2002);
		Appointment appointment4 = new Appointment(10004, "23/08/2022", "High BP", 120, 37, 2003);
		Appointment appointment5 = new Appointment(10005, "30/08/2022", "Rubbing Hand", 90, 37, 2003);

		HashMap<Integer, Appointment> appointmentData = new HashMap<Integer, Appointment>();
		appointmentData.put(1, appointment1);
		appointmentData.put(2, appointment2);
		appointmentData.put(3, appointment3);
		appointmentData.put(4, appointment4);
		appointmentData.put(5, appointment5);

		return appointmentData;

	}
}
