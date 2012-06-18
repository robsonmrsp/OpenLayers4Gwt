package br.com.mr.client;

import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;

import com.google.gwt.core.client.JavaScriptObject;

public class Icon implements HasIcon {

	private JavaScriptObject jso;

	public Icon(String url, HasSize size, HasPixel offSet) {
		this(IconImpl.impl.construct(url, size.getJso(), offSet.getJso()));
	}

	protected Icon(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public Boolean isDrawn() {
		return IconImpl.impl.isDrawn(jso);
	}

	public void setOpacity(Double d) {
		IconImpl.impl.setOpacity(jso, d);
	}

	public Icon clone() {
		return new Icon(IconImpl.impl.clone(jso));
	}
}
