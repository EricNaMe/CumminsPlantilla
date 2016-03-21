
package com.cummins.jacksonParticipMotores;

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
    "idMotor",
    "dr",
    "matriz",
    "rango",
    "parMotorMin",
    "parMotorMax",
    "mecReq"
})
public class ParticipMotores {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idMotor")
    private String idMotor;
    @JsonProperty("dr")
    private String dr;
    @JsonProperty("matriz")
    private String matriz;
    @JsonProperty("rango")
    private String rango;
    @JsonProperty("parMotorMin")
    private String parMotorMin;
    @JsonProperty("parMotorMax")
    private String parMotorMax;
    @JsonProperty("mecReq")
    private String mecReq;
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
     *     The idMotor
     */
    @JsonProperty("idMotor")
    public String getIdMotor() {
        return idMotor;
    }

    /**
     * 
     * @param idMotor
     *     The idMotor
     */
    @JsonProperty("idMotor")
    public void setIdMotor(String idMotor) {
        this.idMotor = idMotor;
    }

    /**
     * 
     * @return
     *     The dr
     */
    @JsonProperty("dr")
    public String getDr() {
        return dr;
    }

    /**
     * 
     * @param dr
     *     The dr
     */
    @JsonProperty("dr")
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     * 
     * @return
     *     The matriz
     */
    @JsonProperty("matriz")
    public String getMatriz() {
        return matriz;
    }

    /**
     * 
     * @param matriz
     *     The matriz
     */
    @JsonProperty("matriz")
    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    /**
     * 
     * @return
     *     The rango
     */
    @JsonProperty("rango")
    public String getRango() {
        return rango;
    }

    /**
     * 
     * @param rango
     *     The rango
     */
    @JsonProperty("rango")
    public void setRango(String rango) {
        this.rango = rango;
    }

    /**
     * 
     * @return
     *     The parMotorMin
     */
    @JsonProperty("parMotorMin")
    public String getParMotorMin() {
        return parMotorMin;
    }

    /**
     * 
     * @param parMotorMin
     *     The parMotorMin
     */
    @JsonProperty("parMotorMin")
    public void setParMotorMin(String parMotorMin) {
        this.parMotorMin = parMotorMin;
    }

    /**
     * 
     * @return
     *     The parMotorMax
     */
    @JsonProperty("parMotorMax")
    public String getParMotorMax() {
        return parMotorMax;
    }

    /**
     * 
     * @param parMotorMax
     *     The parMotorMax
     */
    @JsonProperty("parMotorMax")
    public void setParMotorMax(String parMotorMax) {
        this.parMotorMax = parMotorMax;
    }

    /**
     * 
     * @return
     *     The mecReq
     */
    @JsonProperty("mecReq")
    public String getMecReq() {
        return mecReq;
    }

    /**
     * 
     * @param mecReq
     *     The mecReq
     */
    @JsonProperty("mecReq")
    public void setMecReq(String mecReq) {
        this.mecReq = mecReq;
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
