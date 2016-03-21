/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.jacksonPerfil;

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
    "no",
    "nombre",
    "status",
    "oem",
    "name",
    "value"
})
/**
 *
 * @author nc784
 */
public class Data {

    @JsonProperty("no")
    private String no;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("status")
    private String status;
    @JsonProperty("oem")
    private String oem;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The no
     */
    @JsonProperty("no")
    public String getNo() {
        return no;
    }

    /**
     *
     * @param no The no
     */
    @JsonProperty("no")
    public void setNo(String no) {
        this.no = no;
    }

    /**
     *
     * @return The nombre
     */
    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre The nombre
     */
    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return The oem
     */
    @JsonProperty("oem")
    public String getOem() {
        return oem;
    }

    /**
     *
     * @param oem The oem
     */
    @JsonProperty("oem")
    public void setOem(String oem) {
        this.oem = oem;
    }
    
    /**
     *
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *
     * @return The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
