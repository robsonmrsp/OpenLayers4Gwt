package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface ProjectionImpl extends JSFlyweightWrapper {
	
	ProjectionImpl impl = GWT.create(ProjectionImpl.class);

	@Constructor("$wnd.OpenLayers.Projection")
	JavaScriptObject construct(String code, JavaScriptObject options);
}
