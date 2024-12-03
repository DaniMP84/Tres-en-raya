package TresRaya;

import java.util.Random;
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

		//Bienvenida al juego y mpstrar el tablero
		System.out.println("******************************************");
		System.out.println("***Bienvenido al juego del tres en raya***");
		System.out.println("******************************************");
		System.out.println();
        System.out.println("Este es el tablero:");
        
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
		String primeroQueJuega = moneda.nextInt(2) == 0 ? jugador1 : jugador2;
		System.out.println("Se ha lanzado una moneda, primero le toca jugar a " + primeroQueJuega);
		
		
		do {
			System.out.println("Le toca tirar a: " + jugador1);
			int fila = in.nextInt();
			int columna = in.nextInt();
			if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Error: La ubicación indicada no existe en el tablero");
            } else if (tablero[fila][columna] == '*') {
                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
            } else {
                tablero[fila][columna] = '*';
                System.out.println("Tirada realizada");
            }
		}while(primeroQueJuega == jugador1);
		
		
		do {
			System.out.println("Le toca tirar a: " + jugador2);
			int fila = in.nextInt();
			int columna = in.nextInt();
			if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Error: La ubicación indicada no existe en el tablero");
            } else if (tablero[fila][columna] == '*') {
                System.out.println("Error: Ese hueco ya esta ocupado, intentalo de nuevo");
            } else {
                tablero[fila][columna] = '*';
                System.out.println("Tirada realizada");
            }
			
		}while(primeroQueJuega == jugador2);
		
		
	}

}
