package com.cummins.jacksonPartesIndiv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartesIndivHead {
	
	@JsonProperty("tipo_eval")
	private String tipo_eval;
	@JsonProperty("revision")
	private String revision;
	@JsonProperty("anio")
	private String anio;
	@JsonProperty("tipo_producto")
	private String tipo_producto;
	@JsonProperty("id_matriz")
	private String id_matriz;
	@JsonProperty("codigo_DR")
	private String codigo_DR;
	@JsonProperty("codigo_Dealer")
	private String codigo_Dealer;
	@JsonProperty("oem")
	private String oem;
	@JsonProperty("dealer_dr")
	private String dealer_dr;
	@JsonProperty("sp_code")
	private String sp_code;
	@JsonProperty("status")
	private String status;
	@JsonProperty("id_parte")
	private String id_parte;
	
	
	@JsonProperty
	public String getTipo_producto() {
		return tipo_producto;
	}
	
	@JsonProperty
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

	@JsonProperty
	public String getTipo_eval() {
		return tipo_eval;
	}

	@JsonProperty
	public void setTipo_eval(String tipo_eval) {
		this.tipo_eval = tipo_eval;
	}

	@JsonProperty
	public String getRevision() {
		return revision;
	}

	@JsonProperty
	public void setRevision(String revision) {
		this.revision = revision;
	}

	@JsonProperty
	public String getAnio() {
		return anio;
	}

	@JsonProperty
	public void setAnio(String anio) {
		this.anio = anio;
	}

	@JsonProperty
	public String getId_matriz() {
		return id_matriz;
	}

	@JsonProperty
	public void setId_matriz(String id_matriz) {
		this.id_matriz = id_matriz;
	}

	@JsonProperty
	public String getOem() {
		return oem;
	}

	@JsonProperty
	public void setOem(String oem) {
		this.oem = oem;
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
	public String getCodigo_DR() {
		return codigo_DR;
	}

	@JsonProperty
	public void setCodigo_DR(String codigo_DR) {
		this.codigo_DR = codigo_DR;
	}

	@JsonProperty
	public String getCodigo_Dealer() {
		return codigo_Dealer;
	}

	@JsonProperty
	public void setCodigo_Dealer(String codigo_Dealer) {
		this.codigo_Dealer = codigo_Dealer;
	}

	@JsonProperty
	public String getSp_code() {
		return sp_code;
	}

	@JsonProperty
	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}

	@JsonProperty
	public String getStatus() {
		return status;
	}

	@JsonProperty
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("id_parte")
	public String getId_parte() {
		return id_parte;
	}

	@JsonProperty("id_parte")
	public void setId_parte(String id_parte) {
		this.id_parte = id_parte;
	}

}
