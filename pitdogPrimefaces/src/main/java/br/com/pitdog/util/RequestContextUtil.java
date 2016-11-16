package br.com.pitdog.util;

import java.util.List;
import java.util.Map;

import org.primefaces.context.RequestContext;

/**
 * 
 * @author Felipe Miguel dos Santos
 *
 */
public class RequestContextUtil{
	
	public static void execute(String path){
		RequestContext.getCurrentInstance().execute(path);
	}
	
	public static void openDialog(String view, Map<String, Object> options, Map<String, List<String>> params){
		RequestContext.getCurrentInstance().openDialog(view, options, params);
	}

}
