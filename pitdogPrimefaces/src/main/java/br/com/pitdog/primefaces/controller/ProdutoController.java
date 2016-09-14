package br.com.pitdog.primefaces.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.pitdog.primefaces.domain.Produto;

@ManagedBean
@ViewScoped
public class ProdutoController {
	
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
