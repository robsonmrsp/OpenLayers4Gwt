package br.com.mr.client.impl;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;

import com.google.gwt.user.client.Element;

public interface HasMap extends HasJso {

	Integer TILE_WIDTH = 256;

	Integer TILE_HEIGHT = 256;

	public void render(Element mapDiv);

	public void destroy();

	public void setOptions(HasMapOptions mapOptions);

	public HasSize getTileSize();

	public HasLayer getLayer(String id);

	public void addLayer(HasLayer layer);

	public void addLayers(HasLayer[] layers);

	public void removeLayer(HasLayer layer);// ??

	public Integer getNumLayers();

	public Integer getLayerIndex(HasLayer layer);

	public void setLayerIndex(HasLayer layer, Integer index);

	public void raiseLayer(HasLayer layer, Integer delta);

	public void setBaseLayer(HasLayer newBaseLayer);

	public void addControl(HasControl control, HasPixel pxels);

	public HasControl getControl(String id);

	public void removeControl(HasControl control);

	public void addPopup(HasPopup popup);

	public void removePopup(HasPopup popup);

	public HasSize getSize();

	public void updateSize();

	public HasLonLat getCenter();

	public Integer getZoom();

	public void pan(Integer dx, Integer dy, HasOptions options);

	public void panTo(HasLonLat lonlat);

	public void setCenter(HasLonLat lonlat);

	public void setCenter(HasLonLat lonlat, Integer zoom, Boolean dragging, Boolean forceZoomChange);

	public String getProjection();

	public HasProjection getProjectionObject();

	public String getMaxResolution();

	public HasBounds getMaxExtent(HasOptions options);

	public Integer getNumZoomLevels();

	public HasBounds getExtent();

	public Double getResolution();

	public String getUnits();

	public Double getScale();

	public Integer getZoomForExtent(HasBounds bounds, Boolean closest);

	public Double getResolutionForZoom(Double bounds);

	public Double getZoomForResolution(Double resolution, Boolean closest);

	public void zoomTo(Integer zoomLevel);

	public void zoomIn();

	public void zoomOut();

	public void zoomToExtent(HasBounds bounds, Boolean closest);

	public void zoomToMaxExtent();

	public void zoomToScale(Double scale, Boolean closest);

	public HasPixel getViewPortPxFromLonLat(HasLonLat lonlat);

	public HasJso getLonLatFromPixel(HasPixel pixel);

	public HasJso getPixelFromLonLat(HasLonLat lonlat);

	public HasJso getViewPortPxFromLayerPx(HasPixel pixel);

	public HasJso getLayerPxFromViewPortPx(HasPixel pixel);

	public HasJso getLayerPxFromLonLat(HasLonLat lonLat);

	public void setMaxExtent(HasBounds bounds);
	
	public Bounds getMaxExtent();

//	void setResolutions(Double[] resolutions);
//	Double[] getResolutions();
}
