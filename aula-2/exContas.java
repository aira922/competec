package aula3;

import java.util.Scanner;

public class exContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n, m, r=0, om;
Scanner sc = new Scanner(System.in);

System.out.println("Qual primeiro número da conta?");
n = sc.nextDouble();
System.out.println("Qual o segundo número da conta?");
m = sc.nextDouble();
System.out.println("Qual o tipo de conta que deseja fazer? 1-)Adição 2-)Subtração 3-)Multiplicação 4-)Divisão");
om = sc.nextDouble();

if (om==1) {
	r = n+m;
} else if(om==2) {
	r = n-m;
} else if (om==3) {
	r = n*m;
} else if(om==4) {
	r = n/m;
} else {
	System.out.println("Essa opção não existe");
}

System.out.println("Resultado: " + r);
	}

}
