
package com.cummins.jacksonObtenerQuejasCatalogo;

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
    "ID_Queja",
    "Queja",
    "Ponderacion"
})
public class Data {

    @JsonProperty("ID_Queja")
    private String IDQueja;
    @JsonProperty("Queja")
    private String Queja;
    @JsonProperty("Ponderacion")
    private String Ponderacion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The IDQueja
     */
    @JsonProperty("ID_Queja")
    public String getIDQueja() {
        return IDQueja;
    }

    /**
     * 
     * @param IDQueja
     *     The ID_Queja
     */
    @JsonProperty("ID_Queja")
    public void setIDQueja(String IDQueja) {
        this.IDQueja = IDQueja;
    }

    /**
     * 
     * @return
     *     The Queja
     */
    @JsonProperty("Queja")
    public String getQueja() {
        return Queja;
    }

    /**
     * 
     * @param Queja
     *     The Queja
     */
    @JsonProperty("Queja")
    public void setQueja(String Queja) {
        this.Queja = Queja;
    }

    /**
     * 
     * @return
     *     The Ponderacion
     */
    @JsonProperty("Ponderacion")
    public String getPonderacion() {
        return Ponderacion;
    }

    /**
     * 
     * @param Ponderacion
     *     The Ponderacion
     */
    @JsonProperty("Ponderacion")
    public void setPonderacion(String Ponderacion) {
        this.Ponderacion = Ponderacion;
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
