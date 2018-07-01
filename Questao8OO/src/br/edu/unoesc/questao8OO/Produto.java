package br.edu.unoesc.questao8OO;

public class Produto {

	private int codigo;
	private String descricao;
	private Double valor;
	private Categoria categoria;
	
	
	public void cadastrarProduto(int codigo, String descricao, Double valor, Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	 public Double calcularProdutoComDesconto(){
		  	return (this.valor - (this.valor * (categoria.getDesconto()/100)));
		}
}
