package Model;

public class Doctor {
     private String IDdoctor;
     private String Namedoctor;
     private String Phonedoctor;
     private String department;
     private String Adressdoctor;
    
	public String getIDdoctor() {
		return IDdoctor;
	}

	public void setIDdoctor(String iDdoctor) {
		IDdoctor = iDdoctor;
	}

	public String getNamedoctor() {
		return Namedoctor;
	}

	public void setNamedoctor(String namedoctor) {
		Namedoctor = namedoctor;
	}

	public String getPhonedoctor() {
		return Phonedoctor;
	}

	public void setPhonedoctor(String phonedoctor) {
		Phonedoctor = phonedoctor;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAdressdoctor() {
		return Adressdoctor;
	}

	public void setAdressdoctor(String adressdoctor) {
		Adressdoctor = adressdoctor;
	}

	public Doctor() {
		super();
	}

	public Doctor(String iDdoctor, String namedoctor, String phonedoctor, String department, String adressdoctor) {
		super();
		IDdoctor = iDdoctor;
		Namedoctor = namedoctor;
		Phonedoctor = phonedoctor;
		this.department = department;
		Adressdoctor = adressdoctor;
	}
     
}
