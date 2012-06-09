package br.com.mr.client.basetypes;

import br.com.mr.client.basetypes.impl.BoundsImpl;
import br.com.mr.client.basetypes.impl.HasBounds;

import com.google.gwt.core.client.JavaScriptObject;

public class Bounds implements HasBounds {
	JavaScriptObject jso;

	public Bounds(Double left, Double bottom, Double right, Double top) {
		this(BoundsImpl.impl.construct(left, bottom, right, top));
	}

	public Bounds(JavaScriptObject jso) {
		this.jso = jso;
	}

	public Bounds() {
		this(BoundsImpl.impl.construct());
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}
}
