package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasWMSOptions extends HasJso {

	Double getOpacity();

	void setOpacity(Double opacity);

	Boolean getSingleTile();

	void setSingleTile(Boolean singleTile);
}
