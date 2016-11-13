package br.com.pitdog.business;

import javax.inject.Inject;
import javax.inject.Named;


import br.com.pitdog.dao.FabricanteDao;
import br.com.pitdog.dao.FabricanteDaoImpl;
import br.com.pitdog.model.Fabricante;

@Named
public class FabricanteBusiness {

	@Inject
	private FabricanteDaoImpl fabricanteDaoImpl;
	
	public void salvar(Fabricante fabricante){
		try {
			fabricanteDaoImpl.save(consistirFabricante(fabricante));
		} catch (RuntimeException e) {
			throw e;
		}
	}
	
	private Fabricante consistirFabricante(Fabricante fabricante){
		if(fabricante != null){
			return fabricante;
		}else{
			throw new RuntimeException("Objeto 'fabricante' na classe " + getClass().getSimpleName()+ " está null");
		}
	}
	
}
