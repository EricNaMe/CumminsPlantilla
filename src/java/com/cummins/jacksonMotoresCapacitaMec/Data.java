package com.cummins.jacksonMotoresCapacitaMec;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ID_PARTICIPACION_MOTOR",
    "motor",
    "MEC_REQ",
    "mec_cert",
    "porcent_motor",
    "porcent_obtenido"
})
public class Data {

    @JsonProperty("ID_PARTICIPACION_MOTOR")
    private String ID_PARTICIPACION_MOTOR;
    @JsonProperty("motor")
    private String motor;
    @JsonProperty("MEC_REQ")
    private String MEC_REQ;
    @JsonProperty("mec_cert")
    private String mec_cert;
    @JsonProperty("porcent_motor")
    private String porcent_motor;
    @JsonProperty("porcent_obtenido")
    private String porcent_obtenido;
    
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @JsonProperty("ID_PARTICIPACION_MOTOR")
	public String getID_PARTICIPACION_MOTOR() {
		return ID_PARTICIPACION_MOTOR;
	}

    @JsonProperty("ID_PARTICIPACION_MOTOR")
	public void setID_PARTICIPACION_MOTOR(String iD_PARTICIPACION_MOTOR) {
		ID_PARTICIPACION_MOTOR = iD_PARTICIPACION_MOTOR;
	}

    @JsonProperty("motor")
	public String getMotor() {
		return motor;
	}

    @JsonProperty("motor")
	public void setMotor(String motor) {
		this.motor = motor;
	}

    @JsonProperty("MEC_REQ")
	public String getMEC_REQ() {
		return MEC_REQ;
	}

    @JsonProperty("MEC_REQ")
	public void setMEC_REQ(String mEC_REQ) {
		MEC_REQ = mEC_REQ;
	}

    @JsonProperty("mec_cert")
	public String getMec_cert() {
		return mec_cert;
	}

    @JsonProperty("mec_cert")
	public void setMec_cert(String mec_cert) {
		this.mec_cert = mec_cert;
	}

    @JsonProperty("porcent_motor")
	public String getPorcent_motor() {
		return porcent_motor;
	}

    @JsonProperty("porcent_motor")
	public void setPorcent_motor(String porcent_motor) {
		this.porcent_motor = porcent_motor;
	}

    @JsonProperty("porcent_obtenido")
	public String getPorcent_obtenido() {
		return porcent_obtenido;
	}

    @JsonProperty("porcent_obtenido")
	public void setPorcent_obtenido(String porcent_obtenido) {
		this.porcent_obtenido = porcent_obtenido;
	}

}
