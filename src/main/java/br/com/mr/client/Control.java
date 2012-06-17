package br.com.mr.client;

import br.com.mr.client.impl.ControlImpl;
import br.com.mr.client.impl.HasControl;

import com.google.gwt.core.client.JavaScriptObject;

public class Control implements HasControl {
	public static int TYPE_BUTTON = 1;

	public static int TYPE_TOGGLE = 2;

	public static int TYPE_TOOL = 3;

	private JavaScriptObject jso;

	public Control() {
		this(ControlImpl.impl.construct());
	}

	public Control(JavaScriptObject control) {
		this.jso = control;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}
}
