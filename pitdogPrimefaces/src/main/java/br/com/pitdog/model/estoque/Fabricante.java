package br.com.pitdog.model.estoque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.pitdog.dao.infraestrutura.GenericDomain;

@Entity
@Table(name = "tbl_fabricante")
public class Fabricante extends GenericDomain {

	private static final long serialVersionUID = -462813548724631065L;

	@Column(name = "fabr_codigo")
	private Long codigo;

	@Column(name = "fabr_cnpj")
	@NotEmpty(message = "O CNPJ é obrigatório!")
	private String CNPJ;

	@Column(name = "fabr_razao_social")
	@NotEmpty(message = "A Razão Social é obrigatório!")
	private String razaoSocial;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
