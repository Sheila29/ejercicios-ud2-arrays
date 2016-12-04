package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[][] juego = new int[3][3];
    public static int jugada;

    public static boolean comprobarGanador(int jugada){


        if((juego[0][0]==jugada) && (juego[0][1]==jugada) && (juego[0][2]==jugada)){
            return true;
        }
        if((juego[1][0]==jugada) && (juego[1][1]==jugada) && (juego[1][2]==jugada)){
            return true;
        }
        if((juego[2][0]==jugada) && (juego[2][1]==jugada) && (juego[2][2]==jugada)){
            return true;
        }
        if((juego[0][0]==jugada) && (juego[2][0]==jugada) && (juego[3][0]==jugada)){
            return true;
        }
        if((juego[0][1]==jugada) && (juego[1][1]==jugada) && (juego[2][1]==jugada)){
            return true;
        }
        if((juego[0][2]==jugada) && (juego[1][2]==jugada) && (juego[2][2]==jugada)){
            return true;
        }
        if((juego[0][0]==jugada) && (juego[1][1]==jugada) && (juego[2][2]==jugada)){
            return true;
        }
        if((juego[0][2]==jugada) && (juego[1][1]==jugada) && (juego[2][0]==jugada)){
            return true;
        }
        return false;
    }



    public static void visualizarTablero(){

        int filas_tablero;
        int columnas_tablero;

        System.out.println("-------------");
        for(int i = 0; i < juego.length;i++){
            for(int j=0; j< juego.length;j++){

                if(juego[i][j]==0){
                    System.out.print("| " + juego[i][j] + " ");
                }
                if (juego[i][j]==1)
                {
                    System.out.print("| " + "X" + " ");

                }
                if (juego[i][j]==3)
                {
                    System.out.print("|" + "  ");

                }
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("-------------");

    }

    public static void limpiarTablero(){
        for(int i = 0; i < juego.length;i++){
            for(int j = 0; j < juego.length;j++){
                juego[i][j]=3;
            }
        }
    }


        public static void comenzarJuego(int fila, int columna)  {

            boolean partidaTerminada = false;

            if (juego[fila][columna] == 3) {
                boolean ganador;
                juego[fila][columna] = jugada;
                visualizarTablero();
                ganador = comprobarGanador(jugada);

                if (ganador) {
                    System.out.println("Ha ganado " + jugada);
                    partidaTerminada = true;
                    limpiarTablero();

                } else {
                    int empate = 0;
                    for (int i = 0; i <= 2; i++) {
                        for (int j = 0; j <= 2; j++) {
                            if ((juego[i][j] == 0) || (juego[i][j] == 1)) {
                                empate = empate + 1;
                            }
                        }
                    }
                    if (empate == 9) {
                        System.out.println("Se ha empatado");
                        partidaTerminada = true;

                    }
                    if (jugada == 1) {
                        jugada = 0;
                    } else {
                        if (jugada == 0) {
                            jugada = 1;
                        }


                    }

                }
            }
        }


        public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("¿Cómo quieres jugar X/0?");
            String juego = br.readLine();

            int jugada = 0;
            if(juego.equalsIgnoreCase("0")){
                jugada = 0;
            }
            if(juego.equalsIgnoreCase("X")){
                jugada = 1;
            }

            if(juego.equalsIgnoreCase("X") || (juego.equalsIgnoreCase("0"))){
                System.out.println("Comienza el 0");
                System.out.println("");



            }

                    System.out.println("Introduce coordenadas de posición: (0,0) ");
                    System.out.println("Introduce la fila");
                    int fila= Integer.parseInt(br.readLine());

                    System.out.println("Introduce la columna");
                    int columna= Integer.parseInt(br.readLine());





    }
}
