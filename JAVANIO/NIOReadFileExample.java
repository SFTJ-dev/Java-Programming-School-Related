import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

public class NIOReadFileExample{
	
	public static void main(String[] args){
	//Specify the path to the text file
	String fileName = "myFiles.txt"; //Update the file path accordingly
	
	//Create a Path object
	Path path = Paths.get(fileName);
	
	try{
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
		//Print each line to the console
		for (String line : allLines){
			System.out.println(line);
			}
		} catch (IOException e){
			//Handle the exception if there is an issue reading the file
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}
