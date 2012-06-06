package br.com.mr.client.basetypes;

import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.PixelImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class Pixel implements HasPixel {
	JavaScriptObject jso;

	public Pixel(JavaScriptObject jso) {
		this.jso = jso;
	}
	public Pixel(Double x, Double y) {
		this(PixelImpl.imp.construct(x,y));
	}
	
	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

}
