import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Learn your squares and cubes!");
Scanner scanner = new Scanner(System.in);
int lastNumber;
String choice = "y";
do{
	System.out.println("Enter an integer");
	 lastNumber = scanner.nextInt();
	 System.out.println("Number" + "\t" + "square" + "\t" + "cube");
	System.out.println("======" + "\t" + "======" + "\t" + "=====");
	for(int i = 1 ; i <= lastNumber; i++){
	int square= i * i;
	int cube = i * i * i ;
	System.out.println(i +  "\t" + square + "\t" + cube);
	}
	System.out.println("Continue?(y/n):");
	choice=scanner.next();
	System.out.println();
}while(choice.equalsIgnoreCase("y"));{
	System.out.println("Good bye");
}
	}	
}
	
