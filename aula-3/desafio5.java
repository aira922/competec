package aula3;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String senha;
String tentativa;


System.out.println("Digite sua senha verdadeira: ");
senha = sc.next();
boolean continua=true;
while(continua) {
	System.out.println("Digite a senha: ");
	tentativa = sc.next();
	if(senha.equals(tentativa)) {
		System.out.println("Acesso permitido");
		continua = false;
		break;
	} else {
		System.out.println("Senha inválida");
		continua = true;
	}
}
	}

}
