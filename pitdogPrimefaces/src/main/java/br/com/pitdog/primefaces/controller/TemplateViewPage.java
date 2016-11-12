package br.com.pitdog.primefaces.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class TemplateViewPage implements Serializable {

	private static final long serialVersionUID = -4532122633294716766L;

	public void openDialog(String view) {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("position", "center");
		options.put("resizable", false);
		options.put("draggable", true);
		options.put("minimizable", true);
		options.put("contentWidth", 900);
		options.put("contentHeight", 400);

		RequestContext.getCurrentInstance().openDialog(view, options, null);
	}

}
