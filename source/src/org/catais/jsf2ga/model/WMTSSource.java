package org.catais.jsf2ga.model;

public class WMTSSource {
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
	public WMTSSource setProjection(Projection projection) {
		this.projection = projection;
		return this;
	}

	public String getResolutions() {
		return resolutions;
	}
	
	public WMTSSource setResolutions(String resolutions) {
		this.resolutions = resolutions;
		return this;
	}
	
	public String getUrl() {
		return url;
	}
	
	public WMTSSource setUrl(String url) {
		this.url = url;
		return this;
	}
	
	public String getLayer() {
		return layer;
	}
	
	public WMTSSource setLayer(String layer) {
		this.layer = layer;
		return this;
	}
	
	public String getRequestEncoding() {
		return requestEncoding;
	}
	
	public WMTSSource setRequestEncoding(String requestEncoding) {
		this.requestEncoding = requestEncoding;
		return this;
	}
	
	public String getMatrixSet() {
		return matrixSet;
	}
	
	public WMTSSource setMatrixSet(String matrixSet) {
		this.matrixSet = matrixSet;
		return this;
	}
		
	public String getImageFormat() {
		return imageFormat;
	}
	
	public WMTSSource setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
		return this;
	}
}
