package edu.umb.cs681.hw02;

public class Car {
	private String model;
	private float price;
		private float year;

	public Car(String model, float price, float year) {
		super();
		this.model = model;
		this.price = price;
				this.year = year;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", year=" + year + "]";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public float getYear() {
		return year;
	}

	public void setYear(float year) {
		this.year = year;
	}
}
