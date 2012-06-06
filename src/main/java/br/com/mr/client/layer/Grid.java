package br.com.mr.client.layer;

import br.com.mr.client.Tile;
import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.LonLat;
import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.impl.HasTile;
import br.com.mr.client.layer.impl.GridImpl;
import br.com.mr.client.layer.impl.HasGrid;
import br.com.mr.client.layer.impl.HasGridOptions;
import br.com.mr.client.layer.impl.HasWMSParans;

import com.google.gwt.core.client.JavaScriptObject;

public class Grid extends HTTPRequest implements HasGrid {

	public Grid(JavaScriptObject jso) {
		super(jso);
	}

	public Grid(String name, String url, HasWMSParans parans, HasGridOptions options) {
		this(GridImpl.impl.construct(name, url, parans.getJso(), options.getJso()));
	}

	@Override
	public HasSize getSize() {
		return new Size(GridImpl.impl.getSize(getJso()));
	}

	@Override
	public void setSize(HasSize size) {
		GridImpl.impl.setSize(getJso(), size.getJso());
	}

	@Override
	public HasLonLat getTileOrigin() {
		return new LonLat(GridImpl.impl.getTileOrigin(getJso()));
	}

	@Override
	public void setTileOrigin(HasLonLat lonLat) {
		GridImpl.impl.setTileOrigin(getJso(), lonLat.getJso());
	}

	@Override
	public HasGridOptions getTileOptions() {
		return new GridOptions();
	}

	@Override
	public void setTileOptions(HasGridOptions options) {
		GridImpl.impl.setTileOptions(getJso(), options.getJso());
	}

	@Override
	public Boolean getSingleTile() {
		return GridImpl.impl.getSingleTile(getJso());
	}

	@Override
	public void setSingleTile(Boolean singleTile) {
		GridImpl.impl.setSingleTile(getJso(), singleTile);
	}

	@Override
	public Double getRatio() {
		return GridImpl.impl.getRatio(getJso());
	}

	@Override
	public void setRatio(Double ratio) {
		GridImpl.impl.setRatio(getJso(), ratio);
	}

	@Override
	public Integer getBuffer() {
		return GridImpl.impl.getBuffer(getJso());
	}

	@Override
	public void setBuffer(Integer buffer) {
		GridImpl.impl.setBuffer(getJso(), buffer);
	}

	@Override
	public Integer getNumLoadingTiles() {
		return GridImpl.impl.getNumLoadingTiles(getJso());
	}

	@Override
	public void setNumLoadingTiles(Integer numLoadingTiles) {
		GridImpl.impl.setNumLoadingTiles(getJso(), numLoadingTiles);
	}

	@Override
	public Integer getTileLoadingDelay() {
		return GridImpl.impl.getTileLoadingDelay(getJso());
	}

	@Override
	public void setTileLoadingDelay(Integer tileLoadingDelay) {
		GridImpl.impl.setTileLoadingDelay(getJso(), tileLoadingDelay);
	}

	@Override
	public HasGrid clone(HasGrid toclone) {
		return new Grid(GridImpl.impl.clone(getJso(), toclone.getJso()));
	}

	@Override
	public HasBounds getTilesBounds() {
		return new Bounds(GridImpl.impl.getTilesBounds(getJso()));
	}

	@Override
	public HasTile addTile(HasBounds bounds, HasPixel position) {

		return new Tile(GridImpl.impl.addTile(getJso(), bounds.getJso(), position.getJso()));
	}

	@Override
	public HasBounds getTileBounds(HasPixel pixel) {
		return new Bounds(GridImpl.impl.getTileBounds(getJso(), pixel.getJso()));
	}
}
