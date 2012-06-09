package br.com.mr.client.impl;

import br.com.mr.client.basetypes.impl.HasJso;

public interface HasOptions extends HasJso{
//    animate {Boolean} Use panTo instead of setCenter.  Default is true.
//    dragging {Boolean} Call setCenter with dragging true.  Default is false.
	Boolean getRestricted();//	{Boolean} True to zoom to restricted extent if it is set.  Defaults to true.
	void setRestricted(Boolean restricted);
	
}
