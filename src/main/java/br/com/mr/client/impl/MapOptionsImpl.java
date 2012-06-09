package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.NoInitProperties;

@BeanProperties
@NoInitProperties
public interface MapOptionsImpl extends JSFlyweightWrapper {

	MapOptionsImpl impl = GWT.create( MapOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();
	
	Double getMaxResolution(JavaScriptObject jso );

	void setMaxResolution(JavaScriptObject jso, Double maxResolution);

	JavaScriptObject getBaseLayer(JavaScriptObject jso );

	void setBaseLayer(JavaScriptObject jso, JavaScriptObject baseLayer);

	JavaScriptObject getTileSize(JavaScriptObject jso);

	void setTileSize(JavaScriptObject jso, JavaScriptObject tileSize);

	Boolean getAllOverlays(JavaScriptObject jso);

	void setAllOverlays(JavaScriptObject jso, Boolean allOverlays);

	JavaScriptObject getDisplayProjection(JavaScriptObject jso);

	void setDisplayProjection(JavaScriptObject jso, JavaScriptObject displayProjection);

	String getProjection(JavaScriptObject jso);

	void setProjection(JavaScriptObject jso, String projection);

	String getTheme(JavaScriptObject jso);

	void setTheme(JavaScriptObject jso, String theme);

	void setUnits(JavaScriptObject jso, String units);

	String getUnits(JavaScriptObject jso);

	Double getMinResolution(JavaScriptObject jso);

	void getMinResolution(JavaScriptObject jso, Double minResolution);

	Double getMaxScale(JavaScriptObject jso);

	void getMaxScale(JavaScriptObject jso, Double maxScale);

	Double getMinScale(JavaScriptObject jso);

	void getMinScale(JavaScriptObject jso, Double minScale);

	JavaScriptObject getMaxExtent(JavaScriptObject jso);

	void setMaxExtent(JavaScriptObject jso, JavaScriptObject bounds);

	JavaScriptObject getMinExtent(JavaScriptObject jso);

	void setMinExtent(JavaScriptObject jso, JavaScriptObject bounds);

	JavaScriptObject getRestrictedExtent(JavaScriptObject jso);

	void setRestrictedExtent(JavaScriptObject jso, JavaScriptObject bounds);

	String getFallThrough(JavaScriptObject jso);

	void setFallThrough(JavaScriptObject jso, String fallThrough);

	Integer getNumZoomLevels(JavaScriptObject jso);

	void setNumZoomLevels(JavaScriptObject jso, Integer numZoomLevels);
	

}
