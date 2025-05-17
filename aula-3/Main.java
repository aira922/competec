import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int item=0;
	   int quantidade=0;
	   double hamburguer = 19.99;
	   double suco = 15.00;
	   double batata_frita=16.99;
	   double refrigerante=16.00;
	   double carrinho_do_itu = 0;
	   double carteira_do_itu= 0;
	   
	   System.out.println("Selecione o item que gostaria de pedir: 1-)Hambúrguer 2-)Suco 3-)Batata Frita 4-)Refrigerante");
	   item = sc.nextInt();
	   System.out.println("Quantas unidades você gostaria?");
	   quantidade = sc.nextInt();
	   
	   switch(item){
	  case 1:
	      carrinho_do_itu += hamburguer*quantidade;
	   break;
	  case 2:
	      carrinho_do_itu += suco*quantidade;
	   break;
	  case 3:
	      carrinho_do_itu += batata_frita*quantidade;
	   break;
	  case 4:
	      carrinho_do_itu += refrigerante*quantidade;
	   break;
	  default:
	   }
	   
System.out.println("Quanto dinheiro você tem?");
carteira_do_itu= sc.nextDouble();

if(carteira_do_itu>=carrinho_do_itu){
    System.out.println("Você pode concluir a compra");
} else if (carteira_do_itu<carrinho_do_itu){
    System.out.println("Você não tem dinheiro o suficiente");
}

	}
}
