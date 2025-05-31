package aula3;

import java.util.Scanner;

public class dasafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String palavra;
System.out.println("Digite uma palavra: ");
palavra = sc.next();
		int rep = 0;
		while(rep<5) {
			System.out.println(palavra);
			rep++;
		}
	}

}
