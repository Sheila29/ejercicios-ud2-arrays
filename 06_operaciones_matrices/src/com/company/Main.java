package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    // La suma de las dos matrices.
    public static int[][] sumaMatriz(int[][] m1, int[][] m2){

        int filas = m1.length; // filas de la matriz
        int columnas = m1[0].length;

        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }

    // El producto de la primera por un escalar (se lo pediremos al usuario).
    public static int[][] productoEscalar(int[][] m1, int n){

        int filas = m1.length; // filas de la matriz
        int columnas = m1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = n * m1[i][j];
            }
        }
        return resultado;

    }

    // El producto de las dos matrices.
    public static int[][] productoDosMatrices(int[][] m1, int[][] m2) {

        int filas = m1.length; // filas de la matriz
        int columnas = m1[0].length;

        int[][] multiplicacion = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < columnas; k++) {
                    multiplicacion[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return multiplicacion;
    }


    // La traspuesta de la segunda matriz.
    public static int[][] traspuestaSegundaMatriz(int[][] m1){

        int filas = m1.length; // filas de la matriz
        int columnas = m1[0].length;

        int[][] matrizTras = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTras[i][j] = m1[j][i];

            }
        }

        return matrizTras;
    }

    public static void visualizarMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.format("%4d", matriz[i][j]);

            }
            System.out.println();
        }

        System.out.println();
    }


    public static void main(String[] args) throws IOException {

        // Declarar las variables
        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        // Generador de números aleatorios
        Random r = new Random(5);

        // Inialización de las matrices
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m1[i][j] = r.nextInt(10);
                m2[i][j] = r.nextInt(10);


            }


        }

        // Visualizar
        System.out.println("m1");
        visualizarMatriz(m1);
        System.out.println("m2");
        visualizarMatriz(m2);

        // Sumar las matrices
        System.out.println("Suma m1 + m2");
        visualizarMatriz(sumaMatriz(m1, m2));

        // Producto por un escalar
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.println("Producto de m1 x n");
        visualizarMatriz(productoEscalar(m1,numero));

        // Producto dos matrices
        System.out.println("Producto m1 x m2");
        visualizarMatriz(productoDosMatrices(m1, m2));

        // Traspuesta segunda matriz
        System.out.println("Matriz inversa");
        visualizarMatriz(traspuestaSegundaMatriz(m1));








    }
}
