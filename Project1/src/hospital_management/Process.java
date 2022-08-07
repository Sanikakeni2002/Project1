 package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Process {
	void patientDetails() {
		HashMap<Integer, Patient> patientData = new Data().patient();
		int count = 0;
		System.out.println("Enter Patient Id: ");
		Scanner scanner = new Scanner(System.in);

		int patientId = scanner.nextInt();
		System.out.println("Patient details for given Details");
		System.out.println("----------------------------------------------------------");
		for (Map.Entry<Integer, Patient> patientList : patientData.entrySet()) {
			Patient patient = patientList.getValue();
			if (patientId == patientList.getKey()) {
				System.out.println("Id: " + patientList.getKey());
				System.out.println("Name: " + patient.patientName);
				System.out.println("Dob: " + patient.patientDob);
				System.out.println("PhNo: " + patient.patientPhno);
				System.out.println("Location: " + patient.patientLocation);
				System.out.println("Type: " + patient.patientType);
				count++;
			}
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Total record found: " + count);
	}

	
	void appointmentDetails() {
		HashMap<Integer, Appointment> appointmentData = new Data().appointment();
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter patient Id : ");
		int patientId = scanner.nextInt();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("Appointment Details");
		System.out.println("------------------------------------------------------------");
		for (Map.Entry<Integer, Appointment> appointmentList : appointmentData.entrySet()) {
			Appointment appointment = appointmentList.getValue();
			if (patientId == appointment.patientId) {
				System.out.println("Patient Id : " + appointment.patientId);
				System.out.println("Date to visit : " + dateformat.format(appointment.dateToVisit));
				System.out.println("Purpose of visit : " + appointment.purposeOfVisit);
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records found : " + count);
	}

	
	void appointmentByDoctor() {
		HashMap<Integer, Appointment> appointmentData = new Data().appointment();
		int count = 0;
		System.out.println("Enter Doctor Id : ");
		Scanner scanner = new Scanner(System.in);
		int doctorId = scanner.nextInt();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("Patient details for given doctor Id " + doctorId);
		System.out.println("------------------------------------------------------------");
		for (Map.Entry<Integer, Appointment> appointmentList : appointmentData.entrySet()) {
			Appointment appointment = appointmentList.getValue();
			if (doctorId == appointment.doctorToVisit) {
				System.out.println("Patient Id : " + appointment.patientId);
				System.out.println("Purpose of visit : " + appointment.purposeOfVisit);
				System.out.println("Date to visit : " +dateformat.format(appointment.dateToVisit) + "\n");
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records found : " + count);
	}

	void InPatientList() {
		HashMap<Integer, Patient> patientData = new Data().patient();
		int count = 0;
		System.out.println("In Patient Lists");
		System.out.println("------------------------------------------------------------");
		for (Map.Entry<Integer, Patient> patientLists : patientData.entrySet()) {
			Patient patient = patientLists.getValue();
			if (patient.patientType.equalsIgnoreCase("In Patient")) {
				System.out.println("Patient Id : " + patientLists.getKey());
				System.out.println("Patient Name : " + patient.patientName);
				System.out.println("Patient Type : " + patient.patientType);
				System.out.println("Patient Location : " + patient.patientLocation + "\n");
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records found : " + count);
	}

	void outPatientList() {
		HashMap<Integer, Patient> patientData = new Data().patient();
		int count = 0;
		System.out.println("Out Patient Lists");
		System.out.println("------------------------------------------------------------");
		for (Map.Entry<Integer, Patient> patientLists : patientData.entrySet()) {
			Patient patient = patientLists.getValue();
			if (patient.patientType.equalsIgnoreCase("Out Patient")) {
				System.out.println("Patient Id : " + patientLists.getKey());
				System.out.println("Patient Name : " + patient.patientName);
				System.out.println("Patient Type : " + patient.patientType);
				System.out.println("Patient Location : " + patient.patientLocation + "\n");
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records found : " + count);
	}

	void dataRangePatient(){
		int count=0;
		System.out.println("Form (dd/MM/yyyy): ");
		Scanner scanner=new Scanner(System.in);
		String form=scanner.next();
		System.out.println("To (dd/MM/yyyy): ");
		String to=scanner.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date fromDate=null , toDate=null;
		try {
			fromDate=dateFormat.parse(form);
			toDate=dateFormat.parse(to);
			} catch (ParseException e) {
			System.out.println(e);
		}
		System.out.println("Date range patient List");
		System.out.println("------------------------------------------------------------");
		
		HashMap<Integer, Appointment> appointmentData=new Data().appointment();
		for(Map.Entry<Integer, Appointment>appointmentList:appointmentData.entrySet()){
			Appointment appointment= appointmentList.getValue();
			if(appointment.dateToVisit.after(fromDate)&& appointment.dateToVisit.before(toDate)){
				System.out.println("Patient Id : "+appointment.patientId);
				System.out.println("Date to visit : "+appointment.dateToVisit);
				System.out.println("Doctor to visit : "+appointment.doctorToVisit+"/n");
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records found : " + count);
	}
	
//for print this code 1 go to data class and put the current date in Appointment then it will print
	void todayVisits() {
		int count = 0;
		Date todayDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Today Visit Patient List");
		System.out.println("------------------------------------------------------------");
		
		HashMap<Integer, Appointment> appointmentData=new Data().appointment();
		for(Map.Entry<Integer, Appointment>appointmentList : appointmentData.entrySet()) {
			Appointment appointment = appointmentList.getValue();
			if(dateFormat.format(appointment.dateToVisit).equals(dateFormat.format(todayDate))){
				System.out.println("Patient Id : " + appointment.patientId);
				System.out.println("Purpose of visits : "+appointment.purposeOfVisit);
				System.out.println("Temperature : "+appointment.temperature);
				System.out.println("BP : "+appointment.bp);
				System.out.println("Doctors to visits : "+appointment.doctorToVisit);
				count++;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Total records founds : " + count);
	}
}