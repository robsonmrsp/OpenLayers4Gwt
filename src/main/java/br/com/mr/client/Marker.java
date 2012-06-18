package br.com.mr.client;

import br.com.mr.client.basetypes.impl.HasLonLat;

import com.google.gwt.core.client.JavaScriptObject;

public class Marker implements HasMarker {

	private JavaScriptObject jso;

	public Marker(HasLonLat lonLat, HasIcon icon ) {
		this(MarkerImpl.impl.construct(lonLat.getJso(), icon.getJso()));
	}

	//only use to create a Marker like a copy
	public Marker(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public void destroy() {
		MarkerImpl.impl.destroy(jso);
		
	}

	@Override
	public Boolean isDrawn() {
		return MarkerImpl.impl.isDrawn(jso);
	}

	public void setOpacity(Double opacity) {
		MarkerImpl.impl.setOpacity(jso);
		
	}

}
