package Model;

public class Patient { 
	
	public String getIDpatient() {
		return IDpatient;
	}
	public void setIDpatient(String iDpatient) {
		IDpatient = iDpatient;
	}
	public String getNamepatient() {
		return Namepatient;
	}
	public void setNamepatient(String namepatient) {
		Namepatient = namepatient;
	}
	public String getConditon() {
		return conditon;
	}
	public void setConditon(String conditon) {
		this.conditon = conditon;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdrresspatient() {
		return Adrresspatient;
	}
	public void setAdrresspatient(String adrresspatient) {
		Adrresspatient = adrresspatient;
	}
	
	public Patient() {
		super();
	}
	public Patient(String iDpatient, String namepatient, String conditon, String phone, String adrresspatient) {
		super();
		IDpatient = iDpatient;
		Namepatient = namepatient;
		this.conditon = conditon;
		this.phone = phone;
		Adrresspatient = adrresspatient;
	}
	private String IDpatient;
	private String Namepatient;
	private String conditon;
	private String phone;
	private String Adrresspatient;

}
