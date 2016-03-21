/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cummins.jacksonMotoresOEM;

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
"ID_MOTORES_OEM",
"OEM",
"motor",
"tipoMotor",
"CREATION_DATE",
"CREATED_BY",
"LAST_UPDATE_DATE",
"LAST_UPDATE_BY",
"DELETE_IND",
"check"
})

public class Data {
    @JsonProperty("ID_MOTORES_OEM")
    private int IDMOTORESOEM;
    @JsonProperty("OEM")
    private String OEM;
    @JsonProperty("motor")
    private String motor;
    @JsonProperty("tipoMotor")
    private String tipoMotor;
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
    @JsonProperty("autorizado")
    private String autorizado;
    @JsonProperty("noAutorizado")
    private String noAutorizado;
    @JsonProperty("checkStr")
    private String checkStr;
    @JsonProperty("check")
    private boolean check;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
    * 
    * @return
    * The IDMOTORESOEM
    */
    @JsonProperty("ID_MOTORES_OEM")
    public int getIDMOTORESOEM() {
    return IDMOTORESOEM;
    }

    /**
    * 
    * @param IDMOTORESOEM
    * The ID_MOTORES_OEM
    */
    @JsonProperty("ID_MOTORES_OEM")
    public void setIDMOTORESOEM(int IDMOTORESOEM) {
    this.IDMOTORESOEM = IDMOTORESOEM;
    }

    /**
    * 
    * @return
    * The OEM
    */
    @JsonProperty("OEM")
    public String getOEM() {
    return OEM;
    }

    /**
    * 
    * @param OEM
    * The OEM
    */
    @JsonProperty("OEM")
    public void setOEM(String OEM) {
    this.OEM = OEM;
    }

    /**
    * 
    * @return
    * The motor
    */
    @JsonProperty("motor")
    public String getMotor() {
    return motor;
    }

    /**
    * 
    * @param motor
    * The motor
    */
    @JsonProperty("motor")
    public void setMotor(String motor) {
    this.motor = motor;
    }

    /**
    * 
    * @return
    * The tipoMotor
    */
    @JsonProperty("tipoMotor")
    public String getTipoMotor() {
    return tipoMotor;
    }

    /**
    * 
    * @param tipoMotor
    * The tipoMotor
    */
    @JsonProperty("tipoMotor")
    public void setTipoMotor(String tipoMotor) {
    this.tipoMotor = tipoMotor;
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

	public String getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(String autorizado) {
		this.autorizado = autorizado;
	}

	public String getNoAutorizado() {
		return noAutorizado;
	}

	public void setNoAutorizado(String noAutorizado) {
		this.noAutorizado = noAutorizado;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public void setCheckStr(String checkStr) {
		this.check = Boolean.parseBoolean(checkStr);
		this.checkStr = checkStr;
	}
	
}