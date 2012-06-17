package br.com.mr.client.control.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface PanelImpl extends JSFlyweightWrapper {

	PanelImpl impl = GWT.create(PanelImpl.class);

	@Constructor("$wnd.OpenLayers.Control.Panel")
	JavaScriptObject construct();

	@Constructor("$wnd.OpenLayers.Control.Panel")
	JavaScriptObject construct(JavaScriptObject jso);

	void addControls(JavaScriptObject jso, JavaScriptObject createJsArray);

}
