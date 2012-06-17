package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface XYZImpl extends JSFlyweightWrapper {
	XYZImpl impl = GWT.create(XYZImpl.class);

	@Constructor( "$wnd.OpenLayers.Layer.XYZ")
	JavaScriptObject construct();

	@Constructor( "$wnd.OpenLayers.Layer.XYZ")
	JavaScriptObject construct(String name, String url, JavaScriptObject jso);
	
	Boolean getIsBaseLayer(JavaScriptObject jso );

	void setIsBaseLayer(JavaScriptObject jso, Boolean sphericalMercator);

	Boolean getSphericalMercator(JavaScriptObject jso );

	void setSphericalMercator(JavaScriptObject jso, Boolean sphericalMercator);

	Integer getZoomOffset(JavaScriptObject jso );

	void setZoomOffset(JavaScriptObject jso, Integer zoomOffset);

	JavaScriptObject getServerResolutions(JavaScriptObject jso );

	void setServerResolutions(JavaScriptObject jso, JavaScriptObject resolutions);

	JavaScriptObject clone(JavaScriptObject jso);

	void setMap(JavaScriptObject jso, JavaScriptObject map);


}
