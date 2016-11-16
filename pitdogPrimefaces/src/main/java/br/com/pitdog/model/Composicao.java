package br.com.pitdog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pitdog.dao.infraestrutura.GenericDomain;
import br.com.pitdog.model.estoque.Produto;

@Entity
@Table(name = "tbl_composicao")
public class Composicao extends GenericDomain{

	private static final long serialVersionUID = -3548720830154789431L;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "composicao", targetEntity = Produto.class)
	private List<Produto> insumo;
	
	@Column(name = "comp_qtde")
	private Long quantidade;

	public List<Produto> getInsumo() {
		return insumo;
	}

	public void setInsumo(List<Produto> insumo) {
		this.insumo = insumo;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
