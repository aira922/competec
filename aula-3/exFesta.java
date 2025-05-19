package aula3;

import java.util.Scanner;

public class exFesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double c, l, area;
int n;
Scanner sc= new Scanner(System.in);
System.out.println("Qual a largura do espaço da festa?");
l = sc.nextDouble();
System.out.println("Qual o comprimento do espaço da festa?");
c = sc.nextDouble();
System.out.println("Qual a quantidade de convidados?");
n = sc.nextInt();

area=l*c;

if(area<(n*2)) {
	System.out.println("Santa Rita realmente ficou pequena...");
} else if(area>=(n*2)) {
	System.out.println("JÁ É INTEEEEEEEEEEEEEEEEEEEEEEEER");
}
	}

}
