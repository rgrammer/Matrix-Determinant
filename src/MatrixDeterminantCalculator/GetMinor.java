package MatrixDeterminantCalculator;

public class GetMinor {

	/**
     * Computes the minor of the matrix m without the i-th row and the j-th column
     * 
     * @param m input matrix
     * @param i removes the i-th row of m
     * @param j removes the j-th column of m
     * @return minor of m
     */
    public static double[][] minor(final double[][] m, final int i, final int j) {
        int n = m.length;
        double[][] minor = new double[n-1][n-1];
        // index for minor matrix position:
        int r = 0, s = 0;
        for (int k = 0; k < n; k++) {
            double[] row = m[k];
            if (k != i) {
                for (int l = 0; l < row.length; l++) {
                    if (l != j) {
                        minor[r][s++] = row[l];
                    }
                }
                r++;
                s = 0;
            }
        }
        return minor;
    }
 
}
