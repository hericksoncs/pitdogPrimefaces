package br.com.pitdog.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import br.com.pitdog.model.estoque.Fabricante;
import br.com.pitdog.service.impl.FabricanteService;
import br.com.pitdog.util.RequestContextUtil;
import br.com.pitdog.util.FacesUtil;

@Named
@ViewScoped
public class FabricanteController implements Serializable{

	private static final long serialVersionUID = -184364650177519849L;
	
	@Inject
	private Fabricante fabricante;
	
	@Inject
	private FabricanteService fabricanteService;
	
	public void salvar(){
		try {
			fabricanteService.salvar(fabricante);
			FacesUtil.mensagemInfo("Fabricante salvo com sucesso!");
			RequestContextUtil.execute("PF('novo-fabricante').hide();");
		} catch (RuntimeException e) {
			FacesUtil.mensagemErro(e.getMessage());
		}
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
