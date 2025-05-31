import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
	  	int n;
	  	System.out.println("Digite um valor: ");
	  	n = sc.nextInt();
	  	while(n!=0){
	  	for (int i =0; i<n; i++){
	  	    System.out.print("X");
	  	}
	  	 System.out.println(" ");
	  	n = n-1;
	  	}
	    
	    
	//	for(int i=0; i<=1000; i ++) {
	//		if(i%10==0) {
	//			System.out.println(i);
	//		}
	//	}
	//	int numeros [] = {3, 6, 8};
	

	/*int n = 0;
		System.out.println("Digite o tamanho do arranjo: ");
 n = sc.nextInt();
	int arranjo [] = new int [n];

 
 for(int i=0; i< arranjo.length; i++){
     System.out.println("Digite o "+(i+1)+"º valor: ");
     arranjo[i] = sc.nextInt();
 }
  for(int i=0; i< arranjo.length; i++){
     System.out.println(arranjo[i]);
 }*/
	}
}
