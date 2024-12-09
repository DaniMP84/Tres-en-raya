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
		int contador = 9;
		
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
			System.out.println("Se ha lanzado una moneda, el primero que juega es " + jugador2);
		}
		
		
		for(int i = 1; i < contador; i++) {
			if(primeroQueJuega.equals("0")) {
				System.out.println("Le toca tirar a " + jugador1 + ", coloca tu ficha:");
				int fila = in.nextInt() -1;
				int columna = in.nextInt() -1;
				if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
	                System.out.println("Error: La ubicación indicada no existe en el tablero");
	            } else if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
	                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
	            } else {
	                tablero[fila][columna] = 'X';
	                System.out.println("Tirada realizada");
	            }
				//Imprimo el estado actual del tablero
		        for (int l = 0; l < FILAS; l++) {
		            for (int j = 0; j < COLUMNAS; j++) {
		                System.out.print(tablero[l][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println("Le toca tirar a " + jugador2 + ", coloca tu ficha:");
		        int fila2 = in.nextInt() -1;
		        int columna2 = in.nextInt() -1;
		        if (fila2 < 0 || fila2 >= FILAS || columna2 < 0 || columna2 >= COLUMNAS) {
		        	System.out.println("Error: La ubicación indicada no existe en el tablero");
		        } else if (tablero[fila2][columna2] == 'X' || tablero[fila2][columna2] == 'O') {
		        	System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
		        } else {
		        	tablero[fila2][columna2] = 'O';
		        	System.out.println("Tirada realizada");
		        }
		        //Imprimo el estado actual del tablero
		        for (int k = 0; k < FILAS; k++) {
		        	for (int j = 0; j < COLUMNAS; j++) {
		        		System.out.print(tablero[k][j] + " ");
		        	}
		        	System.out.println();
		        }
			}

		//condicional identico al primero pero con los players cambiados.
		if(primeroQueJuega.equals("1")) {
			System.out.println("Le toca tirar a " + jugador2 + ", coloca tu ficha:");
			int fila = in.nextInt() -1;
			int columna = in.nextInt() -1;
			if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Error: La ubicación indicada no existe en el tablero");
            } else if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
            } else {
                tablero[fila][columna] = 'O';
                System.out.println("Tirada realizada");
            }
			//Imprimo el estado actual del tablero
	        for (int k = 0; k < FILAS; k++) {
	            for (int j = 0; j < COLUMNAS; j++) {
	                System.out.print(tablero[k][j] + " ");
	            }
	            System.out.println();
	        }				
			System.out.println("Le toca tirar a " + jugador1 + ", coloca tu ficha:");
			int fila3 = in.nextInt() -1;
			int columna3 = in.nextInt() -1;
			if (fila3 < 0 || fila3 >= FILAS || columna3 < 0 || columna3 >= COLUMNAS) {
            System.out.println("Error: La ubicación indicada no existe en el tablero");
			} else if (tablero[fila3][columna3] == 'X' || tablero[fila3][columna3] == 'O') {
            System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
			} else {
					tablero[fila3][columna3] = 'X';        
					System.out.println("Tirada realizada");
			}if(tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X' || 
					tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X' || 
					tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X' ||
					tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X' || 
					tablero[2][0] == 'X' && tablero[1][1] == 'X' && tablero[0][2] == 'X' || 
					tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X' ||
					tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X' || 
					tablero[0][2] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X'){
				System.out.println("Enhorabuena " + jugador1 + " has ganado!!");
			}
			//Imprimo el estado actual del tablero
			for (int k = 0; k < FILAS; k++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[k][j] + " ");
            }
            System.out.println();
        }
	 }
	}
 }
}
