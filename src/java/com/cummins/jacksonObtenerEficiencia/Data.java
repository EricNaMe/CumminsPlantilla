package com.cummins.jacksonObtenerEficiencia;

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
    "Tiempo_Repara",
    "Tiempo_Captura",
    "Efic_Reclamo",
    "Efic_Repara",
    "id"
})
public class Data {

    @JsonProperty("Tiempo_Repara")
    private String TiempoRepara;
    @JsonProperty("Tiempo_Captura")
    private String TiempoCaptura;
    @JsonProperty("Efic_Reclamo")
    private String EficReclamo;
    @JsonProperty("Efic_Repara")
    private String EficRepara;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The TiempoRepara
     */
    @JsonProperty("Tiempo_Repara")
    public String getTiempoRepara() {
        return TiempoRepara;
    }

    /**
     *
     * @param TiempoRepara The Tiempo_Repara
     */
    @JsonProperty("Tiempo_Repara")
    public void setTiempoRepara(String TiempoRepara) {
        this.TiempoRepara = TiempoRepara;
    }

    /**
     *
     * @return The TiempoCaptura
     */
    @JsonProperty("Tiempo_Captura")
    public String getTiempoCaptura() {
        return TiempoCaptura;
    }

    /**
     *
     * @param TiempoCaptura The Tiempo_Captura
     */
    @JsonProperty("Tiempo_Captura")
    public void setTiempoCaptura(String TiempoCaptura) {
        this.TiempoCaptura = TiempoCaptura;
    }

    /**
     *
     * @return The EficReclamo
     */
    @JsonProperty("Efic_Reclamo")
    public String getEficReclamo() {
        return EficReclamo;
    }

    /**
     *
     * @param EficReclamo The Efic_Reclamo
     */
    @JsonProperty("Efic_Reclamo")
    public void setEficReclamo(String EficReclamo) {
        this.EficReclamo = EficReclamo;
    }

    /**
     *
     * @return The EficRepara
     */
    @JsonProperty("Efic_Repara")
    public String getEficRepara() {
        return EficRepara;
    }

    /**
     *
     * @param EficRepara The Efic_Repara
     */
    @JsonProperty("Efic_Repara")
    public void setEficRepara(String EficRepara) {
        this.EficRepara = EficRepara;
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
