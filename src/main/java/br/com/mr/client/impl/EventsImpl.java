package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface EventsImpl extends JSFlyweightWrapper{
	EventsImpl impl = GWT.create(EventsImpl.class);

//	object	{Object} The js object to which this Events object is being added
//	element	{DOMElement} A dom element to respond to browser events
//	eventTypes	{Array(String)} Array of custom application events
//	fallThrough	{Boolean} Allow events to fall through after these have been handled?
//	options	{Object} Options for the events object.
	@Constructor("$wnd.OpenLayers.Events")
	JavaScriptObject construct();

}
