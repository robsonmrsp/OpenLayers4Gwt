package br.com.mr.client.layer.impl;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasWMS extends HasJso {

	Boolean getIsBaseLayer();

	void setIsBaseLayer(Boolean sBaseLayer);

	Boolean getEncodeBBOX();

	void setEncodeBBOX(Boolean encodeBBOX);

	Boolean getNoMagic();

	void setNoMagic(Boolean noMagic);

	Boolean reverseAxisOrder();

	void mergeNewParams(HasWMSParans newParams);

	String getFullRequestString(HasWMSParans newParams, String altUrl);
}
