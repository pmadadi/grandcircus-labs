import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * 
 * @author Pappu
 *
 */
public class CountriesTextFile {
	/**
	 * 
	 */
	private Path filePath;
/**
 * 
 * @param filePathString
 */
	
public CountriesTextFile(String filePathString){
	this.filePath = Paths.get(filePathString);
}
/**
 * 
 */
public CountriesTextFile(){
	this("C:/Users/Pappu/workspace/Labs/src/countries.txt");
}
/**
 * 
 * @return
 */
public List<String> readCountries(){
	List<String> countries = new ArrayList<>();
	if(!Files.exists(filePath)){
		return countries;
		/**
		 * 
		 */
	}
	try {
		File file = filePath.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = reader.readLine();
		while (line != null){
			countries.add(line);
			line = reader.readLine();
		}
		reader.close();
		return countries;
/**
 * 		
 */
		
	}catch (IOException ex) {
		throw new RuntimeException("Unable to read countries.", ex);
	}
	
}	
/**
 * 
 * @param countries
 */
	
public void saveCountries(List<String> countries) {
	try {
		if (!Files.exists(filePath)) {
			Files.createFile(filePath);
		}
		
		File file = filePath.toFile();
		PrintWriter writer = new PrintWriter(
		                     new BufferedWriter(
		                     new FileWriter(file, true))); 
		
		for (String country : countries) {
			writer.println(country);
			
		}
		
		writer.close();
	} catch (IOException ex) { // IOException is a checked exception (I have to handle it)
		// RuntimeException is an unchecked exception (I don't have to handle it)
		throw new RuntimeException("Unable to save countries.", ex);
	}
}

public void saveCountries(String ch) {
	// TODO Auto-generated method stub
	
}
	
		
	
	

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

