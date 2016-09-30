package org.catais.jsf2ga.model;

public class TileLayer extends Layer {
	private int minResolution;
	private int maxResolution;
	private WMTSSource wmtsSource;
	
	public int getMinResolution() {
		return minResolution;
	}
	
	public TileLayer setMinResolution(int minResolution) {
		this.minResolution = minResolution;
		return this;
	}
	
	public int getMaxResolution() {
		return maxResolution;
	}
	
	public TileLayer setMaxResolution(int maxResolution) {
		this.maxResolution = maxResolution;
		return this;
	}
	
	public WMTSSource getWmtsSource() {
		return wmtsSource;
	}
	
	public TileLayer setWmtsSource(WMTSSource wmtsSource) {
		this.wmtsSource = wmtsSource;
		return this;
	}

}
