package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface WMSOptionsImpl extends JSFlyweightWrapper{

	WMSOptionsImpl impl = GWT.create(WMSOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();
	
	Double getOpacity(JavaScriptObject jso);

	void setOpacity(JavaScriptObject jso, Double opacity);

	Boolean getSingleTile(JavaScriptObject jso );

	void setSingleTile(JavaScriptObject jso, Boolean singleTile);

}
