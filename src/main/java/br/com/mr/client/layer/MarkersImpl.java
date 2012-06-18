package br.com.mr.client.layer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface MarkersImpl extends JSFlyweightWrapper {
	MarkersImpl impl = GWT.create(MarkersImpl.class);

	@Constructor("$wnd.OpenLayers.Layer.Markers")
	JavaScriptObject construct();

	@Constructor("$wnd.OpenLayers.Layer.Markers")
	JavaScriptObject construct(String name);

	@Constructor("$wnd.OpenLayers.Layer.Markers")
	JavaScriptObject construct(String name, JavaScriptObject options);

	Boolean getIsBaseLayer(JavaScriptObject jso);

	void setIsBaseLayer(JavaScriptObject jso, Boolean isBaseLayer);

	JavaScriptObject getMarkers(JavaScriptObject jso);

	void setMarkers(JavaScriptObject jso, JavaScriptObject markers);

	void destroy(JavaScriptObject jso);

	void addMarker(JavaScriptObject jso, JavaScriptObject marker);

	void removeMarker(JavaScriptObject jso, JavaScriptObject marker);

	JavaScriptObject getDataExtent(JavaScriptObject jso);
}
