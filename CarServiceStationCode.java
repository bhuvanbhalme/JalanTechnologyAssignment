package arraysconsept;

import java.util.Scanner;

public class CarServiceStationCode {
	Scanner sc = new Scanner(System.in);
	int sum = 0;

	public static void main(String[] args) {
		CarServiceStationCode c = new CarServiceStationCode();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Service Code    Service           Hatchback   Sedan  SUV \n   BS01         Basic Servicing    ₹2000      ₹4000  ₹5000 \n   EF01         Engine Fixing      ₹5000      ₹8000  ₹10000 \n   CF01         Clutch Fixing      ₹2000      ₹4000  ₹6000 \n   BF01         Brake Fixing       ₹1000      ₹1500  ₹2500 \n   GF01         Gear Fixing        ₹3000      ₹6000  ₹8000");

		System.out.print("Type Of Car : ");
		String car = sc.next();
		car = car.toLowerCase();
		if (car.equals("hatchback"))
			c.hatchback();
		else if (car.equals("sedan"))
			c.sedan();
		else if (car.equals("suv"))
			c.suv();
		else {
			System.out.println("Wrong Car Enter");
			System.exit(1);
		}
		System.out.println("Total Bill : " + c.sum);
		if(c.sum>10000)
		{
			System.out.println("1 free complimentary cleaning should be provided ");
		}

	}

	public void hatchback() {

		while (true) {
			System.out.print("Service Codes : ");
			String code = sc.next();
			code = code.toUpperCase();
			if (code.equals("BS01")) {
				sum = sum + 2000;
				System.out.println("Charges for Basic Servicing - 2000");
			} else if (code.equals("EF01")) {
				sum = sum + 5000;
				System.out.println("Charges for  Engine Fixing  - 5000");
			} else if (code.equals("CF01")) {
				sum = sum + 2000;
				System.out.println("Charges for  Clutch Fixing  - 2000");
			} else if (code.equals("BF01")) {
				sum = sum + 1000;
				System.out.println("Charges for  Brake Fixing  - 1000");
			} else if (code.equals("GF01")) {
				sum = sum + 3000;
				System.out.println("Charges for  Gear Fixing  - 3000");
			} else {
				System.out.println("Invalid Code");

			}

			System.out.println("One More Service Y/N : ");
			String s = sc.next();
			if (s.equals("N") || s.equals("n")) {
				break;
			}
		}
	}

	public void sedan() {

		while (true) {
			System.out.print("Service Codes : ");
			String code = sc.next();
			code = code.toUpperCase();
			if (code.equals("BS01")) {
				sum = sum + 4000;
				System.out.println("Charges for Basic Servicing - 4000");
			} else if (code.equals("EF01")) {
				sum = sum + 8000;
				System.out.println("Charges for  Engine Fixing  - 8000");
			} else if (code.equals("CF01")) {
				sum = sum + 4000;
				System.out.println("Charges for  Clutch Fixing  - 4000");
			} else if (code.equals("BF01")) {
				sum = sum + 1500;
				System.out.println("Charges for  Brake Fixing  - 1500");

			} else if (code.equals("GF01")) {
				sum = sum + 6000;
				System.out.println("Charges for  Gear Fixing  - 6000");

			} else {
				System.out.println("Invalid Code");
			}
			System.out.println("One More Service Y/N : ");
			String s = sc.next();
			if (s.equals("N") || s.equals("n")) {
				break;
			}
		}
	}

	public void suv() {

		while (true) {
			System.out.print("Service Codes : ");
			String code = sc.next();
			code = code.toUpperCase();
			if (code.equals("BS01")) {
				sum = sum + 5000;
				System.out.println("Charges for Basic Servicing - 4000");

			} else if (code.equals("EF01")) {
				sum = sum + 10000;
				System.out.println("Charges for  Engine Fixing  - 8000");

			} else if (code.equals("CF01")) {
				sum = sum + 6000;
				System.out.println("Charges for  Clutch Fixing  - 4000");

			} else if (code.equals("BF01")) {
				sum = sum + 2500;
				System.out.println("Charges for  Brake Fixing  - 1500");

			} else if (code.equals("GF01")) {
				sum = sum + 8000;
				System.out.println("Charges for  Gear Fixing  - 6000");
			} else {
				System.out.println("Invalid Code");
			}
			System.out.println("One More Service Y/N : ");
			String s = sc.next();
			if (s.equals("N") || s.equals("n")) {
				break;
			}
		}
	}

}
