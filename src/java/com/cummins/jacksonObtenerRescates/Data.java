package com.cummins.jacksonObtenerRescates;

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
    "Rescates",
    "Cantidad",
    "PCT_Posibles",
    "PCT_Obtenidos",
    "id"
})
public class Data {

    @JsonProperty("Rescates")
    private String Rescates;
    @JsonProperty("Cantidad")
    private String Cantidad;
    @JsonProperty("PCT_Posibles")
    private String PCTPosibles;
    @JsonProperty("PCT_Obtenidos")
    private String PCTObtenidos;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The Rescates
     */
    @JsonProperty("Rescates")
    public String getRescates() {
        return Rescates;
    }

    /**
     *
     * @param Rescates The Rescates
     */
    @JsonProperty("Rescates")
    public void setRescates(String Rescates) {
        this.Rescates = Rescates;
    }

    /**
     *
     * @return The Cantidad
     */
    @JsonProperty("Cantidad")
    public String getCantidad() {
        return Cantidad;
    }

    /**
     *
     * @param Cantidad The Cantidad
     */
    @JsonProperty("Cantidad")
    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     *
     * @return The PCTPosibles
     */
    @JsonProperty("PCT_Posibles")
    public String getPCTPosibles() {
        return PCTPosibles;
    }

    /**
     *
     * @param PCTPosibles The PCT_Posibles
     */
    @JsonProperty("PCT_Posibles")
    public void setPCTPosibles(String PCTPosibles) {
        this.PCTPosibles = PCTPosibles;
    }

    /**
     *
     * @return The PCTObtenidos
     */
    @JsonProperty("PCT_Obtenidos")
    public String getPCTObtenidos() {
        return PCTObtenidos;
    }

    /**
     *
     * @param PCTObtenidos The PCT_Obtenidos
     */
    @JsonProperty("PCT_Obtenidos")
    public void setPCTObtenidos(String PCTObtenidos) {
        this.PCTObtenidos = PCTObtenidos;
    }

    /**
     *
     * @return The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
