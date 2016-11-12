package br.com.pitdog.primefaces.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.pitdog.primefaces.model.Categoria;
import br.com.pitdog.primefaces.model.Produto;

@ManagedBean
@ViewScoped
public class ProdutoController implements Serializable{
	
	private static final long serialVersionUID = 6890322331745742021L;

	private List<Produto> produtos;
	
	private Produto produto;
	
	private Categoria categoria;
	
	

}
