
package aula3;

import java.util.Scanner;

public class exBarrinhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double DI, DC, P, X, T;
int N;
Scanner sc = new Scanner(System.in);

System.out.println("Quantos reais Itu levou?");
DI = sc.nextDouble();
System.out.println("Quantos reais Caio levou?");
DC = sc.nextDouble();
System.out.println("Quanto custa a barrinha?");
P = sc.nextDouble();
System.out.println("Quantas barrinhas devem ser compradas?");
N = sc.nextInt();

X = ((P*N)-(DI+DC));

	System.out.println(X);

	}

}
