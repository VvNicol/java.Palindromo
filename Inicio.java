/**
 * 
 */
package Controlador;

import java.util.Scanner;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese texto 1 ");
		String texto1 = sc.nextLine();
		String textoSinEspacio = texto1.trim();
		StringBuilder reverso = new StringBuilder(texto1);
		reverso.reverse();
		
		if(texto1.equals(reverso.toString())) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
		
		
	}

}
