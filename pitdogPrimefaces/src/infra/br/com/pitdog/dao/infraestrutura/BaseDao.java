package br.com.pitdog.dao.infraestrutura;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<E, I> extends Serializable{

	void save(E entity);
	
	void remove(I id);

	List<E> findAll();

	E findById(I id);
	
}
