package MatrixDeterminantCalculator;
import java.io.*;
import java.util.*;

public class UserInputMatrix {

			//asks the user to enter a square matrix of any order
			public void setElements() throws FileNotFoundException
			{

					Scanner input = new Scanner(System.in);
					//CalculateDeterminant Processor = new CalculateDeterminant();
					String fileName = "";
					System.out.println("Type the name the of file containing dimensions of your matrix and the matrix itself:");
					fileName = input.nextLine();
					
					Scanner scanIn = null;
					int Rowc = 0;	
					scanIn = new Scanner(new BufferedReader(new FileReader(fileName))); 
					
					//check to see if matrix is a square matrix
					if(scanIn.hasNextLine())
					{
						//read line from file
						String MatrixDimensions = "";
						MatrixDimensions = scanIn.nextLine();
						
						//split the input line into an array at the spaces
						//String[] DimensionsArray = MatrixDimensions.split(" ");
						
						StringTokenizer tokenizerDim = new StringTokenizer(MatrixDimensions);
						
						int n = Integer.parseInt(tokenizerDim.nextToken());
						int m = Integer.parseInt(tokenizerDim.nextToken());
						double[][] mat = new double[n][m];
						if(n == m)
						{
							System.out.println("The matrix you entered is:");
							while(scanIn.hasNextLine())
							{
								//read line from file
								String MatrixData = "";
								MatrixData = scanIn.nextLine();
								System.out.println(MatrixData);
								//split the input line into an array at the spaces
								StringTokenizer tokenizerData = new StringTokenizer(MatrixData);
								for (int x = 0; x < n; x++)
								{
									mat[Rowc][x] = Double.parseDouble(tokenizerData.nextToken());
								}
								Rowc++;
							}
							Double matDeterminant = CalculateDeterminant.determinant(mat);
							System.out.println("The determinant of the matrix is: " + matDeterminant);
						}
						else
						{
							System.out.println("You did not enter a square matrix");
						}
					}
					input.close();
				    scanIn.close();
			    
			}
}
