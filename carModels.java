
public class carModels {
	public static void main(String args[]) {
		char Vehicle = 'F';
		String company;
		switch (Vehicle) {
		case 'A':
			company = "Audi";
			break;

		case 'B':
			company = "BMW";
			break;

		case 'F':
			company = "Ford";
			break;

		case 'H':
			company = "Hyundai";
			break;
		default:
			company = "Unknown";
		}
			System.out.println("Company:" + company);
		
	}

}
