package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        final int MAX_PREG = 4;
        final int MAX_RESP = 4;


        // array de preguntas
        String[] pregunta = new String[MAX_PREG];

        // array de respuestas
        String[] respuesta = new String[MAX_RESP];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            // Introducimos preguntas y respuestas
            for (int i = 0; i < MAX_PREG; i++) {
                System.out.println("Introduce una pregunta: ");
                pregunta[i] = br.readLine();
            }


            for (int i = 0; i < MAX_RESP; i++) {
                System.out.println("Introduce la respuesta: ");
                respuesta[i] = br.readLine();
            }

            String decision = "";

            do{

            // Has acertado?
            int respuestaCorrecta = 0;
            int respuestaIncorrecta = 0;

            for (int i = 0; i < MAX_RESP; i++) {
                // Mostramos la respuesta
                System.out.println(respuesta[i]);
                System.out.println("¿Has acertado? S/N");
                String resultado = br.readLine();

                if (resultado.equalsIgnoreCase("S")) {
                    respuestaCorrecta += 1;
                }
                if (resultado.equalsIgnoreCase("N")) {
                    respuestaIncorrecta += 1;
                }

                System.out.println("Quieres probar con otra pregunta o FIN: ");
                decision = br.readLine();
            }

        } while (!decision.equalsIgnoreCase("FIN"));



    }
}
