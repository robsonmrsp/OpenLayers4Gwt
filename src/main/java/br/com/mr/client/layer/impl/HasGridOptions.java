package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.Size;
import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.basetypes.impl.HasSize;

public interface HasGridOptions extends HasJso{
	
	public void setTileSize(Size size);

	public void setBuffer(int buffer);

	HasSize getTileSize();
}
