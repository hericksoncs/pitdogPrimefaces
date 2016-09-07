package br.com.pitdog.primefaces.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {
	private EntityManagerFactory factory;
	
	public EntityManagerProducer() {
		this.factory = Persistence.createEntityManagerFactory("DW_CadEmpresas_MavenPrimefacesJPA");
	}
	
	@Produces
	@RequestScoped
	public EntityManager createEntityManager() {
		return this.factory.createEntityManager();
	}
	
	public void closeEntityManager(@Disposes EntityManager manager) {
		manager.close();
	}
}

/*
  Um método produtor gera um objeto que pode ser injetado. São úteis
  quando queremos injetar um objeto que não é propriamente um bean.
  Note que esta classe não é explicitamente referenciada no projeto,
  mas somente EntityManager que é injetado em várias classes.
   
*/
