package br.com.mr.client.util;

import java.util.ArrayList;
import java.util.List;

import br.com.mr.client.Marker;
import br.com.mr.client.basetypes.impl.HasJso;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;

public class Utils {

	public static Double[] createDoubleArray(JavaScriptObject jso) {
		JsArrayNumber jsa = (JsArrayNumber) JsArrayNumber.createArray();
		Double[] rets = null;

		try {
			jsa = (JsArrayNumber) jso;
			rets = new Double[jsa.length()];
			for (int i = 0; i < jsa.length(); i++) {
				rets[i] = jsa.get(i);
			}
		} catch (Exception e) {
		}
		return rets;
	}

	@SuppressWarnings("unchecked")
	public static <T extends HasJso> JavaScriptObject createJsArray(T[] array) {
		JsArray<JavaScriptObject> resos = (JsArray<JavaScriptObject>) JavaScriptObject.createArray();
		try {
			for (int i = 0; i < array.length; i++) {
				resos.push(array[i].getJso());
				;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resos;
	}

	public static JavaScriptObject createJsArrayNumber(Double[] array) {
		JsArrayNumber resos = (JsArrayNumber) JavaScriptObject.createArray();
		try {
			for (int i = 0; i < array.length; i++) {
				resos.push(array[i]);
			}
		} catch (Exception e) {
		}

		return resos;
	}

}
