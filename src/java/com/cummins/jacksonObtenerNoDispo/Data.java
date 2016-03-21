package com.cummins.jacksonObtenerNoDispo;

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
    "NDRE_Fecha_Llamada",
    "NDRE_Atendido",
    "NDRE_Cliente",
    "NDRE_Razon",
    "id"
})
public class Data {

    @JsonProperty("NDRE_Fecha_Llamada")
    private String NDREFechaLlamada;
    @JsonProperty("NDRE_Atendido")
    private String NDREAtendido;
    @JsonProperty("NDRE_Cliente")
    private String NDRECliente;
    @JsonProperty("NDRE_Razon")
    private String NDRERazon;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The NDREFechaLlamada
     */
    @JsonProperty("NDRE_Fecha_Llamada")
    public String getNDREFechaLlamada() {
        return NDREFechaLlamada;
    }

    /**
     *
     * @param NDREFechaLlamada The NDRE_Fecha_Llamada
     */
    @JsonProperty("NDRE_Fecha_Llamada")
    public void setNDREFechaLlamada(String NDREFechaLlamada) {
        this.NDREFechaLlamada = NDREFechaLlamada;
    }

    /**
     *
     * @return The NDREAtendido
     */
    @JsonProperty("NDRE_Atendido")
    public String getNDREAtendido() {
        return NDREAtendido;
    }

    /**
     *
     * @param NDREAtendido The NDRE_Atendido
     */
    @JsonProperty("NDRE_Atendido")
    public void setNDREAtendido(String NDREAtendido) {
        this.NDREAtendido = NDREAtendido;
    }

    /**
     *
     * @return The NDRECliente
     */
    @JsonProperty("NDRE_Cliente")
    public String getNDRECliente() {
        return NDRECliente;
    }

    /**
     *
     * @param NDRECliente The NDRE_Cliente
     */
    @JsonProperty("NDRE_Cliente")
    public void setNDRECliente(String NDRECliente) {
        this.NDRECliente = NDRECliente;
    }

    /**
     *
     * @return The NDRERazon
     */
    @JsonProperty("NDRE_Razon")
    public String getNDRERazon() {
        return NDRERazon;
    }

    /**
     *
     * @param NDRERazon The NDRE_Razon
     */
    @JsonProperty("NDRE_Razon")
    public void setNDRERazon(String NDRERazon) {
        this.NDRERazon = NDRERazon;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
