package br.com.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
	public int som(int num1, int num2) {
		
		return num1 + num2;
		
	}
	public int sub(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	public int div (int num1, int num2) {
		
		return num1 / num2;
	}
	
	public int multi(int num1, int num2) {
		
		return num1 * num2;
		
	}
	
public static void main (String args[]) {
	
	Calculadora c = new Calculadora();
	
	int opcao = 5;
	int num1;
	int num2;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("-Escolha uma opção-");
	System.out.println("1. Soma");
	System.out.println("2. Subtração");
	System.out.println("3. Multiplicação");
	System.out.println("4. Divisão");
	System.out.println("0. Sair");
	System.out.println("Operação: ");
	
	opcao = input.nextInt();
	
	while (opcao != 0) {
	
		if (opcao == 1) {
			
			Scanner input1 = new Scanner(System.in);
			
			System.out.println("Qual o primeiro numero: ");
				num1 = input1.nextInt();
			System.out.println("Qual o segundo numero: ");
				num2 = input1.nextInt();
			
					int operacao = c.som(num1, num2);
					
					System.out.println(operacao);
				break;
		}
				if (opcao == 2) {
					Scanner input1 = new Scanner(System.in);
					
					System.out.println("Qual o primeiro numero: ");
					num1 = input1.nextInt();
					System.out.println("Qual o segundo numero>: ");
					num2 = input1.nextInt();
						int operacao = c.sub(num1, num2);
						
								System.out.println(operacao);
					
					break;
				}
				if(opcao == 3) {
					Scanner input1 = new Scanner(System.in);
					
					System.out.println("Qual o primeiro numero: ");
					num1 = input1.nextInt();
					System.out.println("Qual o segundo numero>: ");
					num2 = input1.nextInt();
						int operacao = c.multi(num1, num2);
						System.out.println(operacao);
						
					break;
				}
				if (opcao == 4) {
					Scanner input1 = new Scanner(System.in);
					
				System.out.println("Qual o primeiro numero: ");
				num1 = input1.nextInt();
				System.out.println("Qual o segundo numero>: ");
				num2 = input1.nextInt();
					int operacao = c.div(num1, num2);
					
					System.out.println(operacao);
				break;
				}
				else {
					System.out.println("????");
					break;
			}
		}
	}
}
			