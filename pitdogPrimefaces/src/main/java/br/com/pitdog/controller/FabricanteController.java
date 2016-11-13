package br.com.pitdog.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.pitdog.business.FabricanteBusiness;
import br.com.pitdog.model.Fabricante;
import br.com.pitdog.util.FacesUtil;

@ManagedBean
@ViewScoped
public class FabricanteController implements Serializable{

	private static final long serialVersionUID = -184364650177519849L;
	
	private FabricanteBusiness fabricanteBusiness;
	
	private Fabricante fabricante;
	
	public void novo(){
		fabricante = new Fabricante();
		fabricanteBusiness = new FabricanteBusiness();
	}
	
	public void salvar(){
		try {
			fabricanteBusiness.salvar(fabricante);
			FacesUtil.mensagemInfo("Fabricante salvo com sucesso!");
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
