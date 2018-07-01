package br.edu.unoesc.questao8OO;

public class Categoria {
	
	private int codigo;
	private String descricao;
	private Double desconto;
	
public void cadastrarCategoria(int codigo, String descricao, Double desconto) {
	this.codigo = codigo;
	this.descricao = descricao;
	this.desconto = desconto;
}

public Double getDesconto() {
	return desconto;
}

}
