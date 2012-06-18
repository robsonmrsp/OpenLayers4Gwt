package br.com.mr.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface IconImpl extends JSFlyweightWrapper {
	IconImpl impl = GWT.create(IconImpl.class);

	@Constructor("$wnd.OpenLayers.Icon")
	JavaScriptObject construct(String url, JavaScriptObject size, JavaScriptObject offSet);

	Boolean isDrawn(JavaScriptObject jso);

	void setOpacity(JavaScriptObject jso, Double d);

	JavaScriptObject clone(JavaScriptObject jso);
}
