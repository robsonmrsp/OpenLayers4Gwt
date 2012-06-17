package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.impl.HasMap;

public interface HasXYZ extends HasJso {
	Boolean getIsBaseLayer();

	void setIsBaseLayer(Boolean sphericalMercator);

	Boolean getSphericalMercator();

	void setSphericalMercator(Boolean sphericalMercator);

	Integer getZoomOffset();

	void setZoomOffset(Integer zoomOffset);

	Double[] getServerResolutions();

	void setServerResolutions(Double[] resolutions);

	HasXYZ jsClone();

	void setMap(HasMap map);
}
