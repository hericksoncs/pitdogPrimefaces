package br.com.pitdog.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.pitdog.dao.infraestrutura.GenericDomain;
import br.com.pitdog.model.type.Tipo;

@Entity
@Table(name = "tbl_produto")
public class Produto extends GenericDomain{
	
	private static final long serialVersionUID = 4035475191279838009L;

	@Column(name = "prod_codigo")
	private String codigo;
	
	@Column(name = "prod_descricao")
	private String descricao;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Categoria categoria;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Fabricante fabricante;
	
	/*@Column(name = "prod_imagem")
	private Byte[] imagem;*/
	
	@Column(name = "prod_tipo")
	private Tipo tipo;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true, targetEntity = Composicao.class)
	@JoinColumn(name = "composicao_id", nullable = true)
	private Composicao composicao;

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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	/*public Byte[] getImagem() {
		return imagem;
	}

	public void setImagem(Byte[] imagem) {
		this.imagem = imagem;
	}*/

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao
				+ ", categoria=" + categoria + ", fabricante=" + fabricante
				+ ", imagem=" +", tipo=" + tipo
				+ "]";
	}

	public Composicao getComposicao() {
		return composicao;
	}

	public void setComposicao(Composicao composicao) {
		this.composicao = composicao;
	}
	
	

}
