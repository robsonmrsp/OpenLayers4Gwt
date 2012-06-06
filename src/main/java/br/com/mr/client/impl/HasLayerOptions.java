package br.com.mr.client.impl;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.impl.HasJso;

public interface HasLayerOptions extends HasJso {

	public void setDisplayInLayerSwitcher(Boolean display);

	public void setIsBaseLayer(Boolean isBaseLayer);

	public void setAttribution(String attribution);

	public void setLayerOpacity(Double opacity);

	public void setVisibility(Boolean visibility);

	public void setNumZoomLevels(int numZoomLevels);

	public void setDisplayOutsideMaxExtent(Boolean displayOutsideMaxExtent);

	public void setApplyAlphaHack(Boolean applyAlphaHack);

	public void setAlwaysInRange(Boolean alwaysInRange);

	public void setGutter(Double gutter);

	public void setProjection(String projection);

	public void setUnits(String units);

	public void setMaxExtent(Bounds maxExtent);

	public void setMinExtent(Bounds minExtent);

	public void setMaxResolution(Double maxResolution);

	public void setMinResolution(Double minResolution);

	public void setMaxScale(Double maxScale);

	public void setMinScale(Double minScale);

	public void setScales(Double[] scales);

	public void setTransitionEffect(String transition);

	// public void setTransitionEffect(TransitionEffect transition);
//	public void setResolutions(Double[] resolutions);
	void setResolutions(Double[] resolutions);
	Double[] getResolutions();	

}
