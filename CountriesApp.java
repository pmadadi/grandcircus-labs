import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.grandcircus.studentlist.Movie;

public class CountriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
String choice = "y";
List<String> countries = new ArrayList<>();
CountriesTextFile countriestextfile = new CountriesTextFile();
System.out.println("Welcome to the Countries Maintainence Application!");
do{
System.out.println("1.See the list of Countries");	
System.out.println("2.Add a Country");	
System.out.println("3.Exit");
System.out.println("Enter menu number");
int userInput = scanner.nextInt();
switch(userInput){
case 1:
	countries=  countriestextfile.readCountries();
	System.out.println(countries);
	break;
case 2:

	System.out.println("Enter Country name");
	countries.removeAll(countries);
	String cname = scanner.next();
 	countries.add(cname);
 	countriestextfile.saveCountries(countries);
	System.out.println("This Country has been saved");
	break;
case 3:
	System.out.println("Buh-bye!");
	choice = "n";
	break;
default:
	System.out.println("Invalid selection");
	break;
	}

}while(choice.equals("y"));
	
	
}
	
}
