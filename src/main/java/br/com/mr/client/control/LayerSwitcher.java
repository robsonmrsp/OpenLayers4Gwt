package br.com.mr.client.control;

import br.com.mr.client.Control;
import br.com.mr.client.control.impl.HasLayerSwitcher;
import br.com.mr.client.control.impl.HasLayerSwitcherOptions;
import br.com.mr.client.control.impl.LayerSwitcherImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class LayerSwitcher extends Control implements HasLayerSwitcher {

	public LayerSwitcher(HasLayerSwitcherOptions options) {
		this(LayerSwitcherImpl.impl.construct(options.getJso()));
	}

	public LayerSwitcher(JavaScriptObject jso) {
		super(jso);
	}

	public LayerSwitcher() {
		this(LayerSwitcherImpl.impl.construct());
	}

	@Override
	public Boolean getRoundedCorner() {
		return LayerSwitcherImpl.impl.getRoundedCorner(getJso());
	}

	@Override
	public String getRoundedCornerColor() {
		return LayerSwitcherImpl.impl.getRoundedCornerColor(getJso());
	}

	@Override
	public Boolean getAscending() {
		return LayerSwitcherImpl.impl.getAscending(getJso());
	}

	@Override
	public void setRoundedCorner(Boolean roundedCorner) {
		LayerSwitcherImpl.impl.setRoundedCorner(getJso(), roundedCorner);
	}

	@Override
	public void setRoundedCornerColor(String roundedCornerColor) {
		LayerSwitcherImpl.impl.setRoundedCornerColor(getJso(), roundedCornerColor);
	}

	@Override
	public void setAscending(Boolean ascending) {
		LayerSwitcherImpl.impl.setAscending(getJso(), ascending);
	}

	@Override
	public void destroy() {
		LayerSwitcherImpl.impl.destroy(getJso());
	}
}
