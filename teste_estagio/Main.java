package teste_estagio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do Cliente: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data Atual:(DD/MM/AAAA) ");
		String data = sc.nextLine();
		
		System.out.print("Nome do Cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Numero de Produtos: ");
		int n = sc.nextInt();
		System.out.println("\n----------------------------------------------------------------------");
		Venda[] vect = new Venda[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Nome do Produto " + i +": ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Quantidade do Produto " + i +": ");
			int qtdProduto = sc.nextInt();
			
			System.out.print("Preço do Produto " + i +": ");
			double valProduto = sc.nextDouble();
			System.out.println("\n");
		
			vect[i] = new Venda(nomeProduto, qtdProduto, valProduto);
			System.out.println(vect[i]);
			System.out.println("\n----------------------------------------------------------------------");
		}
		
		System.out.println("Gostaria de imprimir a venda? (sim/nao)");
		sc.nextLine();
		String resposta = sc.nextLine();
		
		if(resposta.equals("sim") || resposta.equals("Sim")) {
			System.out.println("\nCódigo:" + codigo + "\nData:" + data + "\nNome do Cliente:" + nomeCliente + "\n");
			System.out.println("Detalhes da Venda:");
				for (int i=0; i<n; i++) {
					if (vect[i] != null) {
						System.out.println("PRODUTO " + i + ": " + "\n" + vect[i]);
					}
				}
			double soma = 0.0;
			for (int i=0; i<n; i++) {
				soma += vect[i].valorTotal();
			}
			System.out.printf("TOTAL: %.2f%n", soma);
			System.out.println("\nObrigado e volte sempre!");
		}
		else{
			System.out.println("A venda não foi impressa.");
		}
		sc.close();
	}
}
