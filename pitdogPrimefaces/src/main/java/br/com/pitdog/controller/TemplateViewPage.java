package br.com.pitdog.controller;

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

	public void openDialog(String view, String headerElement) {
		Map<String, Object> options = new HashMap<String, Object>();
		
		/*O parâmetro 'options.put("minimizable", false);' deve permanecer false
		 * até resolver o problema ao minimizar o dialog na página!*/
		options.put("minimizable", false);
		options.put("resizable", false);
		options.put("draggable", true);
		options.put("contentWidth", 900);
		options.put("contentHeight", 400);
		options.put("headerElement", headerElement);

		RequestContext.getCurrentInstance().openDialog(view, options, null);
		
		/* Esse bloco de código abaixo está em análise, não deve ser usado!
			
		FacesContext facesContext = FacesContext.getCurrentInstance();
		UIComponent panelGroup = facesContext.getViewRoot().findComponent("app");
	    System.out.println("found or not??"+ panelGroup.toString());
	    Dialog dialog = new Dialog();
	    dialog.setId("sample");
	    dialog.setWidgetVar("widget");
	    dialog.setHeader("Sample");
	    dialog.setVisible(true);
	    dialog.setMinimizable(true);
	    dialog.setDynamic(true);
	    dialog.setHideEffect("clip");
	    dialog.setFooter("footer");
	    dialog.setDraggable(true);
	    dialog.setMinWidth(600);
	    dialog.setClosable(true);
	    Map<String, Object> options = dialog.getAttributes();
	    panelGroup.getChildren().add(dialog);
	    RequestContext requestContext = RequestContext.getCurrentInstance();
	    RequestContext.getCurrentInstance().openDialog(view, options, null);
	    requestContext.execute("PF('widget').show();");
	    requestContext.update("app");*/
	}

}
