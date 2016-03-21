/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.jacksonPartesEval;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author nc784
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "dealer",
    "matrizProd",
    "fechaEval",
    "porcObtenido"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("dealer")
    private String dealer;
    @JsonProperty("matrizProd")
    private String matrizProd;
    @JsonProperty("fechaEval")
    private String fechaEval;
    @JsonProperty("porcObtenido")
    private String porcObtenido;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     *
     * @return The dealer
     */
    @JsonProperty("dealer")
    public String getDealer() {
        return dealer;
    }

    /**
     *
     * @param dealer The dealer
     */
    @JsonProperty("dealer")
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    /**
     *
     * @return The matrizProd
     */
    @JsonProperty("matrizProd")
    public String getMatrizProd() {
        return matrizProd;
    }

    /**
     *
     * @param matrizProd The matrizProd
     */
    @JsonProperty("matrizProd")
    public void setMatrizProd(String matrizProd) {
        this.matrizProd = matrizProd;
    }

    /**
     *
     * @return The fechaEval
     */
    @JsonProperty("fechaEval")
    public String getFechaEval() {
        return fechaEval;
    }

    /**
     *
     * @param fechaEval The fechaEval
     */
    @JsonProperty("fechaEval")
    public void setFechaEval(String fechaEval) {
        this.fechaEval = fechaEval;
    }

    /**
     *
     * @return The porcObtenido
     */
    @JsonProperty("porcObtenido")
    public String getPorcObtenido() {
        return porcObtenido;
    }

    /**
     *
     * @param porcObtenido The porcObtenido
     */
    @JsonProperty("porcObtenido")
    public void setPorcObtenido(String porcObtenido) {
        this.porcObtenido = porcObtenido;
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
