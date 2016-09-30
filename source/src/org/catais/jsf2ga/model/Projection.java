/*
A JSF2 ol3 wrapper component.
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

public class Projection {
	private String code = "EPSG:21781";
	private String extent = "[420000, 30000, 900000, 350000]";
	private String units = "m";
	
	public String getCode() {
		return code;
	}
	public Projection setCode(String code) {
		this.code = code;
		return this;
	}
	public String getExtent() {
		return extent;
	}
	public Projection setExtent(String extent) {
		this.extent = extent;
		return this;
	}
	public String getUnits() {
		return units;
	}
	public Projection setUnits(String units) {
		this.units = units;
		return this;
	}
}
