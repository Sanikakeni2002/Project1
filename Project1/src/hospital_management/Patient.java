package hospital_management;

public class Patient {
	String patientName;
	String patientDob;
	String patientPhno;
	String patientLocation;
	String patientType;

	public Patient(String patientName, String patientDob, String patientPhno, String patientLocation,
			String patientType) {
		this.patientName = patientName;
		this.patientDob = patientDob;
		this.patientPhno = patientPhno;
		this.patientLocation = patientLocation;
		this.patientType = patientType;
	}
}
