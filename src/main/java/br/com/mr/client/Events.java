package br.com.mr.client;

import br.com.mr.client.impl.EventsImpl;
import br.com.mr.client.impl.HasEvents;

import com.google.gwt.core.client.JavaScriptObject;

public class Events implements HasEvents {
	JavaScriptObject jso;
	
	public Events(JavaScriptObject jso) {
		this.jso = jso;
	}

	public Events() {
	this(EventsImpl.impl.construct());
	}
	@Override
	public JavaScriptObject getJso() {
		// TODO Auto-generated method stub
		return jso;
	}

}
