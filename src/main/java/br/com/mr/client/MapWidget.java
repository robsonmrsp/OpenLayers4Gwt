package br.com.mr.client;

import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends Widget {

	private Map map;
	private MapOptions options;

	public MapWidget() {
		Element e = DOM.createDiv();
		e.setAttribute("id", "map_impl");
		setElement(e);
//		map = new Map(e);
		setWidth(Window.getClientWidth() +"px");
		setHeight(Window.getClientHeight() +"px");
		Window.addResizeHandler(new ResizeHandler() {
			@Override
			public void onResize(ResizeEvent event) {
				setWidth(Window.getClientWidth() +"px");
				setHeight(Window.getClientHeight()  +"px");
			}
		});
	
	}

//	public MapWidget(HasMapOptions options) {
//		setElement(Document.get().createDivElement());
//		map = new Map(getElement(), options);
//	}

	public MapWidget(MapOptions options) {
		Element e = DOM.createDiv();
		e.setAttribute("id", "map_impl");
		this.options = options;
		setElement(e);
		
		Window.addResizeHandler(new ResizeHandler() {
			@Override
			public void onResize(ResizeEvent event) {
				setWidth(Window.getClientWidth() +"px");
				setHeight(Window.getClientHeight()  +"px");
			}
		});
		
		setWidth(Window.getClientWidth() +"px");
		setHeight(Window.getClientHeight() +"px");
	}
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
