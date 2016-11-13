package br.com.pitdog.dao.infraestrutura.builder;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import br.com.pitdog.dao.FabricanteDao;
import br.com.pitdog.dao.FabricanteDaoImpl;

@ApplicationScoped
public class FabricanteDaoBuilder {
	
	@Produces
	public FabricanteDao fabricanteDaoBuilder(){
		return new FabricanteDaoImpl();
	}

}
