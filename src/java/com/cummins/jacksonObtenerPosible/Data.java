package com.cummins.jacksonObtenerPosible;

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
    "Posible",
    "Logrado",
    "id"
})
public class Data {

    @JsonProperty("Posible")
    private String Posible;
    @JsonProperty("Logrado")
    private String Logrado;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The Posible
     */
    @JsonProperty("Posible")
    public String getPosible() {
        return Posible;
    }

    /**
     *
     * @param Posible The Posible
     */
    @JsonProperty("Posible")
    public void setPosible(String Posible) {
        this.Posible = Posible;
    }

    /**
     *
     * @return The Logrado
     */
    @JsonProperty("Logrado")
    public String getLogrado() {
        return Logrado;
    }

    /**
     *
     * @param Logrado The Logrado
     */
    @JsonProperty("Logrado")
    public void setLogrado(String Logrado) {
        this.Logrado = Logrado;
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
