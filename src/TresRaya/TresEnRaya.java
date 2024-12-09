package TresRaya;

import java.util.*;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);		
		Random moneda = new Random();
		
		String jugador1;
		String jugador2;
		final int FILAS = 3;
		final int COLUMNAS = 3;
		char [][] tablero = new char [FILAS][COLUMNAS];
		
		
		//Asigno al tablero vacio un simbolo
		for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '*';
            }
        }

		//Bienvenida al juego
		System.out.println("******************************************");
		System.out.println("***Bienvenido al juego del tres en raya***");
		System.out.println("******************************************");
		System.out.println();
        System.out.println("Este es el tablero:");
        
        //Imprimo el estado inicial del tablero
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
		//Pregunto los nombres de los jugadores y guardo la respuesta en las variables
		System.out.println("Introduce nombre de jugador 1:");
		jugador1 = in.nextLine();
		System.out.println("Introduce nombre de jugador 2:");
		jugador2 = in.nextLine();
		
		/*Random entre dos opciones, si sale 0 jugador1, si sale 1 es jugador2
		es como hacer un if.*/
		/*String primeroQueJuega = moneda.nextInt(2) == 0 ? jugador1 : jugador2;*/
		String primeroQueJuega = Integer.toString(moneda.nextInt(2));		
		if (primeroQueJuega.equals("0")) {
			System.out.println("Se ha lanzado una moneda, el primero que juega es " + jugador1);
		}else {
			System.out.println("Se ha lanzado una moneda, el primero que juega es" + jugador2);
		}
		
		
		
		while(primeroQueJuega.equals(0)); {
			System.out.println("Le toca tirar a " + jugador1 + ", coloca tu ficha:");
			int fila = in.nextInt() -1;
			int columna = in.nextInt() -1;
			if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Error: La ubicación indicada no existe en el tablero");
            } else if (tablero[fila][columna] == 'X') {
                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
            } else {
                tablero[fila][columna] = 'X';
                System.out.println("Tirada realizada");
            }
			//Imprimo el estado actual del tablero
	        for (int i = 0; i < FILAS; i++) {
	            for (int j = 0; j < COLUMNAS; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
		}
		
		
		while(primeroQueJuega.equals(1)); {
			System.out.println("Le toca tirar a " + jugador2 + ", coloca tu ficha:");
			int fila = in.nextInt();
			int columna = in.nextInt();
			if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Error: La ubicación indicada no existe en el tablero");
            } else if (tablero[fila][columna] == 'X') {
                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
            } else {
                tablero[fila][columna] = 'X';
                System.out.println("Tirada realizada");
            }
			//Imprimo el estado actual del tablero
	        for (int i = 0; i < FILAS; i++) {
	            for (int j = 0; j < COLUMNAS; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
		}
		
		
	}

}
