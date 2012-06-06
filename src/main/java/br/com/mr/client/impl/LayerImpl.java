package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface LayerImpl extends JSFlyweightWrapper {

	LayerImpl impl = GWT.create(LayerImpl.class);

	@Constructor("$wnd.OpenLayers.Layer")
	JavaScriptObject construct(String name, JavaScriptObject mapOptions);

	JavaScriptObject getEvents(JavaScriptObject jso);

	void setEvents(JavaScriptObject jso, JavaScriptObject events);

	JavaScriptObject getMap(JavaScriptObject jso);

	void setMap(JavaScriptObject jso, JavaScriptObject map);

	Boolean getIsBaseLayer(JavaScriptObject jso);

	Boolean getDisplayInLayerSwitcher(JavaScriptObject jso);

	void setDisplayInLayerSwitcher(JavaScriptObject jso, Boolean displayInLayerSwitcher);

	Boolean getVisibility(JavaScriptObject jso);

	void setVisibility(JavaScriptObject jso, Boolean visibility);;

	String getAttribution(JavaScriptObject jso);

	void setAttribution(JavaScriptObject jso, String attribution);

	// eventListeners ??
	// eventListeners ??

	Integer getGutter(JavaScriptObject jso);

	void setGutter(JavaScriptObject jso, Integer gutter);

	JavaScriptObject getProjection(JavaScriptObject jso);

	void setProjection(JavaScriptObject jso, JavaScriptObject projection);

	String getUnits(JavaScriptObject jso);

	void setUnits(JavaScriptObject jso, String units);

	// scales ?? TODO
	// scales ?? TODO
	// resolutions
	// resolutions
	JavaScriptObject getMaxExtent(JavaScriptObject jso);

	void setMaxExtent(JavaScriptObject jso, JavaScriptObject bounds);

	JavaScriptObject getMinExtent(JavaScriptObject jso);

	void setMinExtent(JavaScriptObject jso, JavaScriptObject bounds);

	Double getMaxResolution(JavaScriptObject jso);

	void setMaxResolution(JavaScriptObject jso, Double maxResolution);

	Double getMinResolution(JavaScriptObject jso);

	void setMinResolution(JavaScriptObject jso, Double minResolution);

	Integer getNumZoomLevels(JavaScriptObject jso);

	void setNumZoomLevels(JavaScriptObject jso, Integer NumZoomLevels);

	Double getMinScale(JavaScriptObject jso);

	void setMinScale(JavaScriptObject jso, Double minScale);

	Double getMaxScale(JavaScriptObject jso);

	void setMaxScale(JavaScriptObject jso, Double maxScale);

	Boolean getDisplayOutsideMaxExtent(JavaScriptObject jso);

	void setDisplayOutsideMaxExtent(JavaScriptObject jso, Boolean displayOutsideMaxExtent);

	Boolean getWrapDateLine(JavaScriptObject jso);

	void setWrapDateLine(JavaScriptObject jso, Boolean wrapDateLine);

	String getTransitionEffect(JavaScriptObject jso);

	void setTransitionEffect(JavaScriptObject jso, String transitionEffect);

	void setName(JavaScriptObject jso, String name);;

	void addOptions(JavaScriptObject jso, JavaScriptObject newOptions, Boolean reinitialize);

	void onMapResize(JavaScriptObject jso);

	void redraw(JavaScriptObject jso);

	void removeMap(JavaScriptObject jso, JavaScriptObject map);

	JavaScriptObject getImageSize(JavaScriptObject jso, JavaScriptObject bounds);

	void setTileSize(JavaScriptObject jso, JavaScriptObject size);

	void display(JavaScriptObject jso, Boolean display);

	Boolean calculateInRange(JavaScriptObject jso);

	void setIsBaseLayer(JavaScriptObject jso, Boolean isBaseLayer);

	Double getResolution(JavaScriptObject jso);

	Integer getZoomForExtent(JavaScriptObject jso, JavaScriptObject extent, Boolean closest);

	Double getResolutionForZoom(JavaScriptObject jso, Double zoom);

	Integer getZoomForResolution(JavaScriptObject jso, Double resolution, Boolean closest);

	JavaScriptObject getLonLatFromViewPortPx(JavaScriptObject jso, JavaScriptObject pixel);

	JavaScriptObject getViewPortPxFromLonLat(JavaScriptObject jso, JavaScriptObject lonLat);

	void setOpacity(JavaScriptObject jso, Double opacity);

	@BeanProperties
	void setResolutions(JavaScriptObject jso, JavaScriptObject resolutions);

	@BeanProperties
	JavaScriptObject getResolutions(JavaScriptObject jso);

	@BeanProperties
	JavaScriptObject getTileSize(JavaScriptObject jso);
}
