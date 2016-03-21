/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.jacksonCapacitaJefeTaller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "idMotor",
    "motor",
    "nomJefeTaller",
    "porcPosible",
    "porcObtenido",
    "nomGerenteServicio",
    "idCapaAdmin",
    "nombreAdmin",
    "nombreCurso",
    "fechaCurso",
    "porcLogrado"
})
public class Data {

    @JsonProperty("idMotorCJT")
    private String idMotor;
    @JsonProperty("motor")
    private String motor;
    @JsonProperty("nomJefeTaller")
    private String nomJefeTaller;
    @JsonProperty("porcPosible")
    private String porcPosible;
    @JsonProperty("porcObtenido")
    private String porcObtenido;
    @JsonProperty("nomGerenteServicio")
    private String nomGerenteServicio;
    @JsonProperty("idCapaAdmin")
    private String idCapaAdmin;
    @JsonProperty("nombreAdmin")
    private String nombreAdmin;
    @JsonProperty("nombreCurso")
    private String nombreCurso;
    @JsonProperty("fechaCurso")
    private String fechaCurso;
    @JsonProperty("porcLogrado")
    private String porcLogrado;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idMotor")
    public String getIdMotor() {
        return idMotor;
    }

    @JsonProperty("idMotor")
    public void setIdMotor(String idMotor) {
        this.idMotor = idMotor;
    }
    
    @JsonProperty("motor")
    public String getMotor() {
        return motor;
    }

    @JsonProperty("motor")
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @JsonProperty("nomJefeTaller")
    public String getNomJefeTaller() {
        return nomJefeTaller;
    }

    @JsonProperty("nomJefeTaller")
    public void setNomJefeTaller(String nomJefeTaller) {
        this.nomJefeTaller = nomJefeTaller;
    }

    @JsonProperty("porcPosible")
    public String getPorcPosible() {
        return porcPosible;
    }

    @JsonProperty("porcPosible")
    public void setPorcPosible(String porcPosible) {
        this.porcPosible = porcPosible;
    }

    @JsonProperty("porcObtenido")
    public String getPorcObtenido() {
        return porcObtenido;
    }

    @JsonProperty("porcObtenido")
    public void setPorcObtenido(String porcObtenido) {
        this.porcObtenido = porcObtenido;
    }

    /**
     *
     * @return The idCapaAdmin
     */
    @JsonProperty("idCapaAdmin")
    public String getIdCapaAdmin() {
        return idCapaAdmin;
    }

    /**
     *
     * @param idCapaAdmin The idCapaAdmin
     */
    @JsonProperty("idCapaAdmin")
    public void setIdCapaAdmin(String idCapaAdmin) {
        this.idCapaAdmin = idCapaAdmin;
    }

    /**
     *
     * @return The nombreAdmin
     */
    @JsonProperty("nombreAdmin")
    public String getNombreAdmin() {
        return nombreAdmin;
    }

    /**
     *
     * @param nombreAdmin The nombreAdmin
     */
    @JsonProperty("nombreAdmin")
    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    /**
     *
     * @return The nombreCurso
     */
    @JsonProperty("nombreCurso")
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     *
     * @param nombreCurso The nombreCurso
     */
    @JsonProperty("nombreCurso")
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     *
     * @return The fechaCurso
     */
    @JsonProperty("fechaCurso")
    public String getFechaCurso() {
        return fechaCurso;
    }

    /**
     *
     * @param fechaCurso The fechaCurso
     */
    @JsonProperty("fechaCurso")
    public void setFechaCurso(String fechaCurso) {
        this.fechaCurso = fechaCurso;
    }

    /**
     *
     * @return The porcLogrado
     */
    @JsonProperty("porcLogrado")
    public String getPorcLogrado() {
        return porcLogrado;
    }

    /**
     *
     * @param porcLogrado The porcLogrado
     */
    @JsonProperty("porcLogrado")
    public void setPorcLogrado(String porcLogrado) {
        this.porcLogrado = porcLogrado;
    }

    @JsonProperty("nomGerenteServicio")
    public String getNomGerenteServicio() {
        return nomGerenteServicio;
    }

    @JsonProperty("nomGerenteServicio")
    public void setNomGerenteServicio(String nomGerenteServicio) {
        this.nomGerenteServicio = nomGerenteServicio;
    }

}
