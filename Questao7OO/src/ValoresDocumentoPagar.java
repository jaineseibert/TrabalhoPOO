
public class ValoresDocumentoPagar implements ValoresDocumento {

	private Double ValorDocumento;
	private Double ValorJurosDocumento;
	
	
	
	public Double getValorDocumento() {
		return ValorDocumento;
	}



	public void setValorDocumento(Double valorDocumento) {
		ValorDocumento = valorDocumento;
	}



	public Double getValorJurosDocumento() {
		return ValorJurosDocumento;
	}



	public void setValorJurosDocumento(Double valorJurosDocumento) {
		ValorJurosDocumento = valorJurosDocumento;
	}



	@Override
	public Double getValorLiquido() {
		return ValorDocumento + ValorJurosDocumento;
	}
}