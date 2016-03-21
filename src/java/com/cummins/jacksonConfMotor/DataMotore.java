
package com.cummins.jacksonConfMotor;

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
    "ultimaModificacion",
    "check"
})
public class DataMotore {

    @JsonProperty("nombreMatrizTeenCare")
    private String nombreMatrizTeenCare;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("para")
    private String para;
    @JsonProperty("ultimaModificacion")
    private String ultimaModificacion;
    @JsonProperty("check")
    private Boolean check;
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
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * 
     * @return
     *     The check
     */
    @JsonProperty("check")
    public Boolean getCheck() {
        return check;
    }

    /**
     * 
     * @param check
     *     The check
     */
    @JsonProperty("check")
    public void setCheck(Boolean check) {
        this.check = check;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
