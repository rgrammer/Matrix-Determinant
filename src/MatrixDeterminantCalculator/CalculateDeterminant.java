package MatrixDeterminantCalculator;

public class CalculateDeterminant {

	 /**
     * This program calculates the determinant of a square matrix that is entered by the user
     * 
     * @param m Matrix
     * @return determinant
     */
    public static double determinant(double[][] m) {
    	//GetMinor calculateMinor = new GetMinor();
    	double det = 0;
        int n = m.length;
        if (n == 1) 
        {
            det = m[0][0];
        } 
        else if (n == 2)
        {
        	det = m[0][0]*m[1][1] - m[1][0]*m[0][1];
        }
        else 
        {
            det = 0;
            for (int j = 0; j < n; j++) 
            {
                det += Math.pow(-1, j) * m[0][j] * determinant(GetMinor.minor(m, 0, j));
            }
        }
        return det;
     }
}
