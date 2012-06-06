package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface WMSParansImpl extends JSFlyweightWrapper{
	WMSParansImpl impl = GWT.create(WMSParansImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();
	
	String getLayers(JavaScriptObject jso );
	void setLayers(JavaScriptObject jso, String layers);

	Boolean getTransparent(JavaScriptObject jso);
	void setTransparent(JavaScriptObject jso, Boolean transparent);

	String getStyles(JavaScriptObject jso);
	void setStyles(JavaScriptObject jso, String styles);

	String getFormat(JavaScriptObject jso);
	void setFormat(JavaScriptObject jso, String format);
}
