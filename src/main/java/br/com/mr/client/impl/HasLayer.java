package br.com.mr.client.impl;

import br.com.mr.client.basetypes.impl.HasBounds;
import br.com.mr.client.basetypes.impl.HasJso;
import br.com.mr.client.basetypes.impl.HasLonLat;
import br.com.mr.client.basetypes.impl.HasPixel;
import br.com.mr.client.basetypes.impl.HasSize;

//
//events	                		                          {OpenLayers.Events}
//map	    	    		                                  {OpenLayers.Map} This variable is set when the layer is added to the map, via the accessor function setMap().
//isBaseLayer		                                          {Boolean} Whether or not the layer is a base layer.
//displayInLayerSwitcher	                                  {Boolean} Display the layer’s name in the layer switcher.
//visibility	                    	                      {Boolean} The layer should be displayed in the map.
//attribution	                            	              {String} Attribution string, displayed when an OpenLayers.Control.Attribution has been added to the map.
//eventListeners	                    	                  {Object} If set as an option at construction, the eventListeners object will be registered with OpenLayers.Events.on.
//gutter	                                    		      {Integer} Determines the width (in pixels) of the gutter around image tiles to ignore.
//projection	                                        	  {OpenLayers.Projection} or                                           {String} Set in the layer options to override the default projection string this layer - also set maxExtent, maxResolution, and units if appropriate.
//units			                                          {String} The layer map units.
//scales	        		                                  {Array} An array of map scales in descending order.
//resolutions	            	                              {Array} A list of map resolutions (map units per pixel) in descending order.
//maxExtent	                	                          {OpenLayers.Bounds} The center of these bounds will not stray outside of the viewport extent during panning.
//minExtent	                    	                      {OpenLayers.Bounds}
//maxResolution	                                          {Float} Default max is 360 deg / 256 px, which corresponds to zoom level 0 on gmaps.
//minResolution	                                          {Float}
//numZoomLevels	                                          {Integer}
//minScale	                        	                  {Float}
//maxScale	                            	              {Float}
//displayOutsideMaxExtent	                                  {Boolean} Request map tiles that are completely outside of the max extent for this layer.
//wrapDateLine	                                          {Boolean} #487 for more info.
//transitionEffect	                                       {String} The transition effect to use when the map is panned or zoomed.

public interface HasLayer extends HasJso{
	HasEvents getEvents();

	void setEvents(HasEvents events);

	HasMap getMap();

	void setMap(HasMap map);

	Boolean getIsBaseLayer();

	Boolean getDisplayInLayerSwitcher();

	void setDisplayInLayerSwitcher(Boolean displayInLayerSwitcher);

	Boolean getVisibility();

	void setVisibility(Boolean visibility);;

	String getAttribution();

	void setAttribution(String attribution);

	// eventListeners ??
	// eventListeners ??

	Integer getGutter();

	void setGutter(Integer gutter);

	HasProjection getProjection();

	void setProjection(HasProjection projection);

	String getUnits();

	void setUnits(String units);

	// scales ?? TODO
	// scales ?? TODO
	// resolutions
	// resolutions
	HasBounds getMaxExtent();

	void setMaxExtent(HasBounds bounds);

	HasBounds getMinExtent();

	void setMinExtent(HasBounds bounds);

	Double getMaxResolution();

	void setMaxResolution(Double maxResolution);

	Double getMinResolution();

	void setMinResolution(Double minResolution);

	Integer getNumZoomLevels();

	void setNumZoomLevels(Integer NumZoomLevels);

	Double getMinScale();

	void setMinScale(Double minScale);

	Double getMaxScale();

	void setMaxScale(Double maxScale);

	Boolean getDisplayOutsideMaxExtent();

	void setDisplayOutsideMaxExtent(Boolean displayOutsideMaxExtent);

	Boolean getWrapDateLine();

	void setWrapDateLine(Boolean wrapDateLine);

	String getTransitionEffect();

	void setTransitionEffect(String transitionEffect);

	void setName(String name);;

	void addOptions(HasLayerOptions newOptions, Boolean reinitialize);

	void onMapResize();

	void redraw();

	void removeMap(HasMap map);

	HasSize getImageSize(HasBounds bounds);

	void setTileSize(HasSize size);

	void display(Boolean display);

	Boolean calculateInRange();

	void setIsBaseLayer(Boolean isBaseLayer);

	Double getResolution();

	Integer getZoomForExtent(HasBounds extent, Boolean closest);

	Double getResolutionForZoom(Double zoom);

	Integer getZoomForResolution(Double resolution, Boolean closest);

	HasLonLat getLonLatFromViewPortPx(HasPixel pixel);

	HasPixel getViewPortPxFromLonLat(HasLonLat lonLat);

	void setOpacity(Double opacity);
	void setResolutions(Double[] resolutions);
	Double[] getResolutions();
	HasSize getTileSize();

}
