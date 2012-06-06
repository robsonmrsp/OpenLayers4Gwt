package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface TileImpl extends JSFlyweightWrapper {
	TileImpl impl = GWT.create(TileImpl.class);
	
	@Constructor("$wnd.OpenLayers.Tile")
	JavaScriptObject construct();
}
