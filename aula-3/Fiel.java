package aula3;

import java.util.Scanner;

public class Fiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n;
int pontuacao=0;
double m;
int menorNota=1001;
int maiorNota=0;

for(int i=0; i<10; i++) {
	System.out.println((i+1) + "º jurado, digite a nota: ");
	n = sc.nextInt();
	pontuacao+=n;
	if(n<menorNota) {
		menorNota=n;
	} 
	if(n>maiorNota) {
		maiorNota=n;
	}
}
pontuacao= pontuacao-(maiorNota+menorNota);
m = pontuacao/8;

if(m>=900) {
	System.out.println("ÉEEEEE CAMPEÃAAAA!!!!");
} else if (m<900){
	System.out.println("Fica pra próxima fiel...");
}
	}

}
