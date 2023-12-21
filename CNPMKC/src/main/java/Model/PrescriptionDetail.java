package Model;

public class PrescriptionDetail {
	
     public String getIDprescriptionDetail() {
		return IDprescriptionDetail;
	}
	public void setIDprescriptionDetail(String iDprescriptionDetail) {
		IDprescriptionDetail = iDprescriptionDetail;
	}
	public String getIDprescription() {
		return IDprescription;
	}
	public void setIDprescription(String iDprescription) {
		IDprescription = iDprescription;
	}
	public String getIDmedicine() {
		return IDmedicine;
	}
	public void setIDmedicine(String iDmedicine) {
		IDmedicine = iDmedicine;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public PrescriptionDetail() {
		super();
	}
	public PrescriptionDetail(String iDprescriptionDetail, String iDprescription, String iDmedicine, String dose,
			String frequency, String quantity) {
		super();
		IDprescriptionDetail = iDprescriptionDetail;
		IDprescription = iDprescription;
		IDmedicine = iDmedicine;
		this.dose = dose;
		this.frequency = frequency;
		this.quantity = quantity;
	}
	private String IDprescriptionDetail;
     private String IDprescription;
     private String IDmedicine;
     private String dose;
     private String frequency;
     private String quantity;
}
