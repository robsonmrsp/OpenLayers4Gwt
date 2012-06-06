package br.com.mr.client.basetypes;

import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.basetypes.impl.SizeImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class Size implements HasSize {
	JavaScriptObject jso;

	public Size(JavaScriptObject jso) {
		this.jso = jso;
	}
	
	public Size(Double w, Double h) {
		this(SizeImpl.impl.construct(w,h));
	}
	@Override
	public JavaScriptObject getJso() {
		return jso;
	}
}
