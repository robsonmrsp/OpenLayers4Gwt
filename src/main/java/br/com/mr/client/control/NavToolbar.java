package br.com.mr.client.control;


import br.com.mr.client.control.impl.HasNavToolbar;
import br.com.mr.client.control.impl.NavToolbarImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class NavToolbar extends Panel implements HasNavToolbar {
	public NavToolbar() {
		this(NavToolbarImpl.impl.construct());
	}

	public NavToolbar(JavaScriptObject jso) {
		super(jso);
	}
}
