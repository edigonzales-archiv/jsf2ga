package org.catais.jsf2ga.model;

import java.util.ArrayList;
import java.util.List;


public class Group {
	private List<Layer> layers = new ArrayList<Layer>();

	public List<Layer> getLayers() {
		return layers;
	}

	public Group setLayers(List<Layer> layers) {
		this.layers = layers;
		return this;
	}
	
	public Group addLayer(Layer layer) {
		this.layers.add(layer);
		return this;
	}

}
