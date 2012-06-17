package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface OSMImpl extends JSFlyweightWrapper{

	OSMImpl  impl = GWT.create(OSMImpl.class);
	
	@Constructor("$wnd.OpenLayers.Layer.OSM")
	JavaScriptObject construct();

	@Constructor("$wnd.OpenLayers.Layer.OSM")
	JavaScriptObject construct(String name, String url, JavaScriptObject jso);
}
