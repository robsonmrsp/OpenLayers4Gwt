package br.com.mr.client.basetypes.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;


public interface LonLatImpl extends JSFlyweightWrapper{
	
	LonLatImpl impl = GWT.create(LonLatImpl.class);

	@Constructor("$wnd.OpenLayers.LonLat")
	JavaScriptObject construct(Double lon, Double lat);
}
