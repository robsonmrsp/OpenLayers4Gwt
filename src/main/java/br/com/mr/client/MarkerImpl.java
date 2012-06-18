package br.com.mr.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface MarkerImpl extends JSFlyweightWrapper {
	MarkerImpl impl = GWT.create(MarkerImpl.class);

	@Constructor("$wnd.OpenLayers.Marker")
	JavaScriptObject construct(JavaScriptObject lonLat,JavaScriptObject icon );
	
	void destroy(JavaScriptObject jso);
	
	Boolean isDrawn(JavaScriptObject jso);

	void setOpacity(JavaScriptObject jso);
}
