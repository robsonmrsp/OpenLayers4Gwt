package br.com.mr.client.control.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface ZoomBoxImpl extends JSFlyweightWrapper {
	ZoomBoxImpl impl = GWT.create(ZoomBoxImpl.class);

	@Constructor("$wnd.OpenLayers.Control.ZoomBox")
	JavaScriptObject construct();

	@Constructor("$wnd.OpenLayers.Control.ZoomBox")
	JavaScriptObject construct(JavaScriptObject jso);
	
}
