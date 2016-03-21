
package com.cummins.jacksonCurso;

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
    "nombreCurso",
    "idCurso",
    "check"
})
public class Curso {

    @JsonProperty("nombreCurso")
    private String nombreCurso;
    @JsonProperty("idCurso")
    private String idCurso;
    
    @JsonProperty("checkStr")
    private String checkStr;
    @JsonProperty("check")
    private boolean check;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The nombreCurso
     */
    @JsonProperty("nombreCurso")
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * 
     * @param nombreCurso
     *     The nombreCurso
     */
    @JsonProperty("nombreCurso")
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * 
     * @return
     *     The idCurso
     */
    @JsonProperty("idCurso")
    public String getIdCurso() {
        return idCurso;
    }

    /**
     * 
     * @param idCurso
     *     The idCurso
     */
    @JsonProperty("idCurso")
    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonAnySetter
	public String getCheckStr() {
		return checkStr;
	}

    @JsonAnySetter
	public void setCheckStr(String checkStr) {
		this.check = Boolean.parseBoolean(checkStr);
		this.checkStr = checkStr;
	}

    @JsonAnySetter
	public boolean isCheck() {
		return check;
	}

    @JsonAnySetter
	public void setCheck(boolean check) {
		this.check = check;
	}

}
