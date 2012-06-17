package br.com.mr.client.control;


import br.com.mr.client.control.impl.ControlOptionsImpl;
import br.com.mr.client.control.impl.HasControlOptions;

import com.google.gwt.core.client.JavaScriptObject;

public class ControlOptions implements HasControlOptions {

	private JavaScriptObject jso;

	public ControlOptions() {
		this(ControlOptionsImpl.impl.contruct());
	}

	public ControlOptions(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}
}
