
package com.cummins.jacksonTeenCare;

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
    "nombreMatriz",
    "idMatriz"
})
public class TeenCare {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nombreMatriz")
    private String nombreMatriz;
    @JsonProperty("idMatriz")
    private Integer idMatriz;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The nombreMatriz
     */
    @JsonProperty("nombreMatriz")
    public String getNombreMatriz() {
        return nombreMatriz;
    }

    /**
     * 
     * @param nombreMatriz
     *     The nombreMatriz
     */
    @JsonProperty("nombreMatriz")
    public void setNombreMatriz(String nombreMatriz) {
        this.nombreMatriz = nombreMatriz;
    }

    /**
     * 
     * @return
     *     The idMatriz
     */
    @JsonProperty("idMatriz")
    public Integer getIdMatriz() {
        return idMatriz;
    }

    /**
     * 
     * @param idMatriz
     *     The idMatriz
     */
    @JsonProperty("idMatriz")
    public void setIdMatriz(Integer idMatriz) {
        this.idMatriz = idMatriz;
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
