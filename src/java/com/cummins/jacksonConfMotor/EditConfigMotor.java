package com.cummins.jacksonConfMotor;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EditConfigMotor {
 	
	@JsonProperty("id_header")
    private String id_header;
    @JsonProperty("motor")
    private String motor;
    @JsonProperty("matriz_Infant")
    private String matriz_Infant;
    @JsonProperty("herramientas")
    private String herramientas;
    @JsonProperty("curso_mecanicos")
    private String curso_mecanicos;
    @JsonProperty("curso_Gte_Serv")
    private String curso_Gte_Serv;
    @JsonProperty("curso_Jefe_Taller")
    private String curso_Jefe_Taller;
    @JsonProperty("curso_Admin_Gar")
    private String curso_Admin_Gar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    @JsonProperty("id_header")
    public String getId_header() {
        return id_header;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id_header")
    public void setId_header(String id_header) {
        this.id_header = id_header;
    }

    /**
     * 
     * @return
     *     The idBody
     */
    @JsonProperty("motor")
    public String getMotor() {
        return motor;
    }

    /**
     * 
     * @param idBody
     *     The idBody
     */
    @JsonProperty("motor")
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * 
     * @return
     *     The numEval
     */
    @JsonProperty("matriz_Infant")
    public String getMatriz_Infant() {
        return matriz_Infant;
    }

    /**
     * 
     * @param numEval
     *     The numEval
     */
    @JsonProperty("matriz_Infant")
    public void setMatriz_Infant(String matriz_Infant) {
        this.matriz_Infant = matriz_Infant;
    }

    /**
     * 
     * @return
     *     The tipoEval
     */
    @JsonProperty("herramientas")
    public String getHerramientas() {
        return herramientas;
    }

    /**
     * 
     * @param tipoEval
     *     The tipoEval
     */
    @JsonProperty("tipoEval")
    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    /**
     * 
     * @return
     *     The anioEval
     */
    @JsonProperty("curso_mecanicos")
    public String getCurso_mecanicos() {
        return curso_mecanicos;
    }

    /**
     * 
     * @param anioEval
     *     The anioEval
     */
    @JsonProperty("curso_mecanicos")
    public void setCurso_mecanicos(String curso_mecanicos) {
        this.curso_mecanicos = curso_mecanicos;
    }

    /**
     * 
     * @return
     *     The fecIniEval
     */
    @JsonProperty("curso_Gte_Serv")
    public String getCurso_Gte_Serv() {
        return curso_Gte_Serv;
    }

    /**
     * 
     * @param fecIniEval
     *     The fecIniEval
     */
    @JsonProperty("curso_Gte_Serv")
    public void setCurso_Gte_Serv(String curso_Gte_Serv) {
        this.curso_Gte_Serv = curso_Gte_Serv;
    }

    /**
     * 
     * @return
     *     The fecFinEval
     */
    @JsonProperty("curso_Jefe_Taller")
    public String getCurso_Jefe_Taller() {
        return curso_Jefe_Taller;
    }

    /**
     * 
     * @param fecFinEval
     *     The fecFinEval
     */
    @JsonProperty("curso_Jefe_Taller")
    public void setCurso_Jefe_Taller(String curso_Jefe_Taller) {
        this.curso_Jefe_Taller = curso_Jefe_Taller;
    }

    /**
     * 
     * @return
     *     The estatus
     */
    @JsonProperty("curso_Admin_Gar")
    public String getCurso_Admin_Gar() {
        return curso_Admin_Gar;
    }

    /**
     * 
     * @param estatus
     *     The estatus
     */
    @JsonProperty("curso_Admin_Gar")
    public void setCurso_Admin_Gar(String curso_Admin_Gar) {
        this.curso_Admin_Gar = curso_Admin_Gar;
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
