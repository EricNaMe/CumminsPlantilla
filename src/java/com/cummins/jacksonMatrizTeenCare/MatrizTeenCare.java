
package com.cummins.jacksonMatrizTeenCare;

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
    "nombreMatrizTeenCare",
    "id",
    "para",
    "ultimaModificacion"
})
public class MatrizTeenCare {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nombreMatrizTeenCare")
    private String nombreMatrizTeenCare;
    @JsonProperty("para")
    private String para;
    @JsonProperty("ultimaModificacion")
    private String ultimaModificacion;
    @JsonProperty("checkStr")
    private String checkStr;
    @JsonProperty("check")
    private boolean check;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The nombreMatrizTeenCare
     */
    @JsonProperty("nombreMatrizTeenCare")
    public String getNombreMatrizTeenCare() {
        return nombreMatrizTeenCare;
    }

    /**
     * 
     * @param nombreMatrizTeenCare
     *     The nombreMatrizTeenCare
     */
    @JsonProperty("nombreMatrizTeenCare")
    public void setNombreMatrizTeenCare(String nombreMatrizTeenCare) {
        this.nombreMatrizTeenCare = nombreMatrizTeenCare;
    }

    /**
     * 
     * @return
     *     The idMatrizTeenCare
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param idMatrizTeenCare
     *     The idMatrizTeenCare
     */
    @JsonProperty("id")
    public void setId(Integer idMatrizTeenCare) {
        this.id = idMatrizTeenCare;
    }

    /**
     * 
     * @return
     *     The para
     */
    @JsonProperty("para")
    public String getPara() {
        return para;
    }

    /**
     * 
     * @param para
     *     The para
     */
    @JsonProperty("para")
    public void setPara(String para) {
        this.para = para;
    }

    /**
     * 
     * @return
     *     The ultimaModificacion
     */
    @JsonProperty("ultimaModificacion")
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    /**
     * 
     * @param ultimaModificacion
     *     The ultimaModificacion
     */
    @JsonProperty("ultimaModificacion")
    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
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
    	//System.out.println("checkStr:" + checkStr + " " + check);
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
