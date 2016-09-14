package br.com.pitdog.primefaces.domain;

import java.util.Arrays;

public class Produto extends GenericDomain{
	
	private static final long serialVersionUID = 4035475191279838009L;

	private String codigo;
	
	private String descricao;
	
	private String categoria;
	
	private String fabricante;
	
	private Byte[] imagem;
	
	private String tipo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Byte[] getImagem() {
		return imagem;
	}

	public void setImagem(Byte[] imagem) {
		this.imagem = imagem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao
				+ ", categoria=" + categoria + ", fabricante=" + fabricante
				+ ", imagem=" + Arrays.toString(imagem) + ", tipo=" + tipo
				+ "]";
	}
	
	

}
