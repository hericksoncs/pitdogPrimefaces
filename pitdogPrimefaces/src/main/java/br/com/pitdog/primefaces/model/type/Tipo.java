package br.com.pitdog.primefaces.model.type;

public enum Tipo {

	PRODUTO("Produto"), INSUMO("Insumo");
	
	private String tipo;
	
	Tipo (String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
}
