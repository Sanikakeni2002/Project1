package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
	int patientId;
	Date dateToVisit;
	String purposeOfVisit;
	int bp;
	int temperature;
	int doctorToVisit;
	public Appointment(int patientId, String dateToVisit, String purposeOfVisit,int bp,int temperature,int doctorToVisit) {
		this.patientId=patientId;
		try {
			this.dateToVisit=new SimpleDateFormat("dd/MM/yyyy").parse(dateToVisit);
		} catch (ParseException e) {
			System.out.println(e);
		}
		this.purposeOfVisit=purposeOfVisit;
		this.bp=bp;
		this.temperature=temperature;
		this.doctorToVisit=doctorToVisit;
	}
}
