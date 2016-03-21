
package com.cummins.jacksonCalenEval;

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
    "id",
    "idBody",
    "numEval",
    "tipoEval",
    "anioEval",
    "fecIniEval",
    "fecFinEval",
    "estatus"
})
public class CalenEval {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idBody")
    private String idBody;
    @JsonProperty("numEval")
    private String numEval;
    @JsonProperty("tipoEval")
    private String tipoEval;
    @JsonProperty("anioEval")
    private String anioEval;
    @JsonProperty("fecIniEval")
    private String fecIniEval;
    @JsonProperty("fecFinEval")
    private String fecFinEval;
    @JsonProperty("estatus")
    private String estatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The idBody
     */
    @JsonProperty("idBody")
    public String getIdBody() {
        return idBody;
    }

    /**
     * 
     * @param idBody
     *     The idBody
     */
    @JsonProperty("idBody")
    public void setIdBody(String idBody) {
        this.idBody = idBody;
    }

    /**
     * 
     * @return
     *     The numEval
     */
    @JsonProperty("numEval")
    public String getNumEval() {
        return numEval;
    }

    /**
     * 
     * @param numEval
     *     The numEval
     */
    @JsonProperty("numEval")
    public void setNumEval(String numEval) {
        this.numEval = numEval;
    }

    /**
     * 
     * @return
     *     The tipoEval
     */
    @JsonProperty("tipoEval")
    public String getTipoEval() {
        return tipoEval;
    }

    /**
     * 
     * @param tipoEval
     *     The tipoEval
     */
    @JsonProperty("tipoEval")
    public void setTipoEval(String tipoEval) {
        this.tipoEval = tipoEval;
    }

    /**
     * 
     * @return
     *     The anioEval
     */
    @JsonProperty("anioEval")
    public String getAnioEval() {
        return anioEval;
    }

    /**
     * 
     * @param anioEval
     *     The anioEval
     */
    @JsonProperty("anioEval")
    public void setAnioEval(String anioEval) {
        this.anioEval = anioEval;
    }

    /**
     * 
     * @return
     *     The fecIniEval
     */
    @JsonProperty("fecIniEval")
    public String getFecIniEval() {
        return fecIniEval;
    }

    /**
     * 
     * @param fecIniEval
     *     The fecIniEval
     */
    @JsonProperty("fecIniEval")
    public void setFecIniEval(String fecIniEval) {
        this.fecIniEval = fecIniEval;
    }

    /**
     * 
     * @return
     *     The fecFinEval
     */
    @JsonProperty("fecFinEval")
    public String getFecFinEval() {
        return fecFinEval;
    }

    /**
     * 
     * @param fecFinEval
     *     The fecFinEval
     */
    @JsonProperty("fecFinEval")
    public void setFecFinEval(String fecFinEval) {
        this.fecFinEval = fecFinEval;
    }

    /**
     * 
     * @return
     *     The estatus
     */
    @JsonProperty("estatus")
    public String getEstatus() {
        return estatus;
    }

    /**
     * 
     * @param estatus
     *     The estatus
     */
    @JsonProperty("estatus")
    public void setEstatus(String estatus) {
        this.estatus = estatus;
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
