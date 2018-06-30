
public class Documento {

	public static void main(String[] agrs) {
		Documento documento = new Documento();
		
		ValoresDocumentoReceber valorReceber = new ValoresDocumentoReceber();		
		valorReceber.setValorDocumento(Double.valueOf(100.00));
		valorReceber.setValorJurosDocumento(Double.valueOf(10.00));
		valorReceber.setValorMultaDocumento(Double.valueOf(15.00));
		
		ValoresDocumentoPagar valorPagar = new ValoresDocumentoPagar();
		valorPagar.setValorDocumento(Double.valueOf(200.00));
		valorPagar.setValorJurosDocumento(Double.valueOf(0.0));
		
		documento.exibeValor(valorReceber);
		documento.exibeValor(valorPagar);
	}
	
	public void exibeValor(ValoresDocumento valorDocumento) {
	System.out.println("Valor: " + (valorDocumento.getValorLiquido()));	
	}
}
