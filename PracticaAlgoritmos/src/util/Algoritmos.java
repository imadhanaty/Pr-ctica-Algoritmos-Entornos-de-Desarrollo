package util;
/**
 * métodos para cálculos 
 */
public abstract class Algoritmos {
	/**
     * Calcula el numero de Fibonacci
     * @param numero El numero para el cual se calculara el número de Fibonacci
     * @return El numero de Fibonacci 
     */
	public static int fibonacci(int numero) {
        if (numero <= 1)
            return numero;
        else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
	/**
     * Calcula el factorial 
     * @param numero El numero para el cual se calculara el factorial
     * @return El factorial del numero 
     */
	public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
	 /**
     * Verifica .
     * @param numero El numero que se verificara
     * @return true si el numero es primo, false si es el contario
     */
	
	 public static boolean esPrimo(int numero) {
	        if (numero <= 1)
	            return false;
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0)
	                return false;
	        }
	        return true;
	    }
}
