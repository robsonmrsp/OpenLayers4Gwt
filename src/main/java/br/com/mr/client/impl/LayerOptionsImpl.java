package br.com.mr.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface LayerOptionsImpl extends JSFlyweightWrapper {
	LayerOptionsImpl impl = GWT.create(LayerOptionsImpl.class);

	@Constructor("Object")
	JavaScriptObject construct();
	
	public void setDisplayInLayerSwitcher(JavaScriptObject jso, Boolean display);

	public void setIsBaseLayer(JavaScriptObject jso, Boolean isBaseLayer);

	public void setAttribution(JavaScriptObject jso, String attribution);

	public void setLayerOpacity(JavaScriptObject jso, Double opacity);

	public void setVisibility(JavaScriptObject jso, Boolean visibility);

	public void setNumZoomLevels(JavaScriptObject jso, int numZoomLevels);

	public void setDisplayOutsideMaxExtent(JavaScriptObject jso, Boolean displayOutsideMaxExtent);

	public void setApplyAlphaHack(JavaScriptObject jso, Boolean applyAlphaHack);

	public void setAlwaysInRange(JavaScriptObject jso, Boolean alwaysInRange);

	public void setGutter(JavaScriptObject jso, Double gutter);

	public void setProjection(JavaScriptObject jso, String projection);

	public void setUnits(JavaScriptObject jso, String units);

	public void setMaxExtent(JavaScriptObject jso, JavaScriptObject maxExtent);

	public void setMinExtent(JavaScriptObject jso, JavaScriptObject minExtent);

	public void setMaxResolution(JavaScriptObject jso, Double maxResolution);

	public void setMinResolution(JavaScriptObject jso, Double minResolution);

	public void setMaxScale(JavaScriptObject jso, Double maxScale);

	public void setMinScale(JavaScriptObject jso, Double minScale);

	public void setScales(JavaScriptObject jso, JavaScriptObject scales);

	public void setTransitionEffect(JavaScriptObject jso, String transition);

	// public void setTransitionEffect(JavaScriptObject jso, TransitionEffect transition);
	@BeanProperties
	void setResolutions(JavaScriptObject jso, JavaScriptObject resolutions);
	@BeanProperties
	JavaScriptObject getResolutions(JavaScriptObject jso);
	
}
