package br.com.pitdog.dao.infraestrutura;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

/**
 * @author Felipe M.d. Santos
 * @version 1.0
 * */

@Named
public class BaseDaoHibernate<E, I> implements BaseDao<E, I> {

	private static final long serialVersionUID = 4946753559639966343L;

	private Class<E> entityClass;

	@Inject
	@PersistenceContext
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
	@Transactional
	public void save(E entity) {
		try {
			manager.merge(entity);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	@Transactional
	public void remove(I id) {
		try {
			E object = findById(id);
			manager.remove(object);
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
}