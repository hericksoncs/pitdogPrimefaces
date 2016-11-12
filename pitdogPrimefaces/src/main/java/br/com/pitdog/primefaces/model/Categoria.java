package br.com.pitdog.primefaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_categoria")
public class Categoria extends GenericDomain{

	private static final long serialVersionUID = -417260107679138057L;
	
	@Column(name = "categ_codigo")
	private Long codigo;
	
	@Column(name = "categ_nome")
	private String nome;
	
	@Column(name = "categ_sigla")
	private String sigla;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

}
