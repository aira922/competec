import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maiorNumero=0;
		int menorNumero =Integer.MAX_VALUE;
		int vetor [] = new int[10];
		for (int i = 0; i<10; i++) {
			vetor[i]= sc.nextInt();
		}
		for (int  i = 0; i<10; i++) {
			if (vetor[i]>maiorNumero) {
				maiorNumero =vetor[i] ;
			}
		}
		for (int  i = 0; i<10; i++) {
			if (vetor[i]<menorNumero) {
				menorNumero=vetor[i]   ;
			}
		}
			System.out.println("Maior: "+maiorNumero);
			System.out.println("Menor: "+menorNumero);
	}
}
