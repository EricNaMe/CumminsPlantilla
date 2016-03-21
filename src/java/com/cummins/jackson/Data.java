
package com.cummins.jackson;

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
    "dealerDr",
    "anio",
    "revision",
    "tipoMercado",
    "tipoProducto",
    "matriz",
    "oem",
    "noParte",
    "noParteAnterior",
    "descripcion",
    "cantMax",
    "comentarios",
    "url",
    "ponderacion",
    "precioDealer"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idBody")
    private String idBody;
    @JsonProperty("dealerDr")
    private String dealerDr;
    @JsonProperty("anio")
    private String anio;
    @JsonProperty("revision")
    private String revision;
    @JsonProperty("tipoMercado")
    private String tipoMercado;
    @JsonProperty("tipoProducto")
    private String tipoProducto;
    @JsonProperty("matriz")
    private String matriz;
    @JsonProperty("oem")
    private String oem;
    @JsonProperty("noParte")
    private String noParte;
    @JsonProperty("noParteAnterior")
    private String noParteAnterior;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("cantMax")
    private String cantMax;
    @JsonProperty("comentarios")
    private String comentarios;
    @JsonProperty("url")
    private String url;
    @JsonProperty("ponderacion")
    private String ponderacion;
    @JsonProperty("precioDealer")
    private String precioDealer;
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
     *     The dealerDr
     */
    @JsonProperty("dealerDr")
    public String getDealerDr() {
        return dealerDr;
    }

    /**
     * 
     * @param dealerDr
     *     The dealerDr
     */
    @JsonProperty("dealerDr")
    public void setDealerDr(String dealerDr) {
        this.dealerDr = dealerDr;
    }

    /**
     * 
     * @return
     *     The anio
     */
    @JsonProperty("anio")
    public String getAnio() {
        return anio;
    }

    /**
     * 
     * @param anio
     *     The anio
     */
    @JsonProperty("anio")
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * 
     * @return
     *     The revision
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * 
     * @return
     *     The tipoMercado
     */
    @JsonProperty("tipoMercado")
    public String getTipoMercado() {
        return tipoMercado;
    }

    /**
     * 
     * @param tipoMercado
     *     The tipoMercado
     */
    @JsonProperty("tipoMercado")
    public void setTipoMercado(String tipoMercado) {
        this.tipoMercado = tipoMercado;
    }

    /**
     * 
     * @return
     *     The tipoProducto
     */
    @JsonProperty("tipoProducto")
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * 
     * @param tipoProducto
     *     The tipoProducto
     */
    @JsonProperty("tipoProducto")
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
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
     *     The oem
     */
    @JsonProperty("oem")
    public String getOem() {
        return oem;
    }

    /**
     * 
     * @param oem
     *     The oem
     */
    @JsonProperty("oem")
    public void setOem(String oem) {
        this.oem = oem;
    }

    /**
     * 
     * @return
     *     The noParte
     */
    @JsonProperty("noParte")
    public String getNoParte() {
        return noParte;
    }

    /**
     * 
     * @param noParte
     *     The noParte
     */
    @JsonProperty("noParte")
    public void setNoParte(String noParte) {
        this.noParte = noParte;
    }

    /**
     * 
     * @return
     *     The noParteAnterior
     */
    @JsonProperty("noParteAnterior")
    public String getNoParteAnterior() {
        return noParteAnterior;
    }

    /**
     * 
     * @param noParteAnterior
     *     The noParteAnterior
     */
    @JsonProperty("noParteAnterior")
    public void setNoParteAnterior(String noParteAnterior) {
        this.noParteAnterior = noParteAnterior;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return
     *     The cantMax
     */
    @JsonProperty("cantMax")
    public String getCantMax() {
        return cantMax;
    }

    /**
     * 
     * @param cantMax
     *     The cantMax
     */
    @JsonProperty("cantMax")
    public void setCantMax(String cantMax) {
        this.cantMax = cantMax;
    }

    /**
     * 
     * @return
     *     The comentarios
     */
    @JsonProperty("comentarios")
    public String getComentarios() {
        return comentarios;
    }

    /**
     * 
     * @param comentarios
     *     The comentarios
     */
    @JsonProperty("comentarios")
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The ponderacion
     */
    @JsonProperty("ponderacion")
    public String getPonderacion() {
        return ponderacion;
    }

    /**
     * 
     * @param ponderacion
     *     The ponderacion
     */
    @JsonProperty("ponderacion")
    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     * 
     * @return
     *     The precioDealer
     */
    @JsonProperty("precioDealer")
    public String getPrecioDealer() {
        return precioDealer;
    }

    /**
     * 
     * @param precioDealer
     *     The precioDealer
     */
    @JsonProperty("precioDealer")
    public void setPrecioDealer(String precioDealer) {
        this.precioDealer = precioDealer;
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
