package br.com.mr.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends Widget {

	private Map map;
	private MapOptions options;

	public MapWidget() {
		Element e = DOM.createDiv();
		setElement(e);
		map = new Map(e);
	}

//	public MapWidget(HasMapOptions options) {
//		setElement(Document.get().createDivElement());
//		map = new Map(getElement(), options);
//	}

	public MapWidget(String width, String height, MapOptions options) {
		Element e = DOM.createDiv();
		this.options = options;
		setElement(e);
		setWidth(width);
		setHeight(height);
	}

	public Map getMap() {
		if (map == null) {
			if (options == null)
				map = new Map(getElement());
			else
				map = new Map(getElement(), options);
		}
		return map;
	}

}
