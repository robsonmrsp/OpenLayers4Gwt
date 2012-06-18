package br.com.mr.client.layer;

import java.util.List;

import br.com.mr.client.HasMarker;
import br.com.mr.client.Marker;
import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasJso;

public interface HasMarkers extends HasJso {

	Boolean getIsBaseLayer();

	void setIsBaseLayer(Boolean isBaseLayer);

	List<Marker> getMarkers();

	void setMarkers(List<Marker> markers);

	void destroy();

	void addMarker(HasMarker marker);

	void removeMarker(HasMarker marker);

	HasBounds getDataExtent();
}
