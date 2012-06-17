package br.com.mr.client.control.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface ControlOptionsImpl extends JSFlyweightWrapper {

	ControlOptionsImpl impl = GWT.create(ControlOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject contruct();	
}
