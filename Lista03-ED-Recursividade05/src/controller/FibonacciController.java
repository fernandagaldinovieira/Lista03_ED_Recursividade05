package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}
	
	public int Fibonacci(int n) {
		
		//Condição de parada: Se o número (n) for 1 ou 2, a função retorna 1, que são os primeiros dois números da série de Fibonacci.
		if (n == 1 || n == 2) {
			return 1;
		} else {
			// O valor de Fibonacci na posição n é a soma dos dois números anteriores a n.
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
