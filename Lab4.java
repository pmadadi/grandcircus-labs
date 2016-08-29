import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
	System.out.println("Welcome to the Factorial Calculator!");
	Scanner scanner = new Scanner(System.in);
	long num;
    long fact;
    long ans;
	String choice = "y";
	do{
		System.out.println("Enter an integer thats greater than 0 but less than 20:");
		 num = scanner.nextLong();
		 ans = fact(num);
		 System.out.println("Factorial:"+ans);
		 System.out.println("Continue?(y/n):");
		choice=scanner.next();
		
	}while(choice.equalsIgnoreCase("y"));{
		System.out.println("Good bye");
	}
	}	
	public static long fact(long num){
		if(num==1 )
return 1;
		else 
			return num * fact(num-1);
	}
	
	}

