package com.fundamentals1_1;

import java.util.Scanner;

public class MatrixLibraryTestFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test dot product
        System.out.println("Enter the length of vectors for dot product:");
        int length = scanner.nextInt();
        double[] vectorX = new double[length];
        double[] vectorY = new double[length];

        System.out.println("Enter values for vector X:");
        for (int i = 0; i < length; i++) {
            vectorX[i] = scanner.nextDouble();
        }

        System.out.println("Enter values for vector Y:");
        for (int i = 0; i < length; i++) {
            vectorY[i] = scanner.nextDouble();
        }

        double dotProduct = MatrixLibrary.dot(vectorX, vectorY);
        System.out.println("Dot product: " + dotProduct);

        // Test matrix-matrix multiplication
        System.out.println("Enter dimensions for matrix A (rows columns):");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        double[][] matrixA = new double[rowsA][colsA];

        System.out.println("Enter values for matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter dimensions for matrix B (rows columns):");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        double[][] matrixB = new double[rowsB][colsB];

        System.out.println("Enter values for matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        double[][] productMatrix = MatrixLibrary.mult(matrixA, matrixB);
        System.out.println("Matrix product:");
        for (double[] row : productMatrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Test matrix transpose
        double[][] transposedMatrix = MatrixLibrary.transpose(matrixA);
        System.out.println("Transposed matrix:");
        for (double[] row : transposedMatrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Test matrix-vector multiplication
        System.out.println("Enter the length of the vector for matrix-vector multiplication:");
        int vectorLength = scanner.nextInt();
        double[] vectorXForMatrix = new double[vectorLength];

        System.out.println("Enter values for the vector:");
        for (int i = 0; i < vectorLength; i++) {
            vectorXForMatrix[i] = scanner.nextDouble();
        }

        double[] resultVector = MatrixLibrary.mult(matrixA, vectorXForMatrix);
        System.out.println("Matrix-vector product:");
        for (double value : resultVector) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Test vector-matrix multiplication
        double[] vectorYForMatrix = new double[rowsA];

        System.out.println("Enter values for the vector:");
        for (int i = 0; i < rowsA; i++) {
            vectorYForMatrix[i] = scanner.nextDouble();
        }

        double[] resultVectorFromMatrix = MatrixLibrary.mult(vectorYForMatrix, matrixA);
        System.out.println("Vector-matrix product:");
        for (double value : resultVectorFromMatrix) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}
