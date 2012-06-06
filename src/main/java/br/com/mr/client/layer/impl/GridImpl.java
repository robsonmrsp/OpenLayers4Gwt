package br.com.mr.client.layer.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface GridImpl extends JSFlyweightWrapper {

	GridImpl impl = GWT.create(GridImpl.class);

	@Constructor("$wnd.OpenLayers.Layer.Grid")
	JavaScriptObject construct(String name, String url, JavaScriptObject parans, JavaScriptObject options);

	JavaScriptObject getSize(JavaScriptObject jso);

	void setSize(JavaScriptObject jso, JavaScriptObject size);

	JavaScriptObject getTileOrigin(JavaScriptObject jso);

	void setTileOrigin(JavaScriptObject jso, JavaScriptObject lonLat);

	JavaScriptObject getTileOptions(JavaScriptObject jso);

	void setTileOptions(JavaScriptObject jso, JavaScriptObject options);

	Boolean getSingleTile(JavaScriptObject jso);

	void setSingleTile(JavaScriptObject jso, Boolean singleTile);

	Double getRatio(JavaScriptObject jso);

	void setRatio(JavaScriptObject jso, Double ratio);

	Integer getBuffer(JavaScriptObject jso);

	void setBuffer(JavaScriptObject jso, Integer buffer);

	Integer getNumLoadingTiles(JavaScriptObject jso);

	void setNumLoadingTiles(JavaScriptObject jso, Integer numLoadingTiles);

	Integer getTileLoadingDelay(JavaScriptObject jso);

	void setTileLoadingDelay(JavaScriptObject jso, Integer tileLoadingDelay);

	void destroy(JavaScriptObject jso);

	JavaScriptObject clone(JavaScriptObject jso, JavaScriptObject toclone);

	void setTileSize(JavaScriptObject jso, JavaScriptObject size);

	JavaScriptObject getTilesBounds(JavaScriptObject jso);

	JavaScriptObject addTile(JavaScriptObject jso, JavaScriptObject bounds, JavaScriptObject position);

	JavaScriptObject getTileBounds(JavaScriptObject jso, JavaScriptObject pixel);

}
