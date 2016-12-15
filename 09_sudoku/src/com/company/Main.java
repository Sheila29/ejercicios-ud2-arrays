package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarSudoku(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[0][0] = 5;
                sudoku[1][0] = 6;
                sudoku[3][0] = 8;
                sudoku[4][0] = 4;
                sudoku[5][0] = 7;
                sudoku[0][1] = 3;
                sudoku[2][1] = 9;
                sudoku[6][1] = 6;
                sudoku[2][2] = 8;
                sudoku[1][3] = 1;
                sudoku[4][3] = 8;
                sudoku[7][3] = 4;
                sudoku[0][4] = 7;
                sudoku[1][4] = 9;
                sudoku[3][4] = 6;
                sudoku[5][4] = 2;
                sudoku[7][4] = 1;
                sudoku[8][4] = 8;
                sudoku[1][5] = 5;
                sudoku[4][5] = 3;
                sudoku[7][5] = 9;
                sudoku[6][6] = 2;
                sudoku[2][7] = 6;
                sudoku[6][7] = 8;
                sudoku[8][7] = 7;
                sudoku[3][8] = 9;
                sudoku[4][8] = 2;
                sudoku[5][8] = 6;
                sudoku[7][8] = 8;
                sudoku[8][8] = 7;


                switch ( sudoku[i][j]){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.format("%4d", sudoku[i][j]);
                        break;
                    case 0:
                        System.out.format("%4s", "-");
                        break;


                }

            }
            System.out.println();

        }
    }

    // El juego se ha terminado
    public static boolean terminado( int[][] sudoku ) {


        for (int f = 0; f < sudoku.length; f++)
            for (int c = 0; c < sudoku[0].length; c++)
                if (sudoku[f][c] == 0)
                    return false;


        return true;
    }

        // No sobrescribir valores
    public static boolean casillasVacias( int fila, int columna, int[][] sudoku){

        if ( sudoku[fila][columna] == -1)
            return false;

        return true;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] sudoku = new int[9][9];

        // Inicializar las casillas vacías
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = 0;


            }
        }



        visualizarSudoku(sudoku);

        System.out.print("Fila (1-9): ");
        int fila = Integer.parseInt(br.readLine())-1;
        System.out.print("Columna (1-9): ");
        int columna = Integer.parseInt(br.readLine())-1;
        System.out.println("Numero (1-9): ");
        int numero = Integer.parseInt(br.readLine())-1;


        // Ver si la tirada es válida y actualizar el tablero
        if (sudoku[fila][columna] == -1) {
            // Válida
            sudoku[fila][columna] = numero;

            visualizarSudoku(sudoku);

        } else {
            System.err.println("casilla ocupada...");
        }



    }
}
