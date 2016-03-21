/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.jacksonHerramientas;

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
    "idDealer",
    "delear",
    "evalPreEval",
    "seccion",
    "porcMetaEsp",
    "porcMetaElec",
    "porcLicenciaQSOL",
    "porcUsoQSOL",
    "porcTotal",
    "total",
    
    
    "noParte",
    "noParteAnt",
    "descripcion",
    "uso",
    "cantMinima",
    "existencia",
    "ponderacion",
    "hNueva",
    "ubicacion",
    "imagen",
    "idPorcObtenido",
    "porcObtenido",
    "idInsiteIn",
    "pcid",
    "fechaExpira",
    "cliente",
    "bdHtas",
    "validoAudit",
    "comentarios",
    "idInsite",
    "insiteReq",
    "insiteReg",
    "porcObtenidoIns"
})
public class Data {

    @JsonProperty("idDealer")
    private String idDealer;
    @JsonProperty("delear")
    private String delear;
    @JsonProperty("evalPreEval")
    private String evalPreEval;
    @JsonProperty("seccion")
    private String seccion;
    @JsonProperty("porcMetaEsp")
    private String porcMetaEsp;
    @JsonProperty("porcMetaElec")
    private String porcMetaElec;
    @JsonProperty("porcLicenciaQSOL")
    private String porcLicenciaQSOL;
    @JsonProperty("porcUsoQSOL")
    private String porcUsoQSOL;
    @JsonProperty("porcTotal")
    private String porcTotal;
    @JsonProperty("total")
    private String total;

    @JsonProperty("noParte")
    private String noParte;
    @JsonProperty("noParteAnt")
    private String noParteAnt;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("uso")
    private String uso;
    @JsonProperty("cantMinima")
    private String cantMinima;
    @JsonProperty("existencia")
    private String existencia;
    @JsonProperty("ponderacion")
    private String ponderacion;
    @JsonProperty("hNueva")
    private String hNueva;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("imagen")
    private String imagen;

    @JsonProperty("idPorcObtenido")
    private String idPorcObtenido;
    @JsonProperty("porcObtenido")
    private String porcObtenido;

    @JsonProperty("idInsiteIn")
    private String idInsiteIn;
    @JsonProperty("pcid")
    private String pcid;
    @JsonProperty("fechaExpira")
    private String fechaExpira;
    @JsonProperty("cliente")
    private String cliente;
    @JsonProperty("bdHtas")
    private String bdHtas;
    @JsonProperty("validoAudit")
    private String validoAudit;
    @JsonProperty("comentarios")
    private String comentarios;
    @JsonProperty("idInsite")
    private String idInsite;
    @JsonProperty("insiteReq")
    private String insiteReq;
    @JsonProperty("insiteReg")
    private String insiteReg;
    @JsonProperty("porcObtenidoIns")
    private String porcObtenidoIns;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The idDealer
     */
    @JsonProperty("idDealer")
    public String getIdDealer() {
        return idDealer;
    }

    /**
     *
     * @param idDealer The idDealer
     */
    @JsonProperty("idDealer")
    public void setIdDealer(String idDealer) {
        this.idDealer = idDealer;
    }

    /**
     *
     * @return The delear
     */
    @JsonProperty("delear")
    public String getDelear() {
        return delear;
    }

    /**
     *
     * @param delear The delear
     */
    @JsonProperty("delear")
    public void setDelear(String delear) {
        this.delear = delear;
    }

    /**
     *
     * @return The evalPreEval
     */
    @JsonProperty("evalPreEval")
    public String getEvalPreEval() {
        return evalPreEval;
    }

    /**
     *
     * @param evalPreEval The evalPreEval
     */
    @JsonProperty("evalPreEval")
    public void setEvalPreEval(String evalPreEval) {
        this.evalPreEval = evalPreEval;
    }

    /**
     *
     * @return The seccion
     */
    @JsonProperty("seccion")
    public String getSeccion() {
        return seccion;
    }

    /**
     *
     * @param seccion The seccion
     */
    @JsonProperty("seccion")
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /**
     *
     * @return The porcMetaEsp
     */
    @JsonProperty("porcMetaEsp")
    public String getPorcMetaEsp() {
        return porcMetaEsp;
    }

    /**
     *
     * @param porcMetaEsp The porcMetaEsp
     */
    @JsonProperty("porcMetaEsp")
    public void setPorcMetaEsp(String porcMetaEsp) {
        this.porcMetaEsp = porcMetaEsp;
    }

    /**
     *
     * @return The porcMetaElec
     */
    @JsonProperty("porcMetaElec")
    public String getPorcMetaElec() {
        return porcMetaElec;
    }

    /**
     *
     * @param porcMetaElec The porcMetaElec
     */
    @JsonProperty("porcMetaElec")
    public void setPorcMetaElec(String porcMetaElec) {
        this.porcMetaElec = porcMetaElec;
    }

    /**
     *
     * @return The porcLicenciaQSOL
     */
    @JsonProperty("porcLicenciaQSOL")
    public String getPorcLicenciaQSOL() {
        return porcLicenciaQSOL;
    }

    /**
     *
     * @param porcLicenciaQSOL The porcLicenciaQSOL
     */
    @JsonProperty("porcLicenciaQSOL")
    public void setPorcLicenciaQSOL(String porcLicenciaQSOL) {
        this.porcLicenciaQSOL = porcLicenciaQSOL;
    }

    /**
     *
     * @return The porcUsoQSOL
     */
    @JsonProperty("porcUsoQSOL")
    public String getPorcUsoQSOL() {
        return porcUsoQSOL;
    }

    /**
     *
     * @param porcUsoQSOL The porcUsoQSOL
     */
    @JsonProperty("porcUsoQSOL")
    public void setPorcUsoQSOL(String porcUsoQSOL) {
        this.porcUsoQSOL = porcUsoQSOL;
    }

    /**
     *
     * @return The porcTotal
     */
    @JsonProperty("porcTotal")
    public String getPorcTotal() {
        return porcTotal;
    }

    /**
     *
     * @param porcTotal The porcTotal
     */
    @JsonProperty("porcTotal")
    public void setPorcTotal(String porcTotal) {
        this.porcTotal = porcTotal;
    }

    /**
     *
     * @return The total
     */
    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    /**
     *
     * @param total The total
     */
    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     *
     * @return The idInsiteIn
     */
    @JsonProperty("idInsiteIn")
    public String getIdInsiteIn() {
        return idInsiteIn;
    }

    /**
     *
     * @param idInsiteIn The idInsiteIn
     */
    @JsonProperty("idInsiteIn")
    public void setIdInsiteIn(String idInsiteIn) {
        this.idInsiteIn = idInsiteIn;
    }

    /**
     *
     * @return The pcid
     */
    @JsonProperty("pcid")
    public String getPcid() {
        return pcid;
    }

    /**
     *
     * @param pcid The pcid
     */
    @JsonProperty("pcid")
    public void setPcid(String pcid) {
        this.pcid = pcid;
    }

    /**
     *
     * @return The fechaExpira
     */
    @JsonProperty("fechaExpira")
    public String getFechaExpira() {
        return fechaExpira;
    }

    /**
     *
     * @param fechaExpira The fechaExpira
     */
    @JsonProperty("fechaExpira")
    public void setFechaExpira(String fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    /**
     *
     * @return The cliente
     */
    @JsonProperty("cliente")
    public String getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente The cliente
     */
    @JsonProperty("cliente")
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return The bdHtas
     */
    @JsonProperty("bdHtas")
    public String getBdHtas() {
        return bdHtas;
    }

    /**
     *
     * @param bdHtas The bdHtas
     */
    @JsonProperty("bdHtas")
    public void setBdHtas(String bdHtas) {
        this.bdHtas = bdHtas;
    }

    /**
     *
     * @return The validoAudit
     */
    @JsonProperty("validoAudit")
    public String getValidoAudit() {
        return validoAudit;
    }

    /**
     *
     * @param validoAudit The validoAudit
     */
    @JsonProperty("validoAudit")
    public void setValidoAudit(String validoAudit) {
        this.validoAudit = validoAudit;
    }

    /**
     *
     * @return The comentarios
     */
    @JsonProperty("comentarios")
    public String getComentarios() {
        return comentarios;
    }

    /**
     *
     * @param comentarios The comentarios
     */
    @JsonProperty("comentarios")
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     *
     * @return The idInsite
     */
    @JsonProperty("idInsite")
    public String getIdInsite() {
        return idInsite;
    }

    /**
     *
     * @param idInsite The idInsite
     */
    @JsonProperty("idInsite")
    public void setIdInsite(String idInsite) {
        this.idInsite = idInsite;
    }

    /**
     *
     * @return The insiteReq
     */
    @JsonProperty("insiteReq")
    public String getInsiteReq() {
        return insiteReq;
    }

    /**
     *
     * @param insiteReq The insiteReq
     */
    @JsonProperty("insiteReq")
    public void setInsiteReq(String insiteReq) {
        this.insiteReq = insiteReq;
    }

    /**
     *
     * @return The insiteReg
     */
    @JsonProperty("insiteReg")
    public String getInsiteReg() {
        return insiteReg;
    }

    /**
     *
     * @param insiteReg The insiteReg
     */
    @JsonProperty("insiteReg")
    public void setInsiteReg(String insiteReg) {
        this.insiteReg = insiteReg;
    }

    /**
     *
     * @return The porcObtenidoIns
     */
    @JsonProperty("porcObtenidoIns")
    public String getPorcObtenidoIns() {
        return porcObtenidoIns;
    }

    /**
     *
     * @param porcObtenidoIns The porcObtenidoIns
     */
    @JsonProperty("porcObtenidoIns")
    public void setPorcObtenidoIns(String porcObtenidoIns) {
        this.porcObtenidoIns = porcObtenidoIns;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getNoParte() {
        return noParte;
    }

    public void setNoParte(String noParte) {
        this.noParte = noParte;
    }

    public String getNoParteAnt() {
        return noParteAnt;
    }

    public void setNoParteAnt(String noParteAnt) {
        this.noParteAnt = noParteAnt;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(String cantMinima) {
        this.cantMinima = cantMinima;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    public String gethNueva() {
        return hNueva;
    }

    public void sethNueva(String hNueva) {
        this.hNueva = hNueva;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIdPorcObtenido() {
        return idPorcObtenido;
    }

    public void setIdPorcObtenido(String idPorcObtenido) {
        this.idPorcObtenido = idPorcObtenido;
    }

    public String getPorcObtenido() {
        return porcObtenido;
    }

    public void setPorcObtenido(String porcObtenido) {
        this.porcObtenido = porcObtenido;
    }

}
