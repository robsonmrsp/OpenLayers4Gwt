package br.com.mr.client;

import br.com.mr.client.impl.HasProjection;
import br.com.mr.client.impl.HasProjectionOptions;
import br.com.mr.client.impl.ProjectionImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class Projection implements HasProjection {

	private JavaScriptObject jso;
	
	public Projection(String code, HasProjectionOptions options) {
		this(ProjectionImpl.impl.construct(code, options.getJso()));
	}

	public Projection(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}
}
