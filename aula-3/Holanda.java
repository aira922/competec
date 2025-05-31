package aula3;

import java.util.Scanner;

public class Holanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int I;
int p=0;
double S;
double proposta=0;
double melhorProposta=0;

for(int i=0; i <4; i++) {
	System.out.println("Proposta "+(i+1));
	System.out.println("De 0 a 10 o quão interessante o personagem é?");
	I = sc.nextInt();

	System.out.println("Qual é o salário oferecido?");
	S = sc.nextDouble();
	proposta = I*S;
	if (proposta>melhorProposta) {
		melhorProposta = proposta;
		p = (i+1);
	} 
}
System.out.println("A melhor proposta é a " + p);

	}

}
