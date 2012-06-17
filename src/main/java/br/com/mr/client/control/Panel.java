package br.com.mr.client.control;

import br.com.mr.client.Control;
import br.com.mr.client.control.impl.HasPanel;
import br.com.mr.client.control.impl.HasPanelOptions;
import br.com.mr.client.control.impl.PanelImpl;
import br.com.mr.client.util.Utils;

import com.google.gwt.core.client.JavaScriptObject;

public class Panel extends Control implements HasPanel {
	
	public Panel() {
		this(PanelImpl.impl.construct());
	}

	public Panel(HasPanelOptions options) {
		this(PanelImpl.impl.construct(options.getJso()));
	}
	
	public Panel(JavaScriptObject jso) {
		super(jso);
	}

	public void addControls(Control... controls) {
		PanelImpl.impl.addControls(getJso(), Utils.createJsArray(controls));
	}
}
