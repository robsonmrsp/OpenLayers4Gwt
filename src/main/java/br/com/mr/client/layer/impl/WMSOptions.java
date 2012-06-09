package br.com.mr.client.layer.impl;

import br.com.mr.client.layer.GridOptions;



public class WMSOptions extends GridOptions implements HasWMSOptions {


//	public WMSOptions() {
//		this(WMSOptionsImpl.impl.construct());
//	}
//
//	public WMSOptions(JavaScriptObject jso) {
//		super(jso);
//	}


	@Override
	public Double getOpacity() {
		
		return WMSOptionsImpl.impl.getOpacity(getJso());
	}

	@Override
	public void setOpacity(Double opacity) {
		WMSOptionsImpl.impl.setOpacity(getJso(), opacity);
	}

	@Override
	public Boolean getSingleTile() {
		return WMSOptionsImpl.impl.getSingleTile(getJso());
	}

	@Override
	public void setSingleTile(Boolean singleTile) {
		WMSOptionsImpl.impl.setSingleTile(getJso(), singleTile);
	}
}
