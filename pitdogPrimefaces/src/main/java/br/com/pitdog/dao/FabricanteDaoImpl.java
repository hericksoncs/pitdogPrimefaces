package br.com.pitdog.dao;

import java.util.List;

import javax.inject.Named;

import br.com.pitdog.dao.infraestrutura.BaseDaoHibernate;
import br.com.pitdog.model.Fabricante;

@Named
public class FabricanteDaoImpl extends BaseDaoHibernate<Fabricante, Long> implements FabricanteDao{
	
	private static final long serialVersionUID = -6361186293982509196L;

	@Override
	public void save(Fabricante entity) throws RuntimeException{
		super.save(entity);
	}

	@Override
	public void remove(Long id) throws RuntimeException{
		super.remove(id);
	}

	@Override
	public List<Fabricante> findAll() throws RuntimeException{
		return super.findAll();
	}

	@Override
	public Fabricante findById(Long id) throws RuntimeException{
		return super.findById(id);
	}

}
