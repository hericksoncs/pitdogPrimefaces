package br.com.pitdog.dao.infraestrutura;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaQuery;

/**
 * 
 * @author Felipe Miguel dos Santos
 *
 * @param <E> -> Entidade
 * @param <I> -> Identificador
 */

@Named
public class BaseDaoHibernate<E, I> implements BaseDao<E, I> {

	private static final long serialVersionUID = 7317998972296404455L;

	private Class<E> entityClass;

	@Inject
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager manager;
	
	@SuppressWarnings({ "unchecked"})
	public BaseDaoHibernate() {
		Class<?> clazz = getClass();
		if (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
			clazz = clazz.getSuperclass();
		}

		ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericSuperclass();
		entityClass = (Class<E>) parameterizedType.getActualTypeArguments()[0];

	}

	@Override
	public void save(E entity) {
		try {
			manager.merge(entity);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void remove(I id) {
		try {
			E objeto = findById(id);
			manager.remove(objeto);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public List<E> findAll() {
		try {
			CriteriaQuery<E> query = manager.getCriteriaBuilder().createQuery(entityClass);
			query.from(entityClass);
			return manager.createQuery(query).getResultList();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public E findById(I id) {
		try {
			return manager.find(entityClass, id);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public List<E> findByParam(String query, Map<String, Object> params) {
		/*Query q = manager.createQuery(query);
		for(String key : params.keySet()){
			q.setParameter(params.get(key), key);
		}*/
		return null;
	}
}