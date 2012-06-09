package br.com.mr.client;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.impl.HasLayer;
import br.com.mr.client.impl.HasMapOptions;
import br.com.mr.client.impl.HasProjection;
import br.com.mr.client.impl.MapOptionsImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class MapOptions implements HasMapOptions {

	public JavaScriptObject jso;

	public MapOptions() {
		this(MapOptionsImpl.impl.construct());
	}

	public MapOptions(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public Boolean getAllOverlays() {
		return MapOptionsImpl.impl.getAllOverlays(jso);
	}

	@Override
	public void setAllOverlays(Boolean allOverlays) {
		MapOptionsImpl.impl.setAllOverlays(jso, allOverlays);
	}

	@Override
	public String getProjection() {
		return MapOptionsImpl.impl.getProjection(jso);
	}

	@Override
	public void setProjection(String projection) {
		MapOptionsImpl.impl.setProjection(jso, projection);
	}

	@Override
	public void setUnits(String units) {
		MapOptionsImpl.impl.setUnits(jso, units);
	}

	@Override
	public String getUnits() {
		return MapOptionsImpl.impl.getUnits(jso);
	}

	@Override
	public Double getMaxResolution() {
		return MapOptionsImpl.impl.getMaxResolution(jso);
	}

	@Override
	public void setMaxResolution(Double maxResolution) {
		MapOptionsImpl.impl.setMaxResolution(jso, maxResolution);
	}

	@Override
	public Double getMinResolution() {
		return MapOptionsImpl.impl.getMinResolution(jso);
	}

	@Override
	public void getMinResolution(Double minResolution) {
		MapOptionsImpl.impl.getMinResolution(jso, minResolution);
	}

	@Override
	public Double getMaxScale() {
		return MapOptionsImpl.impl.getMaxScale(jso);
	}

	@Override
	public void getMaxScale(Double maxScale) {
		MapOptionsImpl.impl.getMaxScale(jso, maxScale);
	}

	@Override
	public Double getMinScale() {
		return MapOptionsImpl.impl.getMinScale(jso);
	}

	@Override
	public void getMinScale(Double minScale) {
		MapOptionsImpl.impl.getMinScale(jso, minScale);
	}

	@Override
	public HasBounds getMaxExtent() {
		return new Bounds(MapOptionsImpl.impl.getMaxExtent(jso));
	}

	@Override
	public void setMaxExtent(HasBounds bounds) {
		MapOptionsImpl.impl.setMaxExtent(jso, bounds.getJso());
	}

	@Override
	public HasBounds getMinExtent() {
		return new Bounds(MapOptionsImpl.impl.getMinExtent(jso));
	}

	@Override
	public void setMinExtent(HasBounds bounds) {
		MapOptionsImpl.impl.setMinExtent(jso, bounds.getJso());
	}

	@Override
	public HasBounds getRestrictedExtent() {
		return new Bounds(MapOptionsImpl.impl.getRestrictedExtent(jso));
	}

	@Override
	public void setRestrictedExtent(HasBounds bounds) {
		MapOptionsImpl.impl.setRestrictedExtent(jso, bounds.getJso());
	}

	@Override
	public Integer getNumZoomLevels() {
		return MapOptionsImpl.impl.getNumZoomLevels(jso);
	}

	@Override
	public void setNumZoomLevels(Integer numZoomLevels) {
		MapOptionsImpl.impl.setNumZoomLevels(jso, numZoomLevels);
	}

	@Override
	public HasLayer getBaseLayer() {
		
		return new Layer( MapOptionsImpl.impl.getBaseLayer(jso));
	}

	@Override
	public void setBaseLayer(HasLayer baseLayer) {
		MapOptionsImpl.impl.setBaseLayer(jso, baseLayer.getJso());
		
	}
	

	@Override
	public HasSize getTileSize() {
		
		return new Size(MapOptionsImpl.impl.getTileSize(jso));
	}

	@Override
	public void setTileSize(HasSize tileSize) {
		MapOptionsImpl.impl.setTileSize(jso, tileSize.getJso());
		
	}

	@Override
	public HasProjection getDisplayProjection() {
		
		return new Projection( MapOptionsImpl.impl.getDisplayProjection(jso));
	}

	@Override
	public void setDisplayProjection(HasProjection displayProjection) {
		
		MapOptionsImpl.impl.setDisplayProjection(jso, displayProjection.getJso());
	}

	@Override
	public String getTheme() {
		
		return MapOptionsImpl.impl.getTheme(jso);
	}

	@Override
	public void setTheme(String theme) {
		MapOptionsImpl.impl.setTheme(jso, theme);
	}

	@Override
	public String getFallThrough() {
		return MapOptionsImpl.impl.getFallThrough(jso);
	}

	@Override
	public void setFallThrough(String fallThrough) {
		MapOptionsImpl.impl.setFallThrough(jso, fallThrough);	
	}

}
