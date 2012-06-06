package br.com.mr.client.basetypes.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface PixelImpl extends JSFlyweightWrapper{
	
	PixelImpl imp = GWT.create(PixelImpl.class);
	
	@Constructor("$wnd.OpenLayers.Pixel")
    JavaScriptObject construct(Double x, Double y);
	
}
