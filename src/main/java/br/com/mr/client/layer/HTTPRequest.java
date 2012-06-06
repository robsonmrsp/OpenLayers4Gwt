package br.com.mr.client.layer;

import br.com.mr.client.Layer;
import br.com.mr.client.layer.impl.HTTPRequestImpl;
import br.com.mr.client.layer.impl.HasHTTPRequest;
import br.com.mr.client.layer.impl.HasHTTPRequestOptions;
import br.com.mr.client.layer.impl.HasWMSParans;

import com.google.gwt.core.client.JavaScriptObject;


public class HTTPRequest extends Layer implements HasHTTPRequest{
	
	
	public HTTPRequest(String name,String url, HasWMSParans parans, HasHTTPRequestOptions options) {
		this(HTTPRequestImpl.impl.construct(name, url, parans.getJso(), options.getJso()));
	}
	
	public HTTPRequest(JavaScriptObject jso) {
		super(jso);
	}

	@Override
	public void destroy() {
		HTTPRequestImpl.impl.destroy(getJso());
	}

	@Override
	public HasHTTPRequest clone(HasHTTPRequest toClone) {
		return new HTTPRequest(HTTPRequestImpl.impl.clone(getJso(), toClone.getJso()));
	}

	@Override
	public void setUrl(String url) {
		HTTPRequestImpl.impl.setUrl(getJso(),url);
	}

	@Override
	public void mergeNewParams(HasWMSParans options) {
		HTTPRequestImpl.impl.mergeNewParams(getJso(),options.getJso());
	}
}
