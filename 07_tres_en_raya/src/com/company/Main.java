package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {




    public static boolean comprobarGanador(int[][] t){


        for (int i = 0; i < 2 ; i++) {


            if ((t[0][0] == i) && (t[0][1] == i) && (t[0][2] == i)) {
                return true;
            }
            if ((t[1][0] == i) && (t[1][1] == i) && (t[1][2] == i)) {
                return true;
            }
            if ((t[2][0] == i) && (t[2][1] == i) && (t[2][2] == i)) {
                return true;
            }


            for (int j = 0; j < 3; j++) {
                if ((t[0][j] == i) && (t[1][j] == i) && (t[2][j] == i)) {
                    return true;
                }
            }



            if ((t[0][0] == i) && (t[1][1] == i) && (t[2][2] == i)) {
                return true;
            }
            if ((t[0][2] == i) && (t[1][1] == i) && (t[2][0] == i)) {
                return true;
            }


        }

        return false;
    }




    public static void visualizarTablero(int[][] t) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                switch (t[i][j]) {
                    case 0:
                        System.out.println(" O ");
                        break;
                    case 1:
                        System.out.println(" X ");
                        break;
                    case 7:
                        System.out.println(" . ");
                        break;


                }

            }

            System.out.println();


        }


    }








        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[][] t = new int[3][3];

            // inicializar las casillas vacías
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    t[i][j] = 7;


                }
            }


            // mostrar el tablero
            visualizarTablero(t);

            // ver a quien le toca jugar
            int turno = 0;

            int tiradas = 0;

            do {
                // el usuario elija casilla
                System.out.print("fila (0-2): ");
                int fila = Integer.parseInt(br.readLine());

                System.out.println("columna(0-2): ");
                int columna = Integer.parseInt(br.readLine());

                // ver si la tirada es válida y actualizar tablero
                if (t[fila][columna] == 7) {
                    // válida
                    t[fila][columna] = turno;

                    // contabilizar tirada
                    tiradas +=1;

                    // cambio turno
                    if (turno == 0) {
                        turno = 1;
                    } else {
                        turno = 0;
                    }

                    // mostrar tablero
                    visualizarTablero(t);


                } else {
                    System.err.println("Casilla ocupada...");
                }

            }while(tiradas < 9 && !comprobarGanador(t));

            if(tiradas < 9){
                System.out.println("enhorabuena!! has ganado");
            }else{
                System.out.println("empate");
            }



















    }
}
