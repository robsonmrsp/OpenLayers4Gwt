package br.com.mr.client;

import br.com.mr.client.impl.HasTile;
import br.com.mr.client.impl.TileImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class Tile implements HasTile {

	private JavaScriptObject jso;

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	public Tile() {
		this(TileImpl.impl.construct());
	}

	public Tile(JavaScriptObject jso) {
		this.jso = jso;
	}

}
