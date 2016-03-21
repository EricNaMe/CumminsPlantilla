
package com.cummins.jacksonHerramientas;

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
    "producto",
    "revision",
    "anio",
    "statusDealer"
})
public class Herramientas {

    @JsonProperty("producto")
    private String producto;
    @JsonProperty("revision")
    private String revision;
    @JsonProperty("anio")
    private String anio;
    @JsonProperty("statusDealer")
    private String statusDealer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The producto
     */
    @JsonProperty("producto")
    public String getProducto() {
        return producto;
    }

    /**
     * 
     * @param producto
     *     The producto
     */
    @JsonProperty("producto")
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * 
     * @return
     *     The revision
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * 
     * @return
     *     The anio
     */
    @JsonProperty("anio")
    public String getAnio() {
        return anio;
    }

    /**
     * 
     * @param anio
     *     The anio
     */
    @JsonProperty("anio")
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * 
     * @return
     *     The statusDealer
     */
    @JsonProperty("statusDealer")
    public String getStatusDealer() {
        return statusDealer;
    }

    /**
     * 
     * @param statusDealer
     *     The statusDealer
     */
    @JsonProperty("statusDealer")
    public void setStatusDealer(String statusDealer) {
        this.statusDealer = statusDealer;
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
