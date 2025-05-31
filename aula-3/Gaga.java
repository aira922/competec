package aula3;

import java.util.Scanner;

public class Gaga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int N, Am=0, Eu=0, Af=0, As=0,  Oc=0, S=0;
	
	System.out.println("Quantos álbuns Stefani lançou? ");
	N = sc.nextInt();
	
	for(int i=0;i<N;i++) {
		System.out.println("Quantos ouvintes o álbum "+(i+1)+" tem na América?");
		Am += sc.nextInt();
		System.out.println("Quantos ouvintes o álbum "+(i+1)+" tem na Europa?");
		Eu += sc.nextInt();
		System.out.println("Quantos ouvintes o álbum "+(i+1)+" tem na África?");
		Af += sc.nextInt();
		System.out.println("Quantos ouvintes o álbum "+(i+1)+" tem na Ásia?");
		As += sc.nextInt();
		System.out.println("Quantos ouvintes o álbum "+(i+1)+" tem na Oceania?");
		Oc += sc.nextInt();
	}
	
	if(Am>100000) {
		S++;
	}
	if(Eu>100000) {
		S++;
	}
	if(Af>100000) {
		S++;
	}
	if(As>100000) {
		S++;
	}
	if(Oc>100000) {
		S++;
	}
	
	System.out.println("Quantidade de álbuns hitados: " + S);
	}

}
