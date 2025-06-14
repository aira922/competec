import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//desafo 1
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
// desafio 2
int lin = 2;
int col = 2;
	int tabela [][]= {{0,1}, {2,3}};
for(int i =0; i <lin; i++){
    for(int j =0;j<col;j ++){
    System.out.print(tabela[i][j] + " ");
}
System.out.println(" ");
}

//desafio 3
	Scanner sc = new Scanner(System.in);
		int lin = 3;
		int col = 3;
int matriz [] [] = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println(matriz[1][1]);

int matriz2 [] [] = new int [lin][col];
for (int i = 0; i<lin; i++){
    for(int j=0; j<col; j++){
      matriz[i][j] = sc.nextInt();
    }
}
for (int i = 0; i<lin; i++){
    for(int j=0; j<col; j++){
        System.out.print(matriz[i][j]+" ");
    }
    System.out.println(" ");
}
