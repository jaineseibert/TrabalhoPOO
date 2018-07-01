package br.edu.unoesc.questao8OO;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<ProdutoCarrinho> produtos;
	
	public void adicionarProdutos(Produto produto, Double quantidade) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}
		
		produtos.add(new ProdutoCarrinho(produto, quantidade));
	}
	
	public Double totalizarValorCarrinho() {
		return produtos.stream().mapToDouble(ProdutoCarrinho::getValor).sum();
	}
	
	
}
