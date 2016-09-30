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

package org.catais.jsf2ga.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.catais.jsf2ga.model.Group;
import org.catais.jsf2ga.model.LatLong;
import org.catais.jsf2ga.model.Map;
import org.catais.jsf2ga.model.Projection;
import org.catais.jsf2ga.model.TileLayer;
import org.catais.jsf2ga.model.WMTSSource;

import java.io.Serializable;

@ManagedBean(name = "gaBean")
@ViewScoped 
public class GaBean implements Serializable {  
	private static final long serialVersionUID = 1L;
	
	private Map springfieldMap = new Map();

	public GaBean()
	{
		Projection projection = new Projection();
		
		springfieldMap.setWidth("350px").setHeight("250px").setCenter(new LatLong("607500","228500"));
		springfieldMap.setProjection(projection);
		
		WMTSSource s1 = new WMTSSource();
		s1.setProjection(projection);
		s1.setUrl("http://geoweb.so.ch/mapcache/wmts/1.0.0/{Layer}/default/21781/{TileMatrix}/{TileRow}/{TileCol}");
		s1.setLayer("Orthofoto");
		s1.setImageFormat("image/jpeg");
		
		TileLayer tileLayer =  new TileLayer();
		tileLayer.setWmtsSource(s1);
//		tileLayer.setMaxResolution(400);
		
		Group groupLayer = new Group();
		groupLayer.addLayer(tileLayer);
		
		springfieldMap.setGroup(groupLayer);
		
		
//		WMTSLayer wmtsLayer = new WMTSLayer();
//		wmtsLayer.setUrl("http://geoweb.so.ch/mapcache/wmts/1.0.0/{Layer}/default/21781/{TileMatrix}/{TileRow}/{TileCol}");
//		wmtsLayer.setLayer("Orthofoto");
//		wmtsLayer.setImageFormat("image/jpeg");
		
		
		
//		Layer layer = new Layer();
//		String geojson = "{'type':'FeatureCollection','crs':{'type':'name','properties':{'name':'EPSG:21781'}},'features':[{'type':'Feature','geometry':{'type':'Point','coordinates':[611504.897,234325.432]},'properties':{'T_Id':448,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':438},'id':'Nomenklatur_FlurnamePos.448'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611607.611,234060.287]},'properties':{'T_Id':449,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':439},'id':'Nomenklatur_FlurnamePos.449'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611676.883,234327.82]},'properties':{'T_Id':450,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':439},'id':'Nomenklatur_FlurnamePos.450'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611870.59,234076.002]},'properties':{'T_Id':451,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':440},'id':'Nomenklatur_FlurnamePos.451'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611805.873,234535.637]},'properties':{'T_Id':452,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':440},'id':'Nomenklatur_FlurnamePos.452'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611402.184,233821.418]},'properties':{'T_Id':453,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':441},'id':'Nomenklatur_FlurnamePos.453'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611876.174,233785.763]},'properties':{'T_Id':454,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':442},'id':'Nomenklatur_FlurnamePos.454'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611831.731,233527.824]},'properties':{'T_Id':455,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':444},'id':'Nomenklatur_FlurnamePos.455'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611755.71,233900.245]},'properties':{'T_Id':456,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':445},'id':'Nomenklatur_FlurnamePos.456'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611527.972,233374.676]},'properties':{'T_Id':457,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':446},'id':'Nomenklatur_FlurnamePos.457'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611614.621,233669.643]},'properties':{'T_Id':458,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':444},'id':'Nomenklatur_FlurnamePos.458'},{'type':'Feature','geometry':{'type':'Point','coordinates':[611936.181,233932.281]},'properties':{'T_Id':459,'T_Type':'Nomenklatur_FlurnamePos','Ori':100.0,'HAli':'Center','VAli':'Half','Groesse':'mittel','Stil':'normal','FlurnamePos_von':447},'id':'Nomenklatur_FlurnamePos.459'}]}";
//		layer.setText(geojson);
//		layer.setProjection("EPSG:21781");
//		
//		springfieldMap.addLayer(layer);
		
	}

	public Map getSpringfieldMap() {
		return springfieldMap;
	}

}
