package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.impl.HasTile;

public interface HasGrid extends /*HasHTTPRequest*/HasJso {

	HasSize getSize();

	void setSize(HasSize size);

	HasLonLat getTileOrigin();

	void setTileOrigin(HasLonLat lonLat);

	HasGridOptions getTileOptions();

	void setTileOptions(HasGridOptions options);

	Boolean getSingleTile();

	void setSingleTile(Boolean singleTile);

	Double getRatio();

	void setRatio(Double ratio);

	Integer getBuffer();

	void setBuffer(Integer buffer);

	Integer getNumLoadingTiles();

	void setNumLoadingTiles(Integer numLoadingTiles);

	Integer getTileLoadingDelay();

	void setTileLoadingDelay(Integer tileLoadingDelay);
//
//	METODOS
//	
	void destroy();

	HasGrid clone(HasGrid toclone);

	void setTileSize(HasSize size);

	HasBounds getTilesBounds();

	HasTile addTile(HasBounds bounds, HasPixel position);

	HasBounds getTileBounds(HasPixel pixel);

}
