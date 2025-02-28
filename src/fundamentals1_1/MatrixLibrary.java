package com.fundamentals1_1;

public class MatrixLibrary {

    // Computes the dot product of two vectors
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Vectors must be of the same length.");
        }
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    // Computes the matrix-matrix product
    public static double[][] mult(double[][] a, double[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;

        if (n != b.length) {
            throw new IllegalArgumentException("Number of columns of A must be equal to the number of rows of B.");
        }

        double[][] result = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Computes the transpose of a matrix
    public static double[][] transpose(double[][] a) {
        int m = a.length;
        int n = a[0].length;

        double[][] result = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    // Computes the matrix-vector product
    public static double[] mult(double[][] a, double[] x) {
        int m = a.length;
        int n = a[0].length;

        if (n != x.length) {
            throw new IllegalArgumentException("Number of columns of A must be equal to the length of vector X.");
        }

        double[] result = new double[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += a[i][j] * x[j];
            }
        }
        return result;
    }

    // Computes the vector-matrix product
    public static double[] mult(double[] y, double[][] a) {
        int m = a.length;
        int n = a[0].length;

        if (y.length != m) {
            throw new IllegalArgumentException("Length of vector Y must be equal to the number of rows of matrix A.");
        }

        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i] += y[j] * a[j][i];
            }
        }
        return result;
    }
}
