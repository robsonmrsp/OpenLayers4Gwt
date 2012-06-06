package br.com.mr.client;

import br.com.mr.client.basetypes.Bounds;
import br.com.mr.client.basetypes.Size;
import br.com.mr.client.layer.impl.HasWMSParans;
import br.com.mr.client.layer.impl.WMSOptions;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class OpenLayers implements EntryPoint {
	@Override
	public void onModuleLoad() {

		final String WMS_URL = "http://labs.metacarta.com/wms/vmap0";
		//        example = new MapExample();

		// Defining a WMSLayer and adding it to a Map
		WMSParans wmsParams = new WMSParans();
		wmsParams.setFormat("image/png");
		wmsParams.setLayers("basic");
		wmsParams.setStyles("");

		WMSOptions wmsLayerParams = new WMSOptions();
		wmsLayerParams.setResolutions(new Double[]{1.40625,0.703125,0.3515625,0.17578125,0.087890625,0.0439453125});
		wmsLayerParams.setTileSize(new Size(350.0, 350.0));
		wmsLayerParams.setTransitionEffect("resize");

		WMS wmsLayer = new WMS(
				"Basic WMS",
				WMS_URL,
				wmsParams,
				wmsLayerParams);

		Map	map = null;
		MapOptions options = new MapOptions();

		//		options.setNumZoomLevels(16);
		options.setProjection("EPSG:4326");


		//		options.setMaxResolution(156543.03390625d);
		options.setNumZoomLevels(31);

		options.setMaxExtent(new Bounds(-2.003750834E7, -2.003750834E7,	2.003750834E7, 2.003750834E7));

		HasWMSParans parans = new WMSParans();
		parans.setLayers("openstreetmap");
		parans.setFormat("image/png");

		//		option.setOpacity(0.5);
		//		option.setSingleTile(true);
		//		WMS demolayer = new WMS("openstreetmap", "http://maps.opengeo.org/geowebcache/service/wms", parans);

		//		MapWidget mapWidget = new MapWidget(options);
		MapWidget mapWidget = new MapWidget("350px", "350px", options);
		//		map = mapWidget.getMap();


		mapWidget.getMap().addLayer(wmsLayer);
		//		System.out.println("OpenLayers.onModuleLoad()" + map.getCenter());
		mapWidget.getMap().zoomToExtent(new Bounds(-8239915.29516,4972384.2886,-8237267.51019, 4974997.76107), true);
		//		map.zoomToExtent(new Bounds(-8239915.29516,4972384.2886,-8237267.51019, 4974997.76107),false);
		//		mapWidget.getMap().zoomToExtent(new Bounds(-6036855.985719225,	-2586128.294983334, -3712505.0179556734, -332996.453897879), false);

		RootPanel.get().add(mapWidget);

	}	

}