package br.com.pitdog.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<E, I> extends Serializable{
	
	void salvar(E entity);
	
	List<E> listarTodos();
	
	E procurarPeloID(I id);
	
}
