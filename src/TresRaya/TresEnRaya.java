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
		int [][] tablero = {{'*','*','*'},
							{'*','*','*'},
							{'*','*','*'}};
		
		//Pregunto los nombres de los jugadores y guardo la respuesta en las variables
		System.out.println("Introduce nombre de jugador 1:");
		jugador1 = in.nextLine();
		System.out.println("Introduce nombre de jugador 2:");
		jugador2 = in.nextLine();
		
		/*Random entre dos opciones, si sale 0 jugador1, si sale 1 es jugador2
		es como hacer un if.*/
		String primeroQueJuega = moneda.nextInt(2) == 0 ? jugador1 : jugador2;
		System.out.println("Primero le toca jugar a " + primeroQueJuega);
		
		do {
			
			
		}while(primeroQueJuega == jugador1);
		
		
		do {
			
		}while(primeroQueJuega == jugador2);
		
		
	}

}
