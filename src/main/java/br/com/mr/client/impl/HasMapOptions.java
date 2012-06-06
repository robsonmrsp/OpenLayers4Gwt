package br.com.mr.client.impl;

import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.basetypes.impl.HasSize;

public interface HasMapOptions extends HasJso {

	Double getMaxResolution();

	void setMaxResolution(Double maxResolution);

	HasLayer getBaseLayer();

	void setBaseLayer(HasLayer baseLayer);

	HasSize getTileSize();

	void setTileSize(HasSize tileSize);

	Boolean getAllOverlays();

	void setAllOverlays(Boolean allOverlays);

	HasProjection getDisplayProjection();

	void setDisplayProjection(HasProjection displayProjection);

	String getProjection();

	void setProjection(String projection);

	String getTheme();

	void setTheme(String theme);

	void setUnits(String units);

	String getUnits();

	Double getMinResolution();

	void getMinResolution(Double minResolution);

	Double getMaxScale();

	void getMaxScale(Double maxScale);

	Double getMinScale();

	void getMinScale(Double minScale);

	HasBounds getMaxExtent();

	void setMaxExtent(HasBounds bounds);

	HasBounds getMinExtent();

	void setMinExtent(HasBounds bounds);

	HasBounds getRestrictedExtent();

	void setRestrictedExtent(HasBounds bounds);

	String getFallThrough();

	void setFallThrough(String fallThrough);

	Integer getNumZoomLevels();

	void setNumZoomLevels(Integer numZoomLevels);

}
