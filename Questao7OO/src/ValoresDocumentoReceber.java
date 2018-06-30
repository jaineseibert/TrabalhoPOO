
public class ValoresDocumentoReceber implements ValoresDocumento {

	private Double ValorDocumento;
	private Double ValorMultaDocumento;
	private Double ValorJurosDocumento;
	
	
	
	public Double getValorDocumento() {
		return ValorDocumento;
	}



	public void setValorDocumento(Double valorDocumento) {
		ValorDocumento = valorDocumento;
	}



	public Double getValorMultaDocumento() {
		return ValorMultaDocumento;
	}



	public void setValorMultaDocumento(Double valorMultaDocumento) {
		ValorMultaDocumento = valorMultaDocumento;
	}



	public Double getValorJurosDocumento() {
		return ValorJurosDocumento;
	}



	public void setValorJurosDocumento(Double valorJurosDocumento) {
		ValorJurosDocumento = valorJurosDocumento;
	}



	@Override
	public Double getValorLiquido() {			
		return ValorDocumento + ValorMultaDocumento + ValorJurosDocumento;
	}

}
