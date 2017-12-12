public class Car {
	private String make;
	private String model;
	private int year;
	private String color;

	//DVC
	Car() {
		this.make = "";
		this.model = "";
		this.year = 0;
		this.color = "";
	}
	
	//EVC
	Car(String mk, String mdl, int yr, String clr) {
		this.make = mk;
		this.model = mdl;
		this.year = yr;
		this.color = clr;
	}
	
	public double getValue() {
		double val = 0;
		if (this.make.equals("Ford")) {
			val += 1000;
		} else if (this.make.equals("Cheverolet")) {
			val += 2000;
		} else {
			val += 3000;
		}

		if (this.year < 1960) {
			val *= 2;
		} else if (this.year < 1990) {
			val *= 0.6;
		} else if (this.year > 2010) {
			val *= 1.6;
		} else {
			//Keep val the same
		}

		return val;
	}

	// Setters
	public void setMake(String mk) {
		this.make = mk;
	}
	public void setModel(String mdl) {
		this.model= mdl;
	}
	public void setYear(int yr) {
		if (yr >= 1900 && yr < 2018) {
			this.year = yr;
		}
	}
	public void setColor(String clr) {
		this.color = clr;
	}
	
	// Getters
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
	public String getColor() {
		return this.color;
	}
	

	@Override
	public String toString() {
		return "Car: \nMake: " + this.make + "\nModel: " + this.model 
				 + "\nYear: " + this.year + "\nColor: " + this.color;
	}




}