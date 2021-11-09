
public class Test {
	public static void main(String args[]) {
		int mark = 45;
		if (mark >= 80) {
			System.out.println("Distinction");
		} else if (mark >= 70) {
			System.out.println("A Grade");
		} else if (mark >= 60) {
			System.out.println("B Grade");
		} else if (mark >= 50) {
			System.out.println("C Grade");
		} else if (mark > 40) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail");
		}
	}
}
