
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
    "nombreCurso",
    "idCurso",
    "check"
})
public class DataJefe {

    @JsonProperty("nombreCurso")
    private String nombreCurso;
    @JsonProperty("idCurso")
    private String idCurso;
    @JsonProperty("check")
    private Boolean check;
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
