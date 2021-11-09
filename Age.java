
public class Age {
	public static void main(String args[]) {
		int age = 19;
		int weight = 60;
		if (age > 20) {
			if (weight > 50) {
				System.out.println("Eligible to donate Blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}

	}
}
