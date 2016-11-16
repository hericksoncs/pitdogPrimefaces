package br.com.pitdog.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.pitdog.model.estoque.Fabricante;
import br.com.pitdog.service.GenericService;
import dao.FabricanteDaoImpl;

@Named
public class FabricanteService implements GenericService<Fabricante, Long>{

	private static final long serialVersionUID = 2269387098485287961L;
	
	@Inject
	private FabricanteDaoImpl fabricanteDao;

	@Override
	@Transactional
	public void salvar(Fabricante fabricante) {
		try {
			fabricanteDao.save(fabricante);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public List<Fabricante> listarTodos() {
		return fabricanteDao.findAll();
	}

	@Override
	public Fabricante procurarPeloID(Long id) {
		return fabricanteDao.findById(id);
	}

}
