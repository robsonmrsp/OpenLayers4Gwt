package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasWMSParans extends HasJso {
	
	String getLayers();
	void setLayers(String layers);

	Boolean getTransparent();
	void setTransparent(Boolean transparent);

	String getStyles();
	void setStyles(String styles);

	String getFormat();
	void setFormat(String format);
}
