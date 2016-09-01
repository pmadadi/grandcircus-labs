import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	private static double radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle circleac = new Circle();
		String choice = "y";
		do {
			try {
				System.out.println("Welcome to the Circle Tester");

				System.out.println("enter radius");
				circleac.radius = scanner.nextDouble();

				// circleac.getArea();
				// circleac.getCircumference();
			} catch (InputMismatchException ex) {
				System.out.println("Your input is invalid.Please try again");
				scanner.next();
				continue;
			}
            System.out.println("Area is " + circleac.getFormattedArea());
			System.out.println("Circumference is " + circleac.getFormattedCircumference());
			int count = Circle.incrementObjectCount();
			System.out.println("Continue(y/n)");
			choice = scanner.next();
		} while (choice.equals("y"));

		
		System.out.println("Goodbye. You created " + Circle.getObjectCount() + " Circle object(s).");
		scanner.close();
	}

}
