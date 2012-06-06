package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;


public interface WMSImpl extends JSFlyweightWrapper {
	WMSImpl impl = GWT.create(WMSImpl.class);
					   
	@Constructor("$wnd.OpenLayers.Layer.WMS")
	JavaScriptObject construct(String name, String url, JavaScriptObject parans, JavaScriptObject options);

	Boolean getIsBaseLayer(JavaScriptObject jso);

	void setIsBaseLayer(JavaScriptObject jso, Boolean isBaseLayer);

	Boolean getEncodeBBOX(JavaScriptObject jso);

	void setEncodeBBOX(JavaScriptObject jso, Boolean encodeBBOX);

	Boolean getNoMagic(JavaScriptObject jso);

	void setNoMagic(JavaScriptObject jso, Boolean noMagic);

	Boolean reverseAxisOrder(JavaScriptObject jso);

	void mergeNewParams(JavaScriptObject jso, JavaScriptObject newParams);

	String getFullRequestString(JavaScriptObject jso, JavaScriptObject newParams, String altUrl);

}
