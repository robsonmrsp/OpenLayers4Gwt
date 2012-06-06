package br.com.mr.client;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.LonLat;
import br.com.mr.client.basetypes.Pixel;
import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.impl.HasEvents;
import br.com.mr.client.impl.HasLayer;
import br.com.mr.client.impl.HasLayerOptions;
import br.com.mr.client.impl.HasMap;
import br.com.mr.client.impl.HasProjection;
import br.com.mr.client.impl.LayerImpl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class Layer implements HasLayer {
	JavaScriptObject jso;

	/**
	 * @param name
	 *            The layer name
	 * @param options
	 *            extra options to tag onto the layer
	 */
	public Layer(String name, HasLayerOptions options) {
		this(LayerImpl.impl.construct(name, options.getJso()));
	}

	public Layer(JavaScriptObject jso) {
		this.jso = jso;
	}

	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public HasEvents getEvents() {
		return new Events(LayerImpl.impl.getEvents(jso));
	}

	@Override
	public void setEvents(HasEvents events) {
		LayerImpl.impl.setEvents(jso, events.getJso());
	}

	@Override
	public HasMap getMap() {
		return new Map(LayerImpl.impl.getMap(jso));
	}

	@Override
	public void setMap(HasMap map) {
		LayerImpl.impl.setMap(jso, map.getJso());
	}

	@Override
	public Boolean getIsBaseLayer() {
		return LayerImpl.impl.getIsBaseLayer(jso);
	}

	@Override
	public Boolean getDisplayInLayerSwitcher() {
		return LayerImpl.impl.getDisplayInLayerSwitcher(jso);
	}

	@Override
	public void setDisplayInLayerSwitcher(Boolean displayInLayerSwitcher) {
		LayerImpl.impl.setDisplayInLayerSwitcher(jso, displayInLayerSwitcher);
	}

	@Override
	public Boolean getVisibility() {
		return LayerImpl.impl.getVisibility(jso);
	}

	@Override
	public void setVisibility(Boolean visibility) {
		LayerImpl.impl.setVisibility(jso, visibility);
	}

	@Override
	public String getAttribution() {
		return LayerImpl.impl.getAttribution(jso);
	}

	@Override
	public void setAttribution(String attribution) {
		LayerImpl.impl.setAttribution(jso, attribution);
	}

	@Override
	public Integer getGutter() {
		return LayerImpl.impl.getGutter(jso);
	}

	@Override
	public void setGutter(Integer gutter) {
		LayerImpl.impl.setGutter(jso, gutter);
	}

	@Override
	public HasProjection getProjection() {
		return new Projection(LayerImpl.impl.getProjection(jso));
	}

	@Override
	public void setProjection(HasProjection projection) {
		LayerImpl.impl.setProjection(jso, projection.getJso());

	}

	@Override
	public String getUnits() {
		return LayerImpl.impl.getUnits(jso);
	}

	@Override
	public void setUnits(String units) {
		LayerImpl.impl.setUnits(jso, units);

	}

	@Override
	public HasBounds getMaxExtent() {
		return new Bounds(LayerImpl.impl.getMaxExtent(jso));
	}

	@Override
	public void setMaxExtent(HasBounds bounds) {
		LayerImpl.impl.setMaxExtent(jso, bounds.getJso());

	}

	@Override
	public HasBounds getMinExtent() {
		return new Bounds(LayerImpl.impl.getMinExtent(jso));
	}

	@Override
	public void setMinExtent(HasBounds bounds) {
		LayerImpl.impl.setMinExtent(jso, bounds.getJso());
	}

	@Override
	public Double getMaxResolution() {

		return LayerImpl.impl.getMaxResolution(jso);
	}

	@Override
	public void setMaxResolution(Double maxResolution) {
		LayerImpl.impl.setMaxResolution(jso, maxResolution);

	}

	@Override
	public Double getMinResolution() {

		return LayerImpl.impl.getMinResolution(jso);
	}

	@Override
	public void setMinResolution(Double minResolution) {
		LayerImpl.impl.setMinResolution(jso, minResolution);
	}

	@Override
	public Integer getNumZoomLevels() {
		return LayerImpl.impl.getNumZoomLevels(jso);
	}

	@Override
	public void setNumZoomLevels(Integer NumZoomLevels) {
		LayerImpl.impl.setNumZoomLevels(jso, NumZoomLevels);

	}

	@Override
	public Double getMinScale() {
		return LayerImpl.impl.getMinScale(jso);
	}

	@Override
	public void setMinScale(Double minScale) {
		LayerImpl.impl.setMinScale(jso, minScale);

	}

	@Override
	public Double getMaxScale() {

		return LayerImpl.impl.getMaxScale(jso);
	}

	@Override
	public void setMaxScale(Double maxScale) {
		LayerImpl.impl.setMaxScale(jso, maxScale);

	}

	@Override
	public Boolean getDisplayOutsideMaxExtent() {

		return LayerImpl.impl.getDisplayOutsideMaxExtent(jso);
	}

	@Override
	public void setDisplayOutsideMaxExtent(Boolean displayOutsideMaxExtent) {
		LayerImpl.impl.setDisplayOutsideMaxExtent(jso, displayOutsideMaxExtent);

	}

	@Override
	public Boolean getWrapDateLine() {
		LayerImpl.impl.getWrapDateLine(jso);
		return null;
	}

	@Override
	public void setWrapDateLine(Boolean wrapDateLine) {
		LayerImpl.impl.setWrapDateLine(jso, wrapDateLine);

	}

	@Override
	public String getTransitionEffect() {

		return LayerImpl.impl.getTransitionEffect(jso);
	}

	@Override
	public void setTransitionEffect(String transitionEffect) {
		LayerImpl.impl.setTransitionEffect(jso, transitionEffect);

	}

	@Override
	public void setName(String name) {
		LayerImpl.impl.setName(jso, name);
	}

	@Override
	public void addOptions(HasLayerOptions newOptions, Boolean reinitialize) {
		LayerImpl.impl.addOptions(jso, newOptions.getJso(), reinitialize);
	}

	@Override
	public void onMapResize() {
		LayerImpl.impl.onMapResize(jso);

	}

	@Override
	public void redraw() {
		LayerImpl.impl.redraw(jso);
	}

	@Override
	public void removeMap(HasMap map) {
		LayerImpl.impl.removeMap(jso, map.getJso());
	}

	@Override
	public HasSize getImageSize(HasBounds bounds) {
		return new Size(LayerImpl.impl.getImageSize(jso, bounds.getJso()));
	}

	@Override
	public HasSize getTileSize() {
		return new Size(LayerImpl.impl.getTileSize(jso));
	}
	@Override
	public void setTileSize(HasSize size) {
		LayerImpl.impl.setTileSize(jso, size.getJso());
	}

	@Override
	public void display(Boolean display) {
		LayerImpl.impl.display(jso, display);
	}

	@Override
	public Boolean calculateInRange() {
		return LayerImpl.impl.calculateInRange(jso);
	}

	@Override
	public void setIsBaseLayer(Boolean isBaseLayer) {
		LayerImpl.impl.setIsBaseLayer(jso, isBaseLayer);

	}

	@Override
	public Double getResolution() {
		return LayerImpl.impl.getResolution(jso);
	}

	@Override
	public Integer getZoomForExtent(HasBounds extent, Boolean closest) {

		return LayerImpl.impl.getZoomForExtent(jso, extent.getJso(), closest);
	}

	@Override
	public Double getResolutionForZoom(Double zoom) {

		return LayerImpl.impl.getResolutionForZoom(jso, zoom);
	}

	@Override
	public Integer getZoomForResolution(Double resolution, Boolean closest) {

		return LayerImpl.impl.getZoomForResolution(jso, resolution, closest);
	}

	@Override
	public HasLonLat getLonLatFromViewPortPx(HasPixel pixel) {
		return new LonLat(LayerImpl.impl.getLonLatFromViewPortPx(jso, pixel.getJso()));
	}

	@Override
	public HasPixel getViewPortPxFromLonLat(HasLonLat lonLat) {

		return new Pixel(LayerImpl.impl.getViewPortPxFromLonLat(jso, lonLat.getJso()));
	}

	@Override
	public void setOpacity(Double opacity) {
		LayerImpl.impl.setOpacity(jso, opacity);
	}

	@Override
	public void setResolutions(Double[] resolutions) {
		JsArrayNumber resos  = (JsArrayNumber) JavaScriptObject.createArray();
		for (int i = 0; i < resolutions.length; i++)		{
			resos.push(resolutions[i]);;
		}

		LayerImpl.impl.setResolutions(jso, resos);	
	}

	@Override
	public Double[] getResolutions() {
		JsArrayNumber jsa = (JsArrayNumber) LayerImpl.impl.getResolutions(jso);
		Double[] rets = new Double[jsa.length()];
		for (int i = 0; i < jsa.length(); i++) {
			rets[i] = jsa.get(i);
		}
		return rets;
	}
}
