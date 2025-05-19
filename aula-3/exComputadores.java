package aula3;

import java.util.Scanner;

public class exComputadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int C1, C2, C3, C4, A1, A2, A3, A4;
Scanner sc = new Scanner(System.in);
System.out.println("Quantos computadores o laboratório 1 possui?");
C1 = sc.nextInt();
System.out.println("Quantos alunos ele possui?");
A1 = sc.nextInt();
System.out.println("Quantos computadores o laboratório 2 possui?");
C2 = sc.nextInt();
System.out.println("Quantos alunos ele possui?");
A2 = sc.nextInt();
System.out.println("Quantos computadores o laboratório 3 possui?");
C3 = sc.nextInt();
System.out.println("Quantos alunos ele possui?");
A3 = sc.nextInt();
System.out.println("Quantos computadores o laboratório 4 possui?");
C4 = sc.nextInt();
System.out.println("Quantos alunos ele possui?");
A4 = sc.nextInt();

if (A1>40) {
	System.out.println("Fica para a próxima...");
} else if (A2%2==1 ) {
	System.out.println("Fica para a próxima...");
} else if (A3>(C3/2)) {
	System.out.println("Fica para a próxima...");
} else if (A4%10!=7) {
	System.out.println("Fica para a próxima...");
} else {
	System.out.println("HABEMUS AULA!");
}
	}

}
