package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface HTTPRequestImpl extends JSFlyweightWrapper{

	HTTPRequestImpl impl = GWT.create(HTTPRequestImpl.class);

	@Constructor("$wnd.OpenLayers.Layer.HTTPRequest")
	JavaScriptObject construct(String name, String url, JavaScriptObject parans, JavaScriptObject options);

	void destroy(JavaScriptObject jso);

	JavaScriptObject clone(JavaScriptObject jso, JavaScriptObject toClone);

	void setUrl(JavaScriptObject jso, String url);

	void mergeNewParams(JavaScriptObject jso, JavaScriptObject options);

}
