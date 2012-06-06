package br.com.mr.client.basetypes;

import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.LonLatImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class LonLat implements HasLonLat {
	JavaScriptObject jso;

	public LonLat(JavaScriptObject jso) {
		this.jso = jso;
	}
	
	public LonLat(Double lon, Double lat) {
		this(LonLatImpl.impl.construct(lon, lat));
	}
	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

}
