/*
A JSF2 map.geo.admin (ol3) wrapper component.
Copyright (C) 2016 Stefan Ziegler

Based on jsf2leaf.
Copyright (C) 2015 Leonardo Ciocari

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details. 
*/

package org.catais.jsf2ga.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.catais.jsf2ga.model.Layer;

public class Map {
	Group group = new Group();
//	VectorLayer vLayer = new VectorLayer();
	private LatLong center;
	private String width = "800px";
	private String height = "600px";
	private String resolutions = "[4000,3750,3500,3250,3000,2750,2500,2250,2000,1750,1500,1250,1000,750,650,500,250,100,50,20,10,5,2.5,2,1.5,1,0.5,0.25,0.1,0.05]";
	private Projection projection;

	public Group getGroup() {
		return group;
	}
	
	public Map setGroup(Group group) {
		this.group = group;
		return this;
	}
	
	public LatLong getCenter() {
		return center;
	}

	public Map setCenter(LatLong center) {
		this.center = center;
		return this;
	}
	
	public String getWidth() {
		return width;
	}

	public Map setWidth(String width) {
		this.width = width;
		return this;
	}

	public String getHeight() {
		return height;
	}

	public Map setHeight(String height) {
		this.height = height;
		return this;
	}
	
	public String getResolutions() {
		return resolutions;
	}
	
	public Map setResolutions(String resolutions) {
		this.resolutions = resolutions;
		return this;
	}
	
	public Projection getProjection() {
		return projection;
	}
	
	public Map setProjection(Projection projection) {
		this.projection = projection;
		return this;
	}
	
	
	
}
