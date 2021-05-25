package eu.mytthew;

import java.time.LocalDate;

public class Vehicle {
	private String brand;
	private String model;
	private String body;
	private int productionYear;
	private String engine;
	private String equipment;
	private String owner;
	private LocalDate registrationDate;
	private int id;

	public Vehicle(String brand, String model, String body, int productionYear, String engine, String equipment, String owner, LocalDate registrationDate, int id) {
		this.brand = brand;
		this.model = model;
		this.body = body;
		this.productionYear = productionYear;
		this.engine = engine;
		this.equipment = equipment;
		this.owner = owner;
		this.registrationDate = registrationDate;
		this.id = id;
	}

	public void enterVehicleInfo(String brand, String model, String body, int productionYear, String engine, String equipment, String owner, LocalDate registrationDate, int id) {
		this.brand = brand;
		this.model = model;
		this.body = body;
		this.productionYear = productionYear;
		this.engine = engine;
		this.equipment = equipment;
		this.owner = owner;
		this.registrationDate = registrationDate;
		this.id = id;
	}

	public void showEngineInfo() {
		System.out.println(engine);
	}

	public void showCatalogInfo() {
		System.out.println("Car brand: " + brand + "\n" +
				"Car model: " + model + "\n" +
				"Car body type: " + body + "\n" +
				"Car production year: " + productionYear + "\n" +
				"Extra equpiment: " + equipment);
	}

	public void showOwnerInfo() {
		System.out.println(owner);
	}

	public void showFullInfo() {
		System.out.println("Full info\n--------------------");
		showCatalogInfo();
		showEngineInfo();
		showOwnerInfo();
	}

	public int carAge(int year) {
		return LocalDate.now().getYear() - year;
	}
}
