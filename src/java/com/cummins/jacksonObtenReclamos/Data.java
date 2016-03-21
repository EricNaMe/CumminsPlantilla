package com.cummins.jacksonObtenReclamos;

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
    "Reclamos_Tram",
    "Rechazos_Tram",
    "Rechazos_Defi",
    "Tiempo_Repara",
    "id"
})
public class Data {

    @JsonProperty("Reclamos_Tram")
    private String ReclamosTram;
    @JsonProperty("Rechazos_Tram")
    private String RechazosTram;
    @JsonProperty("Rechazos_Defi")
    private String RechazosDefi;
    @JsonProperty("Tiempo_Repara")
    private String TiempoRepara;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The ReclamosTram
     */
    @JsonProperty("Reclamos_Tram")
    public String getReclamosTram() {
        return ReclamosTram;
    }

    /**
     *
     * @param ReclamosTram The Reclamos_Tram
     */
    @JsonProperty("Reclamos_Tram")
    public void setReclamosTram(String ReclamosTram) {
        this.ReclamosTram = ReclamosTram;
    }

    /**
     *
     * @return The RechazosTram
     */
    @JsonProperty("Rechazos_Tram")
    public String getRechazosTram() {
        return RechazosTram;
    }

    /**
     *
     * @param RechazosTram The Rechazos_Tram
     */
    @JsonProperty("Rechazos_Tram")
    public void setRechazosTram(String RechazosTram) {
        this.RechazosTram = RechazosTram;
    }

    /**
     *
     * @return The RechazosDefi
     */
    @JsonProperty("Rechazos_Defi")
    public String getRechazosDefi() {
        return RechazosDefi;
    }

    /**
     *
     * @param RechazosDefi The Rechazos_Defi
     */
    @JsonProperty("Rechazos_Defi")
    public void setRechazosDefi(String RechazosDefi) {
        this.RechazosDefi = RechazosDefi;
    }

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
