package aula3;

import java.util.Scanner;

public class exTempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t1, t2, t3, t4, t5, tVerd1, tVerd2, tVerd3, tVerd4, tVerd5, maiorNumero=0;
Scanner sc = new Scanner(System.in);
System.out.println("Quanto tempo o aluno 1 demora para chegar na aula?");
t1 = sc.nextInt();
System.out.println("Quanto tempo o aluno 2 demora para chegar na aula?");
t2 = sc.nextInt();
System.out.println("Quanto tempo o aluno 3 demora para chegar na aula?");
t3 = sc.nextInt();
System.out.println("Quanto tempo o aluno 4 demora para chegar na aula?");
t4 = sc.nextInt();
System.out.println("Quanto tempo o aluno 5 demora para chegar na aula?");
t5 = sc.nextInt();

tVerd1 = t1*5;
tVerd2 = t2*t2;

if(t3%2==0) {
	tVerd3 = t3/2;
} else {
	tVerd3= t3*2;
}

tVerd4 = tVerd3*3;
tVerd5=t5-(t1*2);

if (tVerd1>maiorNumero) {
	maiorNumero = tVerd1;
} 
if (tVerd2>maiorNumero) {
	maiorNumero = tVerd2;
} 
if (tVerd3>maiorNumero) {
	maiorNumero = tVerd3;
} 
if (tVerd4>maiorNumero) {
	maiorNumero = tVerd4;
} 
if (tVerd5>maiorNumero) {
	maiorNumero = tVerd5;
} 
System.out.println(maiorNumero);
}

}
