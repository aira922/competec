public class Main
{
	public static void main(String[] args) {
      		 // 01.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Nome: " + nome);

		// 02.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String nome = sc.nextLine();
		int tamanhoNome = nome.length();
		System.out.println("OlC!, " + nome + ", seu nome tem " + tamanhoNome + " caracteres.");

		// 03.
		Scanner sc = new Scanner(System.in);
		String palavraSecreta = "BATATA";
		System.out.println("Qual é a palavra secreta?");
		String tentativa = sc.nextLine();
		if (tentativa.equalsIgnoreCase(palavraSecreta)){
		    System.out.println("Parabéns, você acertou!");
		} else {
		    System.out.println("Que pena, você errou!");
		}

		// 04.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a lista de nomes separados por espaço: ");
		String listaNomes = sc.nextLine();
		String[] nomes = listaNomes.split(" ");
		System.out.println(nomes[1]);
	}
}
