package teste_estagio;

public class Venda {
	
	private String nomeProduto;
	private int qtdProduto;
	private double valProduto;
	
	public Venda(String nomeProduto, int qtdProduto, double valProduto) {
		
		this.nomeProduto = nomeProduto;
		this.qtdProduto = qtdProduto;
		this.valProduto = valProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getValProduto() {
		return valProduto;
	}

	public void setValProduto(double valProduto) {
		this.valProduto = valProduto;
	}
	
	public double valorTotal() {
		return valProduto * qtdProduto;
	}
	
	public String toString() {
		return "Nome do Produto: " + nomeProduto +
				"\nQuantidade: " + qtdProduto + 
				"\nValor Individual: " + valProduto + 
				"\nValor Total: " + valorTotal() + "\n";
		}
	
}
