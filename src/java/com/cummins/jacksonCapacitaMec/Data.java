
package com.cummins.jacksonCapacitaMec;

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
    "IDmotor",
    "motor",
    "qtyMecanicos"
})
public class Data {

    @JsonProperty("IDmotor")
    private String IDmotor;
    @JsonProperty("motor")
    private String motor;
    @JsonProperty("qtyMecanicos")
    private String qtyMecanicos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The IDmotor
     */
    @JsonProperty("IDmotor")
    public String getIDmotor() {
        return IDmotor;
    }

    /**
     * 
     * @param IDmotor
     *     The IDmotor
     */
    @JsonProperty("IDmotor")
    public void setIDmotor(String IDmotor) {
        this.IDmotor = IDmotor;
    }

    /**
     * 
     * @return
     *     The qtyMecanicos
     */
    @JsonProperty("qtyMecanicos")
    public String getQtyMecanicos() {
        return qtyMecanicos;
    }

    /**
     * 
     * @param qtyMecanicos
     *     The qtyMecanicos
     */
    @JsonProperty("qtyMecanicos")
    public void setQtyMecanicos(String qtyMecanicos) {
        this.qtyMecanicos = qtyMecanicos;
    }
    
    /**
     * 
     * @return
     *     The motor
     */
    @JsonProperty("motor")
    public String getMotor() {
        return motor;
    }

    /**
     * 
     * @param motor
     *     The motor
     */
    @JsonProperty("motor")
    public void setMotor(String motor) {
        this.motor = motor;
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
