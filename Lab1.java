import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		do
		{
			
			System.out.println("Enter Length:");
			int length = scanner.nextInt();
			System.out.println("Enter Width:");
			int width = scanner.nextInt();
		
			int area = length * width;	
			int perimeter = 2*(length + width);
			
			System.out.println(area + ":area");
			
			System.out.println(perimeter + ":perimeter");
		
	
		
	
		System.out.println("Enter Length:");
		double length1 = scanner.nextDouble();
		System.out.println("Enter Width:");
		double width1 = scanner.nextDouble();
	    double area1 = length1 * width1;	
		double perimeter1 = 2*(length1 + width1);
		
		System.out.println(area + ": is the area");
		
		System.out.println(perimeter + ": is the perimeter");
		
		System.out.println("Continue?(y/n):");
		choice = scanner.next();
		System.out.println();
		}while(choice.equalsIgnoreCase("y"));
		scanner.close();
		System.out.println();
	}

}
