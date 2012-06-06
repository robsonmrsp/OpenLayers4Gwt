package br.com.mr.client;

import br.com.mr.client.layer.Grid;
import br.com.mr.client.layer.impl.HasWMS;
import br.com.mr.client.layer.impl.HasWMSOptions;
import br.com.mr.client.layer.impl.HasWMSParans;
import br.com.mr.client.layer.impl.WMSImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class WMS extends Grid implements HasWMS {

	public WMS(String name, String url, HasWMSParans parans) {
		this(WMSImpl.impl.construct(name, url, parans.getJso(), null));
	}
	
	public WMS(String name, String url, HasWMSParans parans, HasWMSOptions options) {
		this(WMSImpl.impl.construct(name, url, parans.getJso(), options.getJso()));
	}

	public WMS(JavaScriptObject construct) {
		super(construct);
	}

	@Override
	public Boolean getEncodeBBOX() {
		return WMSImpl.impl.getEncodeBBOX(getJso());
	}

	@Override
	public void setEncodeBBOX(Boolean encodeBBOX) {
		WMSImpl.impl.setEncodeBBOX(getJso(), encodeBBOX);
	}

	@Override
	public Boolean getNoMagic() {
		return WMSImpl.impl.getNoMagic(getJso());
	}

	@Override
	public void setNoMagic(Boolean noMagic) {
		WMSImpl.impl.setNoMagic(getJso(), noMagic);
	}

	@Override
	public Boolean reverseAxisOrder() {
		return WMSImpl.impl.reverseAxisOrder(getJso());
	}

	@Override
	public String getFullRequestString(HasWMSParans newParams, String altUrl) {
		return WMSImpl.impl.getFullRequestString(getJso(), newParams.getJso(), altUrl);
	}
}
