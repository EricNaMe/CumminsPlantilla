
package com.cummins.jacksonModPon;

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
    "modulo",
    "ponderacion"
})
public class ModuloPon {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idBody")
    private String idBody;
    @JsonProperty("modulo")
    private String modulo;
    @JsonProperty("ponderacion")
    private String ponderacion;
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
     *     The modulo
     */
    @JsonProperty("modulo")
    public String getModulo() {
        return modulo;
    }

    /**
     * 
     * @param modulo
     *     The modulo
     */
    @JsonProperty("modulo")
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * 
     * @return
     *     The ponderacion
     */
    @JsonProperty("ponderacion")
    public String getPonderacion() {
        return ponderacion;
    }

    /**
     * 
     * @param ponderacion
     *     The ponderacion
     */
    @JsonProperty("ponderacion")
    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
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
