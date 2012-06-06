package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;

public interface ControlImpl {

	ControlImpl  impl = GWT.create(ControlImpl.class);
	
	@Constructor("$wnd.OpenLayers.Control")
	JavaScriptObject construct();
	
	@Constructor("$wnd.OpenLayers.Control")
	JavaScriptObject construct(JavaScriptObject options);

}
