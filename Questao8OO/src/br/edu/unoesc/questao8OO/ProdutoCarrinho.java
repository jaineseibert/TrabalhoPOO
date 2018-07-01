package br.edu.unoesc.questao8OO;

public class ProdutoCarrinho {

	private Produto produto;
	private Double quantidade;
	private Double valor;
	
	public Produto getProduto() {
		return produto;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}

	public Double getValor() {
		return valor;
	}
	
	
	public ProdutoCarrinho(Produto produto, Double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = quantidade * (produto.calcularProdutoComDesconto());
	}
}
