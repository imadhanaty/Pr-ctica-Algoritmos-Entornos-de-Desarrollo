package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		// Crear un array de enteros 
        int[] numeros = new int[5];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(10) + 1;
        }
     // Calcular el numero de Fibonacci 
        int[] resultadoFibonacci = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
     // Calcular el factorial 
        int[] resultadoFactorial = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
     // Comprobar 
        boolean[] resultadoPrimos = new boolean[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }



		
	}

}
