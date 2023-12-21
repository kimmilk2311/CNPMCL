package Model;

public class Prescription {
	
	
	public String getIDprescription() {
		return IDprescription;
	}
	public void setIDprescription(String iDprescription) {
		IDprescription = iDprescription;
	}
	public String getIDdoctor() {
		return IDdoctor;
	}
	public void setIDdoctor(String iDdoctor) {
		IDdoctor = iDdoctor;
	}
	public String getIDpatient() {
		return IDpatient;
	}
	public void setIDpatient(String iDpatient) {
		IDpatient = iDpatient;
	}
	public String getPrescriptionDate() {
		return prescriptionDate;
	}
	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
	public Prescription() {
		super();
	}
	public Prescription(String iDprescription, String iDdoctor, String iDpatient, String prescriptionDate) {
		super();
		IDprescription = iDprescription;
		IDdoctor = iDdoctor;
		IDpatient = iDpatient;
		this.prescriptionDate = prescriptionDate;
	}
	private String IDprescription;
	private String IDdoctor;
	private String IDpatient;
	private String prescriptionDate;

}
