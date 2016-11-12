package br.com.pitdog.primefaces.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.pitdog.primefaces.domain.Produto;

@ManagedBean
@ViewScoped
public class ProdutoController implements Serializable{
	
	private static final long serialVersionUID = 6890322331745742021L;

	private List<Produto> produtos;
	
	private Produto produto;
	
	public ProdutoController(){
		produtos = new ArrayList<Produto>();
		produto = new Produto();
		produto.setCodigo("1");
		produto.setDescricao("Produto X");
		produto.setCategoria("Sanduiche");
		produto.setFabricante("Fabricante X");
		produtos.add(produto);
	}
	
	public List<Produto> getListarProdutos(){
		return produtos;
	}
	

}
