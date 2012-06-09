package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface ControlImpl extends JSFlyweightWrapper{

	ControlImpl  impl = GWT.create(ControlImpl.class);
	
	@Constructor("$wnd.OpenLayers.Control")
	JavaScriptObject construct();
	
	@Constructor("$wnd.OpenLayers.Control")
	JavaScriptObject construct(JavaScriptObject options);
}
