package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface OSMOptionsImpl extends JSFlyweightWrapper {
	OSMOptionsImpl impl = GWT.create(OSMOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();
}
