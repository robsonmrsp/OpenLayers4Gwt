package br.com.mr.client.layer;


import br.com.mr.client.layer.impl.HasOSM;
import br.com.mr.client.layer.impl.HasOSMOptions;
import br.com.mr.client.layer.impl.OSMImpl;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A class to access OpenStreetMap tiles. By default, uses the OpenStreetMap
 * hosted tile.openstreetmap.org ‘Mapnik’ tileset. If you wish to use tiles@home
 * / osmarender layer instead, you can pass a layer like:
 * 
 * @author robson
 * 
 */
public class OSM extends XYZ implements HasOSM {
	public OSM() {
		this(OSMImpl.impl.construct());
	}

	public OSM(JavaScriptObject jso) {
		super(jso);
	}
	
	public OSM(String name, String url,  HasOSMOptions options) {
		this(OSMImpl.impl.construct(name, url, options.getJso()));
	}
}
