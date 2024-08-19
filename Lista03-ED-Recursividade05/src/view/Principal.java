package view;

import controller.FibonacciController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		FibonacciController fibonacci = new FibonacciController();
		
		int n = 0;
		while (n < 1 || n > 20) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 20: "));
		}
		
		int resultado = fibonacci.Fibonacci(n);
		
		System.out.println("O valor da série na posição " + n + " é de: " + resultado);
	}
}
