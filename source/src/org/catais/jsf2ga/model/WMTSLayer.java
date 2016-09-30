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

public class WMTSLayer {
	private Projection projection;
	private String resolutions = "[4000,3750,3500,3250,3000,2750,2500,2250,2000,1750,1500,1250,1000,750,650,500,250,100,50,20,10,5,2.5,2,1.5,1,0.5,0.25,0.1]";
	private String url;
	private String layer;
	private String requestEncoding = "REST";
	private String matrixSet = "21781";
	private String imageFormat;
	
	public Projection getProjection() {
		return projection;
	}
	public WMTSLayer setProjection(Projection projection) {
		this.projection = projection;
		return this;
	}

	public String getResolutions() {
		return resolutions;
	}
	
	public WMTSLayer setResolutions(String resolutions) {
		this.resolutions = resolutions;
		return this;
	}
	
	public String getUrl() {
		return url;
	}
	
	public WMTSLayer setUrl(String url) {
		this.url = url;
		return this;
	}
	
	public String getLayer() {
		return layer;
	}
	
	public WMTSLayer setLayer(String layer) {
		this.layer = layer;
		return this;
	}
	
	public String getRequestEncoding() {
		return requestEncoding;
	}
	
	public WMTSLayer setRequestEncoding(String requestEncoding) {
		this.requestEncoding = requestEncoding;
		return this;
	}
	
	public String getMatrixSet() {
		return matrixSet;
	}
	
	public WMTSLayer setMatrixSet(String matrixSet) {
		this.matrixSet = matrixSet;
		return this;
	}
		
	public String getImageFormat() {
		return imageFormat;
	}
	
	public WMTSLayer setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
		return this;
	}

}



