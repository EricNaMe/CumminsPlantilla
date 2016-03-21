/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cummins.jacksonMotores;

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
"ID_MOTORES",
"Rango",
"Motor",
"CREATION_DATE",
"CREATED_BY",
"LAST_UPDATE_DATE",
"LAST_UPDATE_BY",
"DELETE_IND"
})

public class Data {
    @JsonProperty("ID_MOTORES")
    private int IDMOTORES;
    @JsonProperty("Rango")
    private String Rango;
    @JsonProperty("Motor")
    private String Motor;
    @JsonProperty("CREATION_DATE")
    private String CREATIONDATE;
    @JsonProperty("CREATED_BY")
    private String CREATEDBY;
    @JsonProperty("LAST_UPDATE_DATE")
    private String LASTUPDATEDATE;
    @JsonProperty("LAST_UPDATE_BY")
    private String LASTUPDATEBY;
    @JsonProperty("DELETE_IND")
    private String DELETEIND;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
    * 
    * @return
    * The IDMOTORES
    */
    @JsonProperty("ID_MOTORES")
    public int getIDMOTORES() {
    return IDMOTORES;
    }

    /**
    * 
    * @param IDMOTORES
    * The ID_MOTORES
    */
    @JsonProperty("ID_MOTORES")
    public void setIDMOTORES(int IDMOTORES) {
    this.IDMOTORES = IDMOTORES;
    }

    /**
    * 
    * @return
    * The Rango
    */
    @JsonProperty("Rango")
    public String getRango() {
    return Rango;
    }

    /**
    * 
    * @param Rango
    * The Rango
    */
    @JsonProperty("Rango")
    public void setRango(String Rango) {
    this.Rango = Rango;
    }

    /**
    * 
    * @return
    * The Motor
    */
    @JsonProperty("Motor")
    public String getMotor() {
    return Motor;
    }

    /**
    * 
    * @param Motor
    * The Motor
    */
    @JsonProperty("Motor")
    public void setMotor(String Motor) {
    this.Motor = Motor;
    }

    /**
    * 
    * @return
    * The CREATIONDATE
    */
    @JsonProperty("CREATION_DATE")
    public String getCREATIONDATE() {
    return CREATIONDATE;
    }

    /**
    * 
    * @param CREATIONDATE
    * The CREATION_DATE
    */
    @JsonProperty("CREATION_DATE")
    public void setCREATIONDATE(String CREATIONDATE) {
    this.CREATIONDATE = CREATIONDATE;
    }

    /**
    * 
    * @return
    * The CREATEDBY
    */
    @JsonProperty("CREATED_BY")
    public String getCREATEDBY() {
    return CREATEDBY;
    }

    /**
    * 
    * @param CREATEDBY
    * The CREATED_BY
    */
    @JsonProperty("CREATED_BY")
    public void setCREATEDBY(String CREATEDBY) {
    this.CREATEDBY = CREATEDBY;
    }

    /**
    * 
    * @return
    * The LASTUPDATEDATE
    */
    @JsonProperty("LAST_UPDATE_DATE")
    public String getLASTUPDATEDATE() {
    return LASTUPDATEDATE;
    }

    /**
    * 
    * @param LASTUPDATEDATE
    * The LAST_UPDATE_DATE
    */
    @JsonProperty("LAST_UPDATE_DATE")
    public void setLASTUPDATEDATE(String LASTUPDATEDATE) {
    this.LASTUPDATEDATE = LASTUPDATEDATE;
    }

    /**
    * 
    * @return
    * The LASTUPDATEBY
    */
    @JsonProperty("LAST_UPDATE_BY")
    public String getLASTUPDATEBY() {
    return LASTUPDATEBY;
    }

    /**
    * 
    * @param LASTUPDATEBY
    * The LAST_UPDATE_BY
    */
    @JsonProperty("LAST_UPDATE_BY")
    public void setLASTUPDATEBY(String LASTUPDATEBY) {
    this.LASTUPDATEBY = LASTUPDATEBY;
    }

    /**
    * 
    * @return
    * The DELETEIND
    */
    @JsonProperty("DELETE_IND")
    public String getDELETEIND() {
    return DELETEIND;
    }

    /**
    * 
    * @param DELETEIND
    * The DELETE_IND
    */
    @JsonProperty("DELETE_IND")
    public void setDELETEIND(String DELETEIND) {
    this.DELETEIND = DELETEIND;
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
