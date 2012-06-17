package br.com.mr.client.control.impl;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasLayerSwitcher extends HasJso {
	
	Boolean getRoundedCorner();

	String getRoundedCornerColor();

	Boolean getAscending();

	void setRoundedCorner(Boolean roundedCorner);

	void setRoundedCornerColor(String roundedCornerColor);

	void setAscending(Boolean ascending);

	void destroy();
}
