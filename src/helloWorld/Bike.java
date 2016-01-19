package helloWorld;

public class Bike {

	int topSpeed;
	static String name;

	@SuppressWarnings("static-access")
	public Bike(String bikeName) {

		this.name = bikeName;
		System.out.println("Bike Name: " + bikeName);
	}

	public void settoSpeed(int bikeSpeed) {

		topSpeed = bikeSpeed;
	
	}

	public int gettopSpeed() {

		System.out.println("Bike Top Speed: " + topSpeed);
		return topSpeed;
	}

	public static void main(String[] args) {
		// Creating class variable

		Bike bk = new Bike("Classic 350");

		bk.settoSpeed(250);

		bk.gettopSpeed();

		// String bikeName = "TEST";
		System.out.println("Top Speed of " + name + " is: " + bk.topSpeed);
	}

}