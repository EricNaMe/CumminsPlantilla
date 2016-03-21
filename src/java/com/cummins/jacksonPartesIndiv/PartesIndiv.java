package com.cummins.jacksonPartesIndiv;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PartesIndiv {
	
	@JsonProperty("id_matriz")
	private String id_matriz;
	@JsonProperty("matriz_name")
	private String matriz_name;
	@JsonProperty("dealer_dr")
	private String dealer_dr;
	@JsonProperty("tipo_producto")
	private String tipo_producto;
	
	@JsonProperty
	public String getId_matriz() {
		return id_matriz;
	}
	@JsonProperty
	public void setId_matriz(String id_matriz) {
		this.id_matriz = id_matriz;
	}
	@JsonProperty
	public String getMatriz_name() {
		return matriz_name;
	}
	@JsonProperty
	public void setMatriz_name(String matriz_name) {
		this.matriz_name = matriz_name;
	}
	@JsonProperty
	public String getDealer_dr() {
		return dealer_dr;
	}
	@JsonProperty
	public void setDealer_dr(String dealer_dr) {
		this.dealer_dr = dealer_dr;
	}
	@JsonProperty
	public String getTipo_producto() {
		return tipo_producto;
	}
	@JsonProperty
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

	
	
	

}
