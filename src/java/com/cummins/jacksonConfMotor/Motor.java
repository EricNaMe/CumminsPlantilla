
package com.cummins.jacksonConfMotor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "motor",
    "dataMotores",
    "dataHerramientas",
    "dataAdmin",
    "dataJefe",
    "dataGerente",
    "dataMecanico"
})
public class Motor {

    @JsonProperty("motor")
    private String motor;
    @JsonProperty("dataMotores")
    private List<DataMotore> dataMotores = new ArrayList<DataMotore>();
    @JsonProperty("dataHerramientas")
    private List<DataHerramienta> dataHerramientas = new ArrayList<DataHerramienta>();
    @JsonProperty("dataAdmin")
    private List<DataAdmin> dataAdmin = new ArrayList<DataAdmin>();
    @JsonProperty("dataJefe")
    private List<DataJefe> dataJefe = new ArrayList<DataJefe>();
    @JsonProperty("dataGerente")
    private List<DataGerente> dataGerente = new ArrayList<DataGerente>();
    @JsonProperty("dataMecanico")
    private List<DataMecanico> dataMecanico = new ArrayList<DataMecanico>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The dataMotores
     */
    @JsonProperty("dataMotores")
    public List<DataMotore> getDataMotores() {
        return dataMotores;
    }

    /**
     * 
     * @param dataMotores
     *     The dataMotores
     */
    @JsonProperty("dataMotores")
    public void setDataMotores(List<DataMotore> dataMotores) {
        this.dataMotores = dataMotores;
    }

    /**
     * 
     * @return
     *     The dataHerramientas
     */
    @JsonProperty("dataHerramientas")
    public List<DataHerramienta> getDataHerramientas() {
        return dataHerramientas;
    }

    /**
     * 
     * @param dataHerramientas
     *     The dataHerramientas
     */
    @JsonProperty("dataHerramientas")
    public void setDataHerramientas(List<DataHerramienta> dataHerramientas) {
        this.dataHerramientas = dataHerramientas;
    }

    /**
     * 
     * @return
     *     The dataAdmin
     */
    @JsonProperty("dataAdmin")
    public List<DataAdmin> getDataAdmin() {
        return dataAdmin;
    }

    /**
     * 
     * @param dataAdmin
     *     The dataAdmin
     */
    @JsonProperty("dataAdmin")
    public void setDataAdmin(List<DataAdmin> dataAdmin) {
        this.dataAdmin = dataAdmin;
    }

    /**
     * 
     * @return
     *     The dataJefe
     */
    @JsonProperty("dataJefe")
    public List<DataJefe> getDataJefe() {
        return dataJefe;
    }

    /**
     * 
     * @param dataJefe
     *     The dataJefe
     */
    @JsonProperty("dataJefe")
    public void setDataJefe(List<DataJefe> dataJefe) {
        this.dataJefe = dataJefe;
    }

    /**
     * 
     * @return
     *     The dataGerente
     */
    @JsonProperty("dataGerente")
    public List<DataGerente> getDataGerente() {
        return dataGerente;
    }

    /**
     * 
     * @param dataGerente
     *     The dataGerente
     */
    @JsonProperty("dataGerente")
    public void setDataGerente(List<DataGerente> dataGerente) {
        this.dataGerente = dataGerente;
    }

    /**
     * 
     * @return
     *     The dataMecanico
     */
    @JsonProperty("dataMecanico")
    public List<DataMecanico> getDataMecanico() {
        return dataMecanico;
    }

    /**
     * 
     * @param dataMecanico
     *     The dataMecanico
     */
    @JsonProperty("dataMecanico")
    public void setDataMecanico(List<DataMecanico> dataMecanico) {
        this.dataMecanico = dataMecanico;
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
