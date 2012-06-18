package br.com.mr.client.basetypes;

import br.com.mr.client.basetypes.impl.HasSize;
import br.com.mr.client.basetypes.impl.SizeImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class Size implements HasSize {
	JavaScriptObject jso;

	public Size(JavaScriptObject jso) {
		this.jso = jso;
	}

	public Size(Integer w, Integer h) {
		this(w.doubleValue(), h.doubleValue());
	}

	public Size(Double w, Double h) {
		this(SizeImpl.impl.construct(w, h));
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public Double getWidth() {
		return SizeImpl.impl.getW(jso);
	}

	@Override
	public Double getHeight() {
		return SizeImpl.impl.getH(jso);
	}

	@Override
	public void setWidth(Double w) {
		SizeImpl.impl.setW(jso, w);
	}

	@Override
	public void setHeight(Double h) {
		SizeImpl.impl.setH(jso, h);
	}
}
