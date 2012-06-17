package br.com.mr.client.layer;

import br.com.mr.client.layer.impl.HasXYZ;
import br.com.mr.client.layer.impl.HasXYZOptions;
import br.com.mr.client.layer.impl.XYZImpl;
import br.com.mr.client.util.Utils;

import com.google.gwt.core.client.JavaScriptObject;

public class XYZ extends Grid implements HasXYZ {

	
	public XYZ(String name, String url,  HasXYZOptions options) {
		this(XYZImpl.impl.construct(name, url, options.getJso()));
	}
	
	public XYZ() {
		this(XYZImpl.impl.construct());
	}

	public XYZ(JavaScriptObject jso) {
		super(jso);
	}

	@Override
	public void setIsBaseLayer(Boolean sphericalMercator) {
		XYZImpl.impl.setIsBaseLayer(getJso(), sphericalMercator);

	}

	@Override
	public Boolean getSphericalMercator() {
		return XYZImpl.impl.getSphericalMercator(getJso());
	}

	@Override
	public void setSphericalMercator(Boolean sphericalMercator) {
		XYZImpl.impl.setSphericalMercator(getJso(), sphericalMercator);
	}

	@Override
	public Integer getZoomOffset() {
		return XYZImpl.impl.getZoomOffset(getJso());
	}

	@Override
	public void setZoomOffset(Integer zoomOffset) {
		XYZImpl.impl.setZoomOffset(getJso(), zoomOffset);
	}

	@Override
	public void setServerResolutions(Double[] resolutions) {
		XYZImpl.impl.setServerResolutions(getJso(), Utils.createJsArrayNumber(resolutions));
	}

	@Override
	public Double[] getServerResolutions() {
		return Utils.createDoubleArray(XYZImpl.impl.getServerResolutions(getJso()));
	}

	@Override
	public HasXYZ jsClone() {
		return new XYZ(XYZImpl.impl.clone(getJso()));
	}
}
