package com.cummins.jacksonEvaluaciones;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect
public class Evaluaciones {

	private String anio_eval;
	private String created_by;
	private String creation_date;
	private String delete_ind;
	private String fec_fin_eval;
	private String fec_ini_eval;
	private int id_evaluacion;
	private String last_update_by;
	private String last_update_date;
	private int num_eval;
	private String tipo_eval;
	private String status;
	

	
	
	/*
	public Evaluaciones(int anio_eval, String created_by, String creation_date, boolean delete_ind, String fec_fin_eval, 
			String fec_ini_eval, int id_evaluacion, String last_update_by, String last_update_date, 
			int num_eval, boolean tipo_eval ){
		
		this.setAnio_eval(anio_eval);
		this.setCreated_by(created_by);
		this.setCreation_date(creation_date);
		this.setDelete_ind(delete_ind);
		this.setFec_fin_eval(fec_fin_eval);
		this.setFec_ini_eval(fec_ini_eval);
		this.setId_evaluacion(id_evaluacion);
		this.setLast_update_by(last_update_by);
		this.setLast_update_date(last_update_date);
		this.setNum_eval(num_eval);
		this.setTipo_eval(tipo_eval);

	}*/
	
	public Evaluaciones(int id_evaluacion, int num_eval, String tipo_eval, String anio_eval , String fec_ini_eval, 
			String fec_fin_eval , String status){
		
		this.setStatus(status);
		this.setId_evaluacion(id_evaluacion);
		this.setNum_eval(num_eval);
		this.setAnio_eval(anio_eval);
		this.setFec_ini_eval(fec_ini_eval);
		this.setFec_fin_eval(fec_fin_eval);
		this.setTipo_eval(tipo_eval);

		//System.out.println("TIPOEVAL = " + tipo_eval);
	}
	
	public String getAnio_eval() {
		return anio_eval;
	}
	public void setAnio_eval(String anio_eval) {
		this.anio_eval = anio_eval;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public void setDelete_ind(String delete_ind) {
		this.delete_ind = delete_ind;
	}
	public String getFec_fin_eval() {
		return fec_fin_eval;
	}
	public void setFec_fin_eval(String fec_fin_eval) {
		this.fec_fin_eval = fec_fin_eval;
	}
	public String getFec_ini_eval() {
		return fec_ini_eval;
	}
	public void setFec_ini_eval(String fec_ini_eval) {
		this.fec_ini_eval = fec_ini_eval;
	}
	public int getId_evaluacion() {
		return id_evaluacion;
	}
	public void setId_evaluacion(int id_evaluacion) {
		this.id_evaluacion = id_evaluacion;
	}
	public String getLast_update_by() {
		return last_update_by;
	}
	public void setLast_update_by(String last_update_by) {
		this.last_update_by = last_update_by;
	}
	public String getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(String last_update_date) {
		this.last_update_date = last_update_date;
	}
	public int getNum_eval() {
		return num_eval;
	}
	public void setNum_eval(int num_eval) {
		this.num_eval = num_eval;
	}

	public String getTipo_eval() {
		return tipo_eval;
	}

	public void setTipo_eval(String tipo_eval) {
		this.tipo_eval = tipo_eval;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDelete_ind() {
		return delete_ind;
	}
	
	
}
