package br.com.mr.client.basetypes.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
@BeanProperties
public interface BoundsImpl extends JSFlyweightWrapper{

	BoundsImpl impl = GWT.create(BoundsImpl.class);
	
	@Constructor("$wnd.OpenLayers.Bounds")
	JavaScriptObject construct(Double left, Double bottom, Double right, Double top);
}
