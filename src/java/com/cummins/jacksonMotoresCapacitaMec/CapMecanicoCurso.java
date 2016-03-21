package com.cummins.jacksonMotoresCapacitaMec;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sp_code",
    "promotion_id",
    "Nombre_Mecanico",
    "Cursos"
})

public class CapMecanicoCurso {
	
	@JsonProperty("sp_code")
	private String sp_code;
	@JsonProperty("promotion_id")
	private String promotion_id;
	@JsonProperty("Nombre_Mecanico")
	private String Nombre_Mecanico;
	@JsonProperty("Cursos")
	private String Cursos;
	
	@JsonProperty("sp_code")
	public String getSp_code() {
		return sp_code;
	}
	@JsonProperty("sp_code")
	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}
	
	@JsonProperty("Nombre_Mecanico")
	public String getNombre_Mecanico() {
		return Nombre_Mecanico;
	}
	@JsonProperty("Nombre_Mecanico")
	public void setNombre_Mecanico(String nombre_Mecanico) {
		Nombre_Mecanico = nombre_Mecanico;
	}
	
	@JsonProperty("Cursos")
	public String getCursos() {
		return Cursos;
	}
	
	@JsonProperty("Cursos")
	public void setCursos(String cursos) {
		Cursos = cursos;
	}
	
	@JsonProperty("promotion_id")
	public String getPromotion_id() {
		return promotion_id;
	}
	
	@JsonProperty("promotion_id")
	public void setPromotion_id(String promotion_id) {
		this.promotion_id = promotion_id;
	}

}
