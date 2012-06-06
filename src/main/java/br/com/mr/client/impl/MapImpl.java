package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.user.client.Element;

//referencia: http://dev.openlayers.org/releases/OpenLayers-2.11/doc/apidocs/files/OpenLayers/Map-js.html#OpenLayers.Map

public interface MapImpl extends JSFlyweightWrapper {

	MapImpl impl = GWT.create(MapImpl.class);

	@Constructor("$wnd.OpenLayers.Map")
	JavaScriptObject construct(Element mapDiv);

	@Constructor("$wnd.OpenLayers.Map")
	JavaScriptObject construct(Element mapDiv, JavaScriptObject jsoOptions);

	public void render(JavaScriptObject jso, Element mapDiv);

	public void destroy(JavaScriptObject jso);

	public void setOptions(JavaScriptObject jso, JavaScriptObject jsoOptions);

	public JavaScriptObject getTileSize(JavaScriptObject jso);

	public JavaScriptObject getLayer(JavaScriptObject jso,  String id);

	public void addLayer(JavaScriptObject jso, JavaScriptObject layer);

	public void addLayers(JavaScriptObject jso, JavaScriptObject layers);

	public void removeLayer(JavaScriptObject jso, JavaScriptObject layer);// ??

	public Integer getNumLayers(JavaScriptObject jso);

	public Integer getLayerIndex(JavaScriptObject jso, JavaScriptObject layer);

	public void setLayerIndex(JavaScriptObject jso, JavaScriptObject layer, Integer index);

	public void raiseLayer(JavaScriptObject jso, JavaScriptObject layer, Integer delta);

	public void setBaseLayer(JavaScriptObject jso, JavaScriptObject newBaseLayer);

	public void addControl(JavaScriptObject jso, JavaScriptObject control, JavaScriptObject pxels);

	public JavaScriptObject getControl(JavaScriptObject jso, String id);

	public void removeControl(JavaScriptObject jso, JavaScriptObject control);

	public void addPopup(JavaScriptObject jso, JavaScriptObject popup);

	public void removePopup(JavaScriptObject jso, JavaScriptObject popup);

	public JavaScriptObject getSize(JavaScriptObject jso);

	public void updateSize(JavaScriptObject jso);

	public JavaScriptObject getCenter(JavaScriptObject jso);

	public Integer getZoom(JavaScriptObject jso);

	public void pan(JavaScriptObject jso, Integer dx, Integer dy, JavaScriptObject options);

	public void panTo(JavaScriptObject jso, JavaScriptObject lonlat);

	public void setCenter(JavaScriptObject jso, JavaScriptObject lonlat);

	public void setCenter(JavaScriptObject jso, JavaScriptObject lonlat, Integer zoom, Boolean dragging, Boolean forceZoomChange);

	public String getProjection(JavaScriptObject jso);

	public JavaScriptObject getProjectionObject(JavaScriptObject jso);

	public String getMaxResolution(JavaScriptObject jso);

	public JavaScriptObject getMaxExtent(JavaScriptObject jso, JavaScriptObject javaScriptObject);

	public Integer getNumZoomLevels(JavaScriptObject jso);

	public JavaScriptObject getExtent(JavaScriptObject jso);

	public Double getResolution(JavaScriptObject jso);

	public String getUnits(JavaScriptObject jso);

	public Double getScale(JavaScriptObject jso);

	public Integer getZoomForExtent(JavaScriptObject jso, JavaScriptObject bounds, Boolean closest);

	public Double getResolutionForZoom(JavaScriptObject jso, Double bounds);

	public Double getZoomForResolution(JavaScriptObject jso, Double resolution, Boolean closest);

	public void zoomTo(JavaScriptObject jso, Integer zoomLevel);

	public void zoomIn(JavaScriptObject jso);

	public void zoomOut(JavaScriptObject jso);

	public void zoomToExtent(JavaScriptObject jso, JavaScriptObject bounds, Boolean closest);

	public void zoomToMaxExtent(JavaScriptObject jso, JavaScriptObject options);

	public void zoomToScale(JavaScriptObject jso, Double scale, Boolean closest);

	public JavaScriptObject getViewPortPxFromLonLat(JavaScriptObject jso, JavaScriptObject lonlat);

	public JavaScriptObject getLonLatFromPixel(JavaScriptObject jso, JavaScriptObject pixel);

	public JavaScriptObject getPixelFromLonLat(JavaScriptObject jso, JavaScriptObject lonlat);

	public JavaScriptObject getViewPortPxFromLayerPx(JavaScriptObject jso, JavaScriptObject pixel);

	public JavaScriptObject getLayerPxFromViewPortPx(JavaScriptObject jso, JavaScriptObject pixel);

	public JavaScriptObject getLayerPxFromLonLat(JavaScriptObject jso, JavaScriptObject lonLat);

//	@BeanProperties	
//	void setResolutions(JavaScriptObject jso, JavaScriptObject resolutions);
//	@BeanProperties	
//	JavaScriptObject getResolutions(JavaScriptObject jso);
}
