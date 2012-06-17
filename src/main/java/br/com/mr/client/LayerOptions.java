package br.com.mr.client;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.impl.HasLayerOptions;
import br.com.mr.client.impl.LayerOptionsImpl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class LayerOptions implements HasLayerOptions {

	private JavaScriptObject jso;

	public LayerOptions() {
		this(LayerOptionsImpl.impl.construct());
	}

	public LayerOptions(JavaScriptObject construct) {
		jso = construct;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public void setDisplayInLayerSwitcher(Boolean display) {
		LayerOptionsImpl.impl.setDisplayInLayerSwitcher(jso, display);
	}

	@Override
	public void setIsBaseLayer(Boolean isBaseLayer) {
		LayerOptionsImpl.impl.setIsBaseLayer(jso, isBaseLayer);
	}

	@Override
	public void setAttribution(String attribution) {
		LayerOptionsImpl.impl.setAttribution(jso, attribution);
	}

	@Override
	public void setLayerOpacity(Double opacity) {
		LayerOptionsImpl.impl.setLayerOpacity(jso, opacity);
	}

	@Override
	public void setVisibility(Boolean visibility) {
		LayerOptionsImpl.impl.setVisibility(jso, visibility);
	}

	@Override
	public void setNumZoomLevels(int numZoomLevels) {
		LayerOptionsImpl.impl.setNumZoomLevels(jso, numZoomLevels);
	}

	@Override
	public void setDisplayOutsideMaxExtent(Boolean displayOutsideMaxExtent) {
		LayerOptionsImpl.impl.setDisplayOutsideMaxExtent(jso, displayOutsideMaxExtent);
	}

	@Override
	public void setApplyAlphaHack(Boolean applyAlphaHack) {
		LayerOptionsImpl.impl.setApplyAlphaHack(jso, applyAlphaHack);
	}

	@Override
	public void setAlwaysInRange(Boolean alwaysInRange) {
		LayerOptionsImpl.impl.setAlwaysInRange(jso, alwaysInRange);
	}

	@Override
	public void setGutter(Double gutter) {
		LayerOptionsImpl.impl.setGutter(jso, gutter);
	}

	@Override
	public void setProjection(String projection) {
		LayerOptionsImpl.impl.setProjection(jso, projection);
	}

	@Override
	public void setUnits(String units) {
		LayerOptionsImpl.impl.setUnits(jso, units);
	}

	@Override
	public void setMaxExtent(Bounds maxExtent) {
		LayerOptionsImpl.impl.setMaxExtent(jso, maxExtent.getJso());
	}

	@Override
	public void setMinExtent(Bounds minExtent) {
		LayerOptionsImpl.impl.setMinExtent(jso, minExtent.getJso());
	}

	@Override
	public void setMaxResolution(Double maxResolution) {
		LayerOptionsImpl.impl.setMaxResolution(jso, maxResolution);
	}

	@Override
	public void setMinResolution(Double minResolution) {
		LayerOptionsImpl.impl.setMinResolution(jso, minResolution);
	}

	@Override
	public void setMaxScale(Double maxScale) {
		LayerOptionsImpl.impl.setMaxScale(jso, maxScale);
	}

	@Override
	public void setMinScale(Double minScale) {
		LayerOptionsImpl.impl.setMinScale(jso, minScale);
	}

	@Override
	public void setScales(Double[] scales) {
		// LayerOptionsImpl.impl.
	}

	@Override
	public void setTransitionEffect(String transition) {
		LayerOptionsImpl.impl.setTransitionEffect(jso, transition);
	}

	// @Override
	// public void setResolutions(Double[] resolutions) {
	// // LayerOptionsImpl.impl.setResolutions(jso, resolutions);
	// }

	@Override
	public void setResolutions(Double[] resolutions) {
		JsArrayNumber resos = (JsArrayNumber) JavaScriptObject.createArray();
		for (int i = 0; i < resolutions.length; i++) {
			resos.push(resolutions[i]);
			;
		}

		LayerOptionsImpl.impl.setResolutions(jso, resos);
	}

	@Override
	public Double[] getResolutions() {
		JsArrayNumber jsa = (JsArrayNumber) LayerOptionsImpl.impl.getResolutions(jso);
		Double[] rets = new Double[jsa.length()];
		for (int i = 0; i < jsa.length(); i++) {
			rets[i] = jsa.get(i);
		}
		return rets;
	}
}
