package br.edu.unoesc.quastao8OO.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unoesc.questao8OO.Carrinho;
import br.edu.unoesc.questao8OO.Categoria;
import br.edu.unoesc.questao8OO.Produto;

public class CarrinhoTest {

	@Test
	public void totalizarValorCarrinho() {
		Categoria categoria = new Categoria();
		categoria.cadastrarCategoria(1, "Bebida", Double.valueOf(5.0));

		Categoria categoria1 = new Categoria();
		categoria1.cadastrarCategoria(1, "Vestuario", Double.valueOf(25.0));

		Categoria categoria2 = new Categoria();
		categoria2.cadastrarCategoria(1, "Alimentício", Double.valueOf(0.0));

		Produto produto = new Produto();
		produto.cadastrarProduto(1, "Cerveja", Double.valueOf(4.0), categoria);

		Produto produto1 = new Produto();
		produto1.cadastrarProduto(1, "Casaco", Double.valueOf(40.0), categoria1);

		Produto produto2 = new Produto();
		produto2.cadastrarProduto(1, "Arroz", Double.valueOf(7.0), categoria2);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProdutos(produto, Double.valueOf(1.0));
		carrinho.adicionarProdutos(produto1, Double.valueOf(2.0));
		carrinho.adicionarProdutos(produto2, Double.valueOf(3.0));
		
		assertEquals(Double.valueOf(84.80), carrinho.totalizarValorCarrinho());
		System.out.println(carrinho.totalizarValorCarrinho());
	}

}
