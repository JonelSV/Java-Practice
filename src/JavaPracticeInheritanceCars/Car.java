package JavaPracticeInheritanceCars;

public class Car extends Vehicle {
	private int wheels;
	private int doors; 
	private int gears;
	private int boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = currentGear;
	}
	
	public void carUse(String drive, int miles, int speed  ) {
		System.out.println("try
	}

}
