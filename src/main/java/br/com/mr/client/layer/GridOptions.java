package br.com.mr.client.layer;

import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.layer.impl.GridOptionsImpl;
import br.com.mr.client.layer.impl.HasGridOptions;


public class GridOptions extends HTTPRequestOptions implements HasGridOptions {

	public GridOptions() {
		super(GridOptionsImpl.impl.construct());
	}
	
	@Override
	public void setTileSize(Size size) {
		GridOptionsImpl.impl.setTileSize(getJso(), size.getJso());
	}
	
	@Override
	public HasSize getTileSize() {
		return new Size(GridOptionsImpl.impl.getTileSize(getJso()));
	}

	@Override
	public void setBuffer(int buffer) {
		GridOptionsImpl.impl.setBuffer(getJso(), buffer);
	}
}
