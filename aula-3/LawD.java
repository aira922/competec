package aula3;

import java.util.Scanner;

public class LawD {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Lê o valor de N
	        int N;
	        do {
	            System.out.print("Digite um número inteiro e par: ");
	            N = scanner.nextInt();
	        } while (N % 2 != 0); // Garante que N seja par

	        // Primeira metade (linhas de 1 a N/2)
	        for (int L1 = 1; L1 <= N / 2; L1++) {
	            System.out.print("*");
	            for (int i = 0; i < 2 * L1; i++) {
	                System.out.print(" ");
	            }
	            System.out.println("*");
	        }

	        // Segunda metade (linhas de N/2+1 a N)
	        for (int L2 = N / 2 + 1; L2 <= N; L2++) {
	            int espacos = 2 * (N - L2 + 1);
	            System.out.print("*");
	            for (int i = 0; i < espacos; i++) {
	                System.out.print(" ");
	            }
	            System.out.println("*");
	        }

	        scanner.close();
	    }
	}