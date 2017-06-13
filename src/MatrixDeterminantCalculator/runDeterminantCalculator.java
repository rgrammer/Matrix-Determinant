package MatrixDeterminantCalculator;
import java.io.FileNotFoundException;
import java.util.*;

public class runDeterminantCalculator {

	/**
	* @param args
	 * @throws FileNotFoundException 
	*/

	/*This program allows the user to enter the name of a file
	 * which contains a square matrix of any order and it 
	 * returns the determinant of that matrix
	 */

	public static void main(String args[]) throws FileNotFoundException 
	{
		long startTime = System.nanoTime();
		//code
		
			UserInputMatrix userMatrix = new UserInputMatrix();
			userMatrix.setElements();
			
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " ns"); 
		
	}
}