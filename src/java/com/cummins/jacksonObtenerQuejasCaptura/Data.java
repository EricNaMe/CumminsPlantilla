
package com.cummins.jacksonObtenerQuejasCaptura;

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
    "Folio",
    "F_Creacion",
    "F_Queja",
    "Cliente",
    "C_Cliente",
    "ID_Queja",
    "D_Queja",
    "S_Queja",
    "Reporta",
    "Soporte",
    "R_Seguimiento",
    "C_Responsable",
    "Estatus",
    "F_Cierre",
    "Compromiso"
})
public class Data {

    @JsonProperty("Folio")
    private String Folio;
    @JsonProperty("F_Creacion")
    private String FCreacion;
    @JsonProperty("F_Queja")
    private String FQueja;
    @JsonProperty("Cliente")
    private String Cliente;
    @JsonProperty("C_Cliente")
    private String CCliente;
    @JsonProperty("ID_Queja")
    private String IDQueja;
    @JsonProperty("D_Queja")
    private String DQueja;
    @JsonProperty("S_Queja")
    private String SQueja;
    @JsonProperty("Reporta")
    private String Reporta;
    @JsonProperty("Soporte")
    private String Soporte;
    @JsonProperty("R_Seguimiento")
    private String RSeguimiento;
    @JsonProperty("C_Responsable")
    private String CResponsable;
    @JsonProperty("Estatus")
    private String Estatus;
    @JsonProperty("F_Cierre")
    private String FCierre;
    @JsonProperty("Compromiso")
    private String Compromiso;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Folio
     */
    @JsonProperty("Folio")
    public String getFolio() {
        return Folio;
    }

    /**
     * 
     * @param Folio
     *     The Folio
     */
    @JsonProperty("Folio")
    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    /**
     * 
     * @return
     *     The FCreacion
     */
    @JsonProperty("F_Creacion")
    public String getFCreacion() {
        return FCreacion;
    }

    /**
     * 
     * @param FCreacion
     *     The F_Creacion
     */
    @JsonProperty("F_Creacion")
    public void setFCreacion(String FCreacion) {
        this.FCreacion = FCreacion;
    }

    /**
     * 
     * @return
     *     The FQueja
     */
    @JsonProperty("F_Queja")
    public String getFQueja() {
        return FQueja;
    }

    /**
     * 
     * @param FQueja
     *     The F_Queja
     */
    @JsonProperty("F_Queja")
    public void setFQueja(String FQueja) {
        this.FQueja = FQueja;
    }

    /**
     * 
     * @return
     *     The Cliente
     */
    @JsonProperty("Cliente")
    public String getCliente() {
        return Cliente;
    }

    /**
     * 
     * @param Cliente
     *     The Cliente
     */
    @JsonProperty("Cliente")
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * 
     * @return
     *     The CCliente
     */
    @JsonProperty("C_Cliente")
    public String getCCliente() {
        return CCliente;
    }

    /**
     * 
     * @param CCliente
     *     The C_Cliente
     */
    @JsonProperty("C_Cliente")
    public void setCCliente(String CCliente) {
        this.CCliente = CCliente;
    }

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
     *     The DQueja
     */
    @JsonProperty("D_Queja")
    public String getDQueja() {
        return DQueja;
    }

    /**
     * 
     * @param DQueja
     *     The D_Queja
     */
    @JsonProperty("D_Queja")
    public void setDQueja(String DQueja) {
        this.DQueja = DQueja;
    }

    /**
     * 
     * @return
     *     The SQueja
     */
    @JsonProperty("S_Queja")
    public String getSQueja() {
        return SQueja;
    }

    /**
     * 
     * @param SQueja
     *     The S_Queja
     */
    @JsonProperty("S_Queja")
    public void setSQueja(String SQueja) {
        this.SQueja = SQueja;
    }

    /**
     * 
     * @return
     *     The Reporta
     */
    @JsonProperty("Reporta")
    public String getReporta() {
        return Reporta;
    }

    /**
     * 
     * @param Reporta
     *     The Reporta
     */
    @JsonProperty("Reporta")
    public void setReporta(String Reporta) {
        this.Reporta = Reporta;
    }

    /**
     * 
     * @return
     *     The Soporte
     */
    @JsonProperty("Soporte")
    public String getSoporte() {
        return Soporte;
    }

    /**
     * 
     * @param Soporte
     *     The Soporte
     */
    @JsonProperty("Soporte")
    public void setSoporte(String Soporte) {
        this.Soporte = Soporte;
    }

    /**
     * 
     * @return
     *     The RSeguimiento
     */
    @JsonProperty("R_Seguimiento")
    public String getRSeguimiento() {
        return RSeguimiento;
    }

    /**
     * 
     * @param RSeguimiento
     *     The R_Seguimiento
     */
    @JsonProperty("R_Seguimiento")
    public void setRSeguimiento(String RSeguimiento) {
        this.RSeguimiento = RSeguimiento;
    }

    /**
     * 
     * @return
     *     The CResponsable
     */
    @JsonProperty("C_Responsable")
    public String getCResponsable() {
        return CResponsable;
    }

    /**
     * 
     * @param CResponsable
     *     The C_Responsable
     */
    @JsonProperty("C_Responsable")
    public void setCResponsable(String CResponsable) {
        this.CResponsable = CResponsable;
    }

    /**
     * 
     * @return
     *     The Estatus
     */
    @JsonProperty("Estatus")
    public String getEstatus() {
        return Estatus;
    }

    /**
     * 
     * @param Estatus
     *     The Estatus
     */
    @JsonProperty("Estatus")
    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    /**
     * 
     * @return
     *     The FCierre
     */
    @JsonProperty("F_Cierre")
    public String getFCierre() {
        return FCierre;
    }

    /**
     * 
     * @param FCierre
     *     The F_Cierre
     */
    @JsonProperty("F_Cierre")
    public void setFCierre(String FCierre) {
        this.FCierre = FCierre;
    }

    /**
     * 
     * @return
     *     The Compromiso
     */
    @JsonProperty("Compromiso")
    public String getCompromiso() {
        return Compromiso;
    }

    /**
     * 
     * @param Compromiso
     *     The Compromiso
     */
    @JsonProperty("Compromiso")
    public void setCompromiso(String Compromiso) {
        this.Compromiso = Compromiso;
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
