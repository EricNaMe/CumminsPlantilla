package com.cummins.jacksonObtenerGarantias;

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
    "Fecha_Captura",
    "Folio",
    "Tipo_Reclamo",
    "Tipo_Rechazo",
    "tecCalificados",
    "id"
})
public class Data {

    @JsonProperty("Fecha_Captura")
    private String FechaCaptura;
    @JsonProperty("Folio")
    private String Folio;
    @JsonProperty("Tipo_Reclamo")
    private String TipoReclamo;
    @JsonProperty("Tipo_Rechazo")
    private String TipoRechazo;
    @JsonProperty("tecCalificados")
    private String tecCalificados;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The FechaCaptura
     */
    @JsonProperty("Fecha_Captura")
    public String getFechaCaptura() {
        return FechaCaptura;
    }

    /**
     *
     * @param FechaCaptura The Fecha_Captura
     */
    @JsonProperty("Fecha_Captura")
    public void setFechaCaptura(String FechaCaptura) {
        this.FechaCaptura = FechaCaptura;
    }

    /**
     *
     * @return The Folio
     */
    @JsonProperty("Folio")
    public String getFolio() {
        return Folio;
    }

    /**
     *
     * @param Folio The Folio
     */
    @JsonProperty("Folio")
    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    /**
     *
     * @return The TipoReclamo
     */
    @JsonProperty("Tipo_Reclamo")
    public String getTipoReclamo() {
        return TipoReclamo;
    }

    /**
     *
     * @param TipoReclamo The Tipo_Reclamo
     */
    @JsonProperty("Tipo_Reclamo")
    public void setTipoReclamo(String TipoReclamo) {
        this.TipoReclamo = TipoReclamo;
    }

    /**
     *
     * @return The TipoRechazo
     */
    @JsonProperty("Tipo_Rechazo")
    public String getTipoRechazo() {
        return TipoRechazo;
    }

    /**
     *
     * @param TipoRechazo The Tipo_Rechazo
     */
    @JsonProperty("Tipo_Rechazo")
    public void setTipoRechazo(String TipoRechazo) {
        this.TipoRechazo = TipoRechazo;
    }

    /**
     *
     * @return The tecCalificados
     */
    @JsonProperty("tecCalificados")
    public String getTecCalificados() {
        return tecCalificados;
    }

    /**
     *
     * @param tecCalificados The tecCalificados
     */
    @JsonProperty("tecCalificados")
    public void setTecCalificados(String tecCalificados) {
        this.tecCalificados = tecCalificados;
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
