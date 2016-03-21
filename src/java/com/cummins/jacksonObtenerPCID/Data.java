package com.cummins.jacksonObtenerPCID;

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
    "PCID",
    "Fecha_Expiracion",
    "Cliente",
    "EnBDHetas",
    "Valido_Auditorias",
    "Comentarios",
    "id"
})
public class Data {

    @JsonProperty("PCID")
    private String PCID;
    @JsonProperty("Fecha_Expiracion")
    private String FechaExpiracion;
    @JsonProperty("Cliente")
    private String Cliente;
    @JsonProperty("EnBDHetas")
    private String EnBDHetas;
    @JsonProperty("Valido_Auditorias")
    private String ValidoAuditorias;
    @JsonProperty("Comentarios")
    private String Comentarios;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The PCID
     */
    @JsonProperty("PCID")
    public String getPCID() {
        return PCID;
    }

    /**
     *
     * @param PCID The PCID
     */
    @JsonProperty("PCID")
    public void setPCID(String PCID) {
        this.PCID = PCID;
    }

    /**
     *
     * @return The FechaExpiracion
     */
    @JsonProperty("Fecha_Expiracion")
    public String getFechaExpiracion() {
        return FechaExpiracion;
    }

    /**
     *
     * @param FechaExpiracion The Fecha_Expiracion
     */
    @JsonProperty("Fecha_Expiracion")
    public void setFechaExpiracion(String FechaExpiracion) {
        this.FechaExpiracion = FechaExpiracion;
    }

    /**
     *
     * @return The Cliente
     */
    @JsonProperty("Cliente")
    public String getCliente() {
        return Cliente;
    }

    /**
     *
     * @param Cliente The Cliente
     */
    @JsonProperty("Cliente")
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     *
     * @return The EnBDHetas
     */
    @JsonProperty("EnBDHetas")
    public String getEnBDHetas() {
        return EnBDHetas;
    }

    /**
     *
     * @param EnBDHetas The EnBDHetas
     */
    @JsonProperty("EnBDHetas")
    public void setEnBDHetas(String EnBDHetas) {
        this.EnBDHetas = EnBDHetas;
    }

    /**
     *
     * @return The ValidoAuditorias
     */
    @JsonProperty("Valido_Auditorias")
    public String getValidoAuditorias() {
        return ValidoAuditorias;
    }

    /**
     *
     * @param ValidoAuditorias The Valido_Auditorias
     */
    @JsonProperty("Valido_Auditorias")
    public void setValidoAuditorias(String ValidoAuditorias) {
        this.ValidoAuditorias = ValidoAuditorias;
    }

    /**
     *
     * @return The Comentarios
     */
    @JsonProperty("Comentarios")
    public String getComentarios() {
        return Comentarios;
    }

    /**
     *
     * @param Comentarios The Comentarios
     */
    @JsonProperty("Comentarios")
    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
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
