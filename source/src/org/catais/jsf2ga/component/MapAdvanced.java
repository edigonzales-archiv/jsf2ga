package org.catais.jsf2ga.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

import org.catais.jsf2ga.model.Map;

@FacesComponent("mapAdvanced") 
public class MapAdvanced extends UINamingContainer {
 
	private transient Map mapObject;
	
	public Map getMapObject() {
		if (mapObject == null) {			
			mapObject = ((Map) this.getAttributes().get("map"));
		}
		return mapObject;
	}
}