package br.com.pitdog.dao.infraestrutura;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.interceptor.InterceptorBinding;

@Retention(RetentionPolicy.RUNTIME)
@InterceptorBinding
public @interface Transacional {
	
}
