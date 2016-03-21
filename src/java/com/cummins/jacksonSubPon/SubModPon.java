
package com.cummins.jacksonSubPon;

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
    "moduloSel",
    "subModulo",
    "pondSubMod",
    "pondModulo"
})
public class SubModPon {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idBody")
    private String idBody;
    @JsonProperty("moduloSel")
    private String moduloSel;
    @JsonProperty("subModulo")
    private String subModulo;
    @JsonProperty("pondSubMod")
    private String pondSubMod;
    @JsonProperty("pondModulo")
    private String pondModulo;
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
     *     The moduloSel
     */
    @JsonProperty("moduloSel")
    public String getModuloSel() {
        return moduloSel;
    }

    /**
     * 
     * @param moduloSel
     *     The moduloSel
     */
    @JsonProperty("moduloSel")
    public void setModuloSel(String moduloSel) {
        this.moduloSel = moduloSel;
    }

    /**
     * 
     * @return
     *     The subModulo
     */
    @JsonProperty("subModulo")
    public String getSubModulo() {
        return subModulo;
    }

    /**
     * 
     * @param subModulo
     *     The subModulo
     */
    @JsonProperty("subModulo")
    public void setSubModulo(String subModulo) {
        this.subModulo = subModulo;
    }

    /**
     * 
     * @return
     *     The pondSubMod
     */
    @JsonProperty("pondSubMod")
    public String getPondSubMod() {
        return pondSubMod;
    }

    /**
     * 
     * @param pondSubMod
     *     The pondSubMod
     */
    @JsonProperty("pondSubMod")
    public void setPondSubMod(String pondSubMod) {
        this.pondSubMod = pondSubMod;
    }

    /**
     * 
     * @return
     *     The pondModulo
     */
    @JsonProperty("pondModulo")
    public String getPondModulo() {
        return pondModulo;
    }

    /**
     * 
     * @param pondModulo
     *     The pondModulo
     */
    @JsonProperty("pondModulo")
    public void setPondModulo(String pondModulo) {
        this.pondModulo = pondModulo;
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
