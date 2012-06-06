package br.com.mr.client.basetypes.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface SizeImpl extends JSFlyweightWrapper{
	SizeImpl impl = GWT.create(SizeImpl.class);

	@Constructor("$wnd.OpenLayers.Size")
	JavaScriptObject construct(Double w, Double h);
}
