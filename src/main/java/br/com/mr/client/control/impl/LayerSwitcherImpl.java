package br.com.mr.client.control.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface LayerSwitcherImpl extends JSFlyweightWrapper{
	LayerSwitcherImpl impl = GWT.create(LayerSwitcherImpl.class);

	@Constructor("$wnd.OpenLayers.Control.LayerSwitcher")
	JavaScriptObject construct();

	@Constructor("$wnd.OpenLayers.Control.LayerSwitcher")
	JavaScriptObject construct(JavaScriptObject jso);
	
	Boolean getRoundedCorner(JavaScriptObject jso);

	String getRoundedCornerColor(JavaScriptObject jso);

	Boolean getAscending(JavaScriptObject jso);

	void setRoundedCorner(JavaScriptObject jso, Boolean roundedCorner);

	void setRoundedCornerColor(JavaScriptObject jso, String roundedCornerColor);

	void setAscending(JavaScriptObject jso, Boolean ascending);

	void destroy(JavaScriptObject jso);


}
