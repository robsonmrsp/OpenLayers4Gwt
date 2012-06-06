package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface GridOptionsImpl extends JSFlyweightWrapper {

	GridOptionsImpl impl = GWT.create(GridOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();


	public void setBuffer(JavaScriptObject jso, int buffer);

	public void setTileSize(JavaScriptObject jso, JavaScriptObject size);
	public JavaScriptObject getTileSize(JavaScriptObject jso);
}
