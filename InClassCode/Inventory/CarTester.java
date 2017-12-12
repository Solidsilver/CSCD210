public class CarTester {
	public static void main(String[] args) {
		Car auto = new Car();
		System.out.println(auto);
		System.out.println();

		Car auto2 = new Car("Cheverolet", "Corvette", 1950, "red");
		System.out.println(auto2);
		System.out.println(auto2.getYear());
		System.out.println(auto2.getValue());

		Car auto4 = new Car("Ford", "F-250", 1978, "dirt");
		System.out.println(auto4.getValue());

		System.out.println();

		Car auto3 = new Car("Cheverolet", "Suburban", 2000, "silver");
		System.out.println(auto3.getValue());
	}
}