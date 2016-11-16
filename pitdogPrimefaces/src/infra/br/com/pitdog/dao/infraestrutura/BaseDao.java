package br.com.pitdog.dao.infraestrutura;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Felipe Miguel dos Santos
 *
 * @param <E> -> Entidade
 * @param <I> -> Identificador
 */

public interface BaseDao<E, I> extends Serializable{

	void save(E entity);
	
	void remove(I id);

	List<E> findAll();

	E findById(I id);
	
	List<E> findByParam(String query, Map<String, Object> params);
	
}
