package br.com.mr.client.layer.impl;

import br.com.mr.client.impl.HasLayer;

public interface HasHTTPRequest extends HasLayer {
	void destroy();

	HasHTTPRequest clone(HasHTTPRequest toClone);

	void setUrl(String url);

	void mergeNewParams(HasWMSParans options);

	void redraw();
}
