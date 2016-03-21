package com.cummins.jacksonObtenerDatosEvalua;

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
    "Datos_Evalua",
    "Respuesta",
    "id"
})
public class Data {

    @JsonProperty("Datos_Evalua")
    private String DatosEvalua;
    @JsonProperty("Respuesta")
    private String Respuesta;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The DatosEvalua
     */
    @JsonProperty("Datos_Evalua")
    public String getDatosEvalua() {
        return DatosEvalua;
    }

    /**
     *
     * @param DatosEvalua The Datos_Evalua
     */
    @JsonProperty("Datos_Evalua")
    public void setDatosEvalua(String DatosEvalua) {
        this.DatosEvalua = DatosEvalua;
    }

    /**
     *
     * @return The Respuesta
     */
    @JsonProperty("Respuesta")
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     *
     * @param Respuesta The Respuesta
     */
    @JsonProperty("Respuesta")
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
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
