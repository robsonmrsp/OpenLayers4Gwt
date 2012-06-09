package br.com.mr.client;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.LonLat;
import br.com.mr.client.basetypes.Pixel;
import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.impl.HasControl;
import br.com.mr.client.impl.HasLayer;
import br.com.mr.client.impl.HasMap;
import br.com.mr.client.impl.HasMapOptions;
import br.com.mr.client.impl.HasOptions;
import br.com.mr.client.impl.HasPopup;
import br.com.mr.client.impl.HasProjection;
import br.com.mr.client.impl.MapImpl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class Map implements HasMap {

	final private JavaScriptObject jso;

	public Map(JavaScriptObject jso) {
		this.jso = jso;
	}

	public Map(Element mapDiv) {
		this(MapImpl.impl.construct(mapDiv));
		
	}
//	initialize()

	public Map(Element mapDiv, HasMapOptions options) {
		this(MapImpl.impl.construct(mapDiv, options.getJso()));
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public void render(Element mapDiv) {
		MapImpl.impl.render(jso, mapDiv);
	}

	@Override
	public void destroy() {
		MapImpl.impl.destroy(jso);
	}

	@Override
	public void setOptions(HasMapOptions mapOptions) {
		MapImpl.impl.setOptions(jso, mapOptions.getJso());
	}

	@Override
	public HasSize getTileSize() {
		return new Size(MapImpl.impl.getTileSize(jso));
	}

	@Override
	public HasLayer getLayer(String id) {
		return new Layer(MapImpl.impl.getLayer(jso, id));
	}

	@Override
	public void addLayer(HasLayer layer) {
		MapImpl.impl.addLayer(jso, layer.getJso());
	}

	@Override
	public void addLayers(HasLayer[] layers) {

//		MapImpl.impl.addLayer(jso, layers.getJso());
	}

	@Override
	public void removeLayer(HasLayer layer) {
		MapImpl.impl.removeLayer(jso, layer.getJso());
	}

	@Override
	public Integer getNumLayers() {
		return MapImpl.impl.getNumLayers(jso);
	}

	@Override
	public Integer getLayerIndex(HasLayer layer) {
		return MapImpl.impl.getLayerIndex(jso, layer.getJso());
	}

	@Override
	public void setLayerIndex(HasLayer layer, Integer index) {
		MapImpl.impl.setLayerIndex(jso, layer.getJso(), index);
	}

	@Override
	public void raiseLayer(HasLayer layer, Integer delta) {
		MapImpl.impl.raiseLayer(jso, layer.getJso(), delta);
	}

	@Override
	public void setBaseLayer(HasLayer newBaseLayer) {
		MapImpl.impl.setBaseLayer(jso, newBaseLayer.getJso());
	}

	@Override
	public void addControl(HasControl control, HasPixel pxels) {
		MapImpl.impl.addControl(jso, control.getJso(), pxels.getJso());
	}

	@Override
	public HasControl getControl(String id) {
		return new Control(MapImpl.impl.getControl(jso, id));
	}

	@Override
	public void removeControl(HasControl control) {
		MapImpl.impl.removeControl(jso, control.getJso());
	}

	@Override
	public void addPopup(HasPopup popup) {
		MapImpl.impl.addPopup(jso, popup.getJso());
	}

	@Override
	public void removePopup(HasPopup popup) {
		MapImpl.impl.removePopup(jso, popup.getJso());
	}

	@Override
	public HasSize getSize() {
		return new Size(MapImpl.impl.getSize(jso));
	}

	@Override
	public void updateSize() {
		MapImpl.impl.updateSize(jso);

	}

	@Override
	public HasLonLat getCenter() {
		return new LonLat(MapImpl.impl.getCenter(jso));
	}

	@Override
	public Integer getZoom() {
		return MapImpl.impl.getZoom(jso);
	}

	@Override
	public void pan(Integer dx, Integer dy, HasOptions options) {
		MapImpl.impl.pan(jso, dx, dy, options.getJso());
	}

	@Override
	public void panTo(HasLonLat lonlat) {
		MapImpl.impl.panTo(jso, lonlat.getJso());
	}

	@Override
	public void setCenter(HasLonLat lonlat) {
		MapImpl.impl.setCenter(jso, lonlat.getJso());
	}

	@Override
	public void setCenter(HasLonLat lonlat, Integer zoom, Boolean dragging, Boolean forceZoomChange) {
		MapImpl.impl.setCenter(jso, lonlat.getJso(), zoom, dragging, forceZoomChange);

	}

	@Override
	public String getProjection() {
		return MapImpl.impl.getProjection(jso);
	}

	@Override
	public HasProjection getProjectionObject() {
		return new Projection(MapImpl.impl.getProjectionObject(jso));
	}

	@Override
	public String getMaxResolution() {
		return MapImpl.impl.getMaxResolution(jso);
	}

	@Override
	public HasBounds getMaxExtent(HasOptions options) {
		return new Bounds(MapImpl.impl.getMaxExtent(jso, options.getJso()));
	}

	@Override
	public Integer getNumZoomLevels() {
		return MapImpl.impl.getNumZoomLevels(jso);
	}

	@Override
	public HasBounds getExtent() {
		return new Bounds(MapImpl.impl.getExtent(jso));
	}

	@Override
	public Double getResolution() {
		return MapImpl.impl.getResolution(jso);
	}

	@Override
	public String getUnits() {
		return MapImpl.impl.getUnits(jso);
	}

	@Override
	public Double getScale() {
		return MapImpl.impl.getScale(jso);
	}

	@Override
	public Integer getZoomForExtent(HasBounds bounds, Boolean closest) {
		return MapImpl.impl.getZoomForExtent(jso, bounds.getJso(), closest);
	}

	@Override
	public Double getResolutionForZoom(Double bounds) {

		return MapImpl.impl.getResolutionForZoom(jso, bounds);
	}

	@Override
	public Double getZoomForResolution(Double resolution, Boolean closest) {
		return MapImpl.impl.getZoomForResolution(jso, resolution, closest);
	}

	@Override
	public void zoomTo(Integer zoomLevel) {
		MapImpl.impl.zoomTo(jso, zoomLevel);
	}

	@Override
	public void zoomIn() {
		MapImpl.impl.zoomIn(jso);
	}

	@Override
	public void zoomOut() {
		MapImpl.impl.zoomOut(jso);
	}

	@Override
	public void zoomToExtent(HasBounds bounds, Boolean closest) {
		MapImpl.impl.zoomToExtent(jso, bounds.getJso(), closest);
	}

	@Override
	public void zoomToMaxExtent() {
		MapImpl.impl.zoomToMaxExtent(jso);
	}

	@Override
	public void zoomToScale(Double scale, Boolean closest) {
		MapImpl.impl.zoomToScale(jso, scale, closest);
	}

	@Override
	public HasPixel getViewPortPxFromLonLat(HasLonLat lonlat) {
		return new Pixel(MapImpl.impl.getViewPortPxFromLonLat(jso, lonlat.getJso()));
	}

	@Override
	public HasLonLat getLonLatFromPixel(HasPixel pixel) {
		return new LonLat(MapImpl.impl.getLonLatFromPixel(jso, pixel.getJso()));
	}

	@Override
	public HasPixel getPixelFromLonLat(HasLonLat lonlat) {
		return new Pixel(MapImpl.impl.getPixelFromLonLat(jso, lonlat.getJso()));
	}

	@Override
	public HasPixel getViewPortPxFromLayerPx(HasPixel pixel) {
		return new Pixel(MapImpl.impl.getViewPortPxFromLayerPx(jso, pixel.getJso()));
	}

	@Override
	public HasPixel getLayerPxFromViewPortPx(HasPixel pixel) {
		return new Pixel(MapImpl.impl.getLayerPxFromViewPortPx(jso, pixel.getJso()));
	}

	@Override
	public HasPixel getLayerPxFromLonLat(HasLonLat lonLat) {
		return new Pixel(MapImpl.impl.getLayerPxFromLonLat(jso, lonLat.getJso()));
	}
	

	public void setMaxExtent(HasBounds bounds){
		MapImpl.impl.setMaxExtent(jso, bounds.getJso());
	}
	
	public Bounds getMaxExtent(){
		return new Bounds(MapImpl.impl.getMaxExtent(jso));
	}



//	@Override
//	public void setResolutions(Double[] resolutions) {
//		JsArrayNumber resos  = (JsArrayNumber) JavaScriptObject.createArray();
//		for (int i = 0; i < resolutions.length; i++)		{
//			resos.push(resolutions[i]);;
//		}
//		
//		MapImpl.impl.setResolutions(jso, resos);	
//	}

//	@Override
//	public Double[] getResolutions() {
//		JsArrayNumber jsa = (JsArrayNumber) MapImpl.impl.getResolutions(jso);
//		Double[] rets = new Double[jsa.length()];
//		for (int i = 0; i < jsa.length(); i++) {
//			rets[i] = jsa.get(i);
//		}
//		return rets;
//	}
}
