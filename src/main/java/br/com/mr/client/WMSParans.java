package br.com.mr.client;

import br.com.mr.client.layer.impl.HasWMSParans;
import br.com.mr.client.layer.impl.WMSParansImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class WMSParans implements HasWMSParans {
	JavaScriptObject jso;

	public WMSParans() {
		this(WMSParansImpl.impl.construct());
	}

	public WMSParans(JavaScriptObject jso) {
		this.jso = jso;
	}

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public String getLayers() {
		return WMSParansImpl.impl.getLayers(jso);
	}

	@Override
	public void setLayers(String layers) {
		WMSParansImpl.impl.setLayers(jso, layers);
	}

	@Override
	public Boolean getTransparent() {
		return WMSParansImpl.impl.getTransparent(jso);
	}

	@Override
	public void setTransparent(Boolean transparent) {
		WMSParansImpl.impl.setTransparent(jso, transparent);
	}

	@Override
	public String getStyles() {
		return WMSParansImpl.impl.getStyles(jso);
	}

	@Override
	public void setStyles(String styles) {
		WMSParansImpl.impl.setStyles(jso, styles);
	}

	@Override
	public String getFormat() {
		return WMSParansImpl.impl.getFormat(jso);
	}

	@Override
	public void setFormat(String format) {
		WMSParansImpl.impl.setFormat(jso, format);
	}
}
