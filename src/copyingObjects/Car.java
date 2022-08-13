package copyingObjects;

public class Car {


	private String make; // private
	private String model;
	private int year;

	Car(String make, String model, int year) {

		this.setMake(make); // calling the setters methods to set values due to the private access modifiers
		this.setModel(model);
		this.setYear(year);

		// getters
	}

	Car(Car x) {
		// Car x is the object passed to the object that wants to copy
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());

	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	// setters

	public void setMake(String make) {
		this.make = make;

	}

	public void setModel(String model) {
		this.model = model;

	}

	public void setYear(int year) {
		this.year = year;

	}

	// copy method

	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());

	}

}
