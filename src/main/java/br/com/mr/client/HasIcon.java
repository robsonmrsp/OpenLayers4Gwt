package br.com.mr.client;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasIcon extends HasJso {
	Boolean isDrawn();
	void setOpacity(Double d) ;
	public Icon clone();
}
