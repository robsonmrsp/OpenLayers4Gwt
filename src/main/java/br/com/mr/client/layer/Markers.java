package br.com.mr.client.layer;

import java.util.ArrayList;
import java.util.List;

import br.com.mr.client.HasMarker;
import br.com.mr.client.Layer;
import br.com.mr.client.Marker;
import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.impl.HasBounds;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class Markers extends Layer implements HasMarkers {

	public Markers(String name, MarkersOptions options) {
		super(name, options);
	}

	public Markers(String name) {
		this(MarkersImpl.impl.construct(name));
	}

	public Markers(JavaScriptObject jso) {
		super(jso);
	}

	@Override
	public List<Marker> getMarkers() {
		return getListMArkers(MarkersImpl.impl.getMarkers(getJso()));
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setMarkers(List<Marker> markers) {
		JsArray<JavaScriptObject> jsArray = (JsArray<JavaScriptObject>) JsArray.createArray();
		for (int j = 0; j < markers.size(); j++) {
			jsArray.push(markers.get(j).getJso());
		}
		MarkersImpl.impl.setMarkers(getJso(), jsArray);
	}

	@Override
	public void destroy() {
		MarkersImpl.impl.destroy(getJso());
	}

	@Override
	public void addMarker(HasMarker marker) {
		MarkersImpl.impl.addMarker(getJso(), marker.getJso());
	}

	@Override
	public void removeMarker(HasMarker marker) {
		MarkersImpl.impl.removeMarker(getJso(), marker.getJso());
	}

	@Override
	public HasBounds getDataExtent() {

		return new Bounds(MarkersImpl.impl.getDataExtent(getJso()));
	}

	@SuppressWarnings("unchecked")
	private List<Marker> getListMArkers(JavaScriptObject markers) {

		List<Marker> rets = new ArrayList<Marker>();
		JsArray<JavaScriptObject> array = null;
		try {
			array = (JsArray<JavaScriptObject>) markers;
			for (int i = 0; i < array.length(); i++) {
				rets.add(new Marker(array.get(i)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rets;
	}
}
