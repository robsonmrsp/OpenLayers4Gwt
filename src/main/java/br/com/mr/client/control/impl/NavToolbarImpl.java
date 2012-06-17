package br.com.mr.client.control.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface NavToolbarImpl extends JSFlyweightWrapper {

	NavToolbarImpl impl = GWT.create(NavToolbarImpl.class);

	@Constructor("$wnd.OpenLayers.Control.NavToolbar")
	JavaScriptObject construct();

}
