package br.com.mr.client.control;

import br.com.mr.client.Control;
import br.com.mr.client.control.impl.HasZoomBox;
import br.com.mr.client.control.impl.ZoomBoxImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class ZoomBox extends Control implements HasZoomBox {
	public ZoomBox() {
		this(ZoomBoxImpl.impl.construct());
	}

	public ZoomBox(JavaScriptObject jso) {
		super(jso);
	}
}
