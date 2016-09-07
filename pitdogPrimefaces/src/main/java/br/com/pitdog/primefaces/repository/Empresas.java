package br.com.pitdog.primefaces.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.pitdog.primefaces.model.Empresa;

public class Empresas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Empresa porId(Long id) {
		return manager.find(Empresa.class, id);
	}
	
	public List<Empresa> todas() {
		return manager.createQuery("from Empresa", Empresa.class).getResultList();
	}jkhjhjh
	
	public Empresa guardar(Empresa empresa) {
		return manager.merge(empresa);
	}
	
	public void remover(Empresa empresa) {
		empresa = porId(empresa.getId());
		manager.remove(empresa);
	}
}

/*
  DAO é uma abstração de persistência de dados, enquanto Repository é uma abstração de
  uma coleção de objetos. DAO está mais para acesso a banco de dados e Repository está
  mais para manipulação de objetos de negócio, em algo parecido com uma coleção.
  
  Se os objetos de negócio são persistidos em um banco de dados, o resultado final é o 
  mesmo, mas Repository tenta levar a programação para mais perto do negócio, e a 
  interface não indica ter qualquer dependência com código de infraestrutura 
  (banco de dados, por exemplo).
  
*/
