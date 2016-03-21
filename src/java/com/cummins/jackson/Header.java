
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
    "idMatriz",
    "matriz",
    "oem",
    "revision",
    "anio",
    "para",
    "productoNuevo",
    "tipoProducto",
    "rango",
    "mercado",
    "statusDealer",
    "dr"
})
public class Header {

    @JsonProperty("idMatriz")
    private String idMatriz;
    @JsonProperty("matriz")
    private String matriz;
    @JsonProperty("oem")
    private String oem;
    @JsonProperty("revision")
    private String revision;
    @JsonProperty("anio")
    private String anio;
    @JsonProperty("para")
    private String para;
    @JsonProperty("productoNuevo")
    private String productoNuevo;
    @JsonProperty("tipoProducto")
    private String tipoProducto;
    @JsonProperty("rango")
    private String rango;
    @JsonProperty("mercado")
    private String mercado;
    @JsonProperty("statusDealer")
    private Boolean statusDealer;
    @JsonProperty("dr")
    private String dr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The idMatriz
     */
    @JsonProperty("idMatriz")
    public String getIdMatriz() {
        return idMatriz;
    }

    /**
     * 
     * @param idMatriz
     *     The idMatriz
     */
    @JsonProperty("idMatriz")
    public void setIdMatriz(String idMatriz) {
        this.idMatriz = idMatriz;
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
     *     The para
     */
    @JsonProperty("para")
    public String getPara() {
        return para;
    }

    /**
     * 
     * @param para
     *     The para
     */
    @JsonProperty("para")
    public void setPara(String para) {
        this.para = para;
    }

    /**
     * 
     * @return
     *     The productoNuevo
     */
    @JsonProperty("productoNuevo")
    public String getProductoNuevo() {
        return productoNuevo;
    }

    /**
     * 
     * @param productoNuevo
     *     The productoNuevo
     */
    @JsonProperty("productoNuevo")
    public void setProductoNuevo(String productoNuevo) {
        this.productoNuevo = productoNuevo;
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
     *     The mercado
     */
    @JsonProperty("mercado")
    public String getMercado() {
        return mercado;
    }

    /**
     * 
     * @param mercado
     *     The mercado
     */
    @JsonProperty("mercado")
    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    /**
     * 
     * @return
     *     The statusDealer
     */
    @JsonProperty("statusDealer")
    public Boolean getStatusDealer() {
        return statusDealer;
    }

    /**
     * 
     * @param statusDealer
     *     The statusDealer
     */
    @JsonProperty("statusDealer")
    public void setStatusDealer(Boolean statusDealer) {
        this.statusDealer = statusDealer;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("dr")
	public String getDr() {
		return dr;
	}

    @JsonProperty("dr")
	public void setDr(String dr) {
		this.dr = dr;
	}
    

}
