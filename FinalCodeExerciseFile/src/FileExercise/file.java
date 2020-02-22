package FileExercise;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Assignement FinalCodeExerciseFile
// Program file
// Author Christian Makoma
// Created Dec 9, 2019

public class file {
	/**
	 * 
	 * @param args
	 * Diamond.txt was created before running this program
	 * Diamond2.txt change x to o
	 */

	public static void main(String[] args) {
		

		String filename = "Diamond2.txt";
		String line = null;	
		
		
		try(Scanner reader= new Scanner(file.class.getResourceAsStream("Diamond.txt"));
				PrintWriter writer = new PrintWriter(filename);
				)
			{
				
				do {
					line = reader.nextLine();
					Pattern pattern = getPattern(line);
					System.out.println(pattern);
					writer.println(pattern);
					
					
					
					
				} while (reader.hasNext());
				
				
				
			} catch (FileNotFoundException e) {
				System.err.println("File not found");
			} 
			
			
		}

	/**
	 * 
	 * @param line : get passed from main
	 * @return each class returns accordingly;
	 * No error expected from these classes
	 */
	
	private static Pattern getPattern(String line) {
		try {
			return new Pattern(line);
		} catch (Exception e) {
			System.err.println("Unexpected Error");
		}
		return null;
	}


}
