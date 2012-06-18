package br.com.mr.client;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasMarker extends HasJso{
	void destroy();
	Boolean isDrawn();
	void setOpacity(Double opacity) ;
}
