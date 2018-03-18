/** Program: Programming Exercise 5
 * File:ProgramExercise.java
 * Summary: Reads text from file and converts it to PigLatin
 * Author: Brandon Labat
 * Date: March 18, 2018
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramExercise {
	public static void main(String[] args) {
		//variables
		String textFile = "";
		char[][] textArray;
		//try-catch
		try {//try begins
			BufferedReader br = new BufferedReader (new FileReader("text.txt"));
			
			String readLine = "";
			while(( readLine = br.readLine()) != null) { //while loop begins
				textFile += readLine;
				
			}//while loop ends
			
			br.close();
		}//end try
		catch (IOException e){// catch begins
				e.printStackTrace();
			}// catch ends
		textArray = LoadArray(textFile);
		outputArray(textArray);
	}// end main method
	public static char [][] LoadArray( String textFile){
		int count = 0;
		char[][]textArray = new char [20][45];
		
		for(int i = 0;i < 20; i++) {// start outer loop
			for(int j = 0; j < 40; j++) {//start inner loop
				if ( count < textFile.length()) {//begin if
				textArray[i][j] = textFile.charAt(count);
				
				count++;
				}//end if
				else {//begin else
				textArray[i][j] = '@';
				}//end else
			}//end inner loop
		}// end outer loop
		return textArray;
		}// end LoadArray method
	private static void outputArray(char[][]textArray) {
		StringBuilder outputFile = new StringBuilder();
		
		for ( int i = 0; i < 45; i++){// begin outer loop		
			for (int j = 0; j < 20; j++) { //begin inner loop
				outputFile.append(textArray[j][i]);
			}//end inner loop
		}//end outer loop
		System.out.println(outputFile);
	
	}// end outputArray method
	
}//End Class
