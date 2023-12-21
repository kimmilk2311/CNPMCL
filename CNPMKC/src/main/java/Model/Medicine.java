package Model;

public class Medicine {
    private String IDmedicine;
    private String Namemedicine;
    private String Dosemin;
    private String Dosemax;
    private String Frequencymax;
    private String DayDosemin;
    private String DayDosemax;
    
	public String getIDmedicine() {
		return IDmedicine;
	}

	public void setIDmedicine(String iDmedicine) {
		IDmedicine = iDmedicine;
	}

	public String getNamemedicine() {
		return Namemedicine;
	}

	public void setNamemedicine(String namemedicine) {
		Namemedicine = namemedicine;
	}

	public String getDosemin() {
		return Dosemin;
	}

	public void setDosemin(String dosemin) {
		Dosemin = dosemin;
	}

	public String getDosemax() {
		return Dosemax;
	}

	public void setDosemax(String dosemax) {
		Dosemax = dosemax;
	}

	public String getFrequencymax() {
		return Frequencymax;
	}

	public void setFrequencymax(String frequencymax) {
		Frequencymax = frequencymax;
	}

	public String getDayDosemin() {
		return DayDosemin;
	}

	public void setDayDosemin(String dayDosemin) {
		DayDosemin = dayDosemin;
	}

	public String getDayDosemax() {
		return DayDosemax;
	}

	public void setDayDosemax(String dayDosemax) {
		DayDosemax = dayDosemax;
	}

	public Medicine() {
		super();
	}

	public Medicine(String iDmedicine, String namemedicine, String dosemin, String dosemax, String frequencymax,
			String dayDosemin, String dayDosemax) {
		super();
		IDmedicine = iDmedicine;
		Namemedicine = namemedicine;
		Dosemin = dosemin;
		Dosemax = dosemax;
		Frequencymax = frequencymax;
		DayDosemin = dayDosemin;
		DayDosemax = dayDosemax;
	}
    
}
