/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.jacksonMatrizHerramientas;

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
    "motorId",
    "matriz",
    "idInfantBdy",
    "producto",
    "noParte",
    "noParteAnt",
    "descripcion",
    "comentariosNP",
    "cantidadMin",
    "existencia",
    "ponderacion",
    "ubicacion",
    "volumenVentas",
    "url"
})
/**
 *
 * @author nc784
 */
public class Data {

    @JsonProperty("motorId")
    private String motorId;
    @JsonProperty("matriz")
    private String matriz;
    @JsonProperty("idInfantBdy")
    private String idInfantBdy;
    @JsonProperty("producto")
    private String producto;
    @JsonProperty("noParte")
    private String noParte;
    @JsonProperty("noParteAnt")
    private String noParteAnt;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("comentariosNP")
    private String comentariosNP;
    @JsonProperty("cantidadMin")
    private String cantidadMin;
    @JsonProperty("existencia")
    private String existencia;
    @JsonProperty("ponderacion")
    private String ponderacion;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("volumenVentas")
    private String volumenVentas;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The motorId
     */
    @JsonProperty("motorId")
    public String getMotorId() {
        return motorId;
    }

    /**
     *
     * @param motorId The motorId
     */
    @JsonProperty("motorId")
    public void setMotorId(String motorId) {
        this.motorId = motorId;
    }

    /**
     *
     * @return The matriz
     */
    @JsonProperty("matriz")
    public String getMatriz() {
        return matriz;
    }

    /**
     *
     * @param matriz The matriz
     */
    @JsonProperty("matriz")
    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    /**
     *
     * @return The idInfantBdy
     */
    @JsonProperty("idInfantBdy")
    public String getIdInfantBdy() {
        return idInfantBdy;
    }

    /**
     *
     * @param idInfantBdy The matriz
     */
    @JsonProperty("idInfantBdy")
    public void setIdInfantBdy(String idInfantBdy) {
        this.idInfantBdy = idInfantBdy;
    }

    /**
     *
     * @return The producto
     */
    @JsonProperty("producto")
    public String getProducto() {
        return producto;
    }

    /**
     *
     * @param producto The producto
     */
    @JsonProperty("producto")
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     *
     * @return The noParte
     */
    @JsonProperty("noParte")
    public String getNoParte() {
        return noParte;
    }

    /**
     *
     * @param noParte The noParte
     */
    @JsonProperty("noParte")
    public void setNoParte(String noParte) {
        this.noParte = noParte;
    }

    /**
     *
     * @return The noParteAnt
     */
    @JsonProperty("noParteAnt")
    public String getNoParteAnt() {
        return noParteAnt;
    }

    /**
     *
     * @param noParteAnt The noParteAnt
     */
    @JsonProperty("noParteAnt")
    public void setNoParteAnt(String noParteAnt) {
        this.noParteAnt = noParteAnt;
    }

    /**
     *
     * @return The descripcion
     */
    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion The descripcion
     */
    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return The comentariosNP
     */
    @JsonProperty("comentariosNP")
    public String getComentariosNP() {
        return comentariosNP;
    }

    /**
     *
     * @param comentariosNP The comentariosNP
     */
    @JsonProperty("comentariosNP")
    public void setComentariosNP(String comentariosNP) {
        this.comentariosNP = comentariosNP;
    }

    /**
     *
     * @return The cantidadMin
     */
    @JsonProperty("cantidadMin")
    public String getCantidadMin() {
        return cantidadMin;
    }

    /**
     *
     * @param cantidadMin The cantidadMin
     */
    @JsonProperty("cantidadMin")
    public void setCantidadMin(String cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    /**
     *
     * @return The existencia
     */
    @JsonProperty("existencia")
    public String getExistencia() {
        return existencia;
    }

    /**
     *
     * @param existencia The existencia
     */
    @JsonProperty("existencia")
    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    /**
     *
     * @return The ponderacion
     */
    @JsonProperty("ponderacion")
    public String getPonderacion() {
        return ponderacion;
    }

    /**
     *
     * @param ponderacion The ponderacion
     */
    @JsonProperty("ponderacion")
    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     *
     * @return The ubicacion
     */
    @JsonProperty("ubicacion")
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     *
     * @param ubicacion The ubicacion
     */
    @JsonProperty("ubicacion")
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     *
     * @return The volumenVentas
     */
    @JsonProperty("volumenVentas")
    public String getVolumenVentas() {
        return volumenVentas;
    }

    /**
     *
     * @param volumenVentas The volumenVentas
     */
    @JsonProperty("volumenVentas")
    public void setVolumenVentas(String volumenVentas) {
        this.volumenVentas = volumenVentas;
    }

    /**
     *
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
