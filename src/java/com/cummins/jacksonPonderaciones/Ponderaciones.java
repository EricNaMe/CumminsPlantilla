package com.cummins.jacksonPonderaciones;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Ponderaciones {

	private String created_by;
	private String creation_date;
	private boolean delete_ind;
	private int id_modulo;
	private int id_ponderaciones;
	private String last_update_by;
	private String last_update_date;
	private String modulo;
	private BigDecimal pond_modulo;
	private BigDecimal pond_submod_1;
	private BigDecimal pond_submod_2;
	private BigDecimal pond_submod_3;
	private BigDecimal pond_submod_4;
	private String sub_modulo_1;
	private String sub_modulo_2;
	private String sub_modulo_3;
	private String sub_modulo_4;
	/*
	public Ponderaciones (String created_by, String creation_date, boolean delete_ind, int id_modulo, int id_ponderaciones, 
			String last_update_by, 	String last_update_date, String modulo, int pond_modulo, int pond_submod_1, int pond_submod_2, 
			int pond_submod_3, int pond_submod_4, String sub_modulo_1, String sub_modulo_2, String sub_modulo_3, String sub_modulo_4){
		
		this.setCreated_by(created_by);
		this.setCreation_date(creation_date);
		this.setDelete_ind(delete_ind);
		this.setId_modulo(id_modulo);
		this.setId_ponderaciones(id_ponderaciones);
		this.setLast_update_by(last_update_by);
		this.setLast_update_date(last_update_date);
		this.setModulo(modulo);
		this.setPond_modulo(pond_modulo);
		this.setPond_submod_1(pond_submod_1);
		this.setPond_submod_2(pond_submod_2);
		this.setPond_submod_3(pond_submod_3);
		this.setPond_submod_4(pond_submod_4);
		this.setSub_modulo_1(sub_modulo_1);
		this.setSub_modulo_2(sub_modulo_2);
		this.setSub_modulo_3(sub_modulo_3);
		this.setSub_modulo_4(sub_modulo_4);

	}
	
	*/
	
	public Ponderaciones (int id_ponderaciones,String modulo, BigDecimal pond_modulo,String sub_modulo_1, BigDecimal pond_submod_1){
		this.setId_ponderaciones(id_ponderaciones);
		this.setModulo(modulo);
		this.setPond_modulo(pond_modulo);
		this.setPond_submod_1(pond_submod_1);
		this.setSub_modulo_1(sub_modulo_1);
	}
	
	
	public Ponderaciones(int id_modulo2, String string, int int1,
			String string2, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
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
	public boolean isDelete_ind() {
		return delete_ind;
	}
	public void setDelete_ind(boolean delete_ind) {
		this.delete_ind = delete_ind;
	}
	public int getId_modulo() {
		return id_modulo;
	}
	public void setId_modulo(int id_modulo) {
		this.id_modulo = id_modulo;
	}
	public int getId_ponderaciones() {
		return id_ponderaciones;
	}
	public void setId_ponderaciones(int id_ponderaciones) {
		this.id_ponderaciones = id_ponderaciones;
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
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public BigDecimal getPond_modulo() {
		return pond_modulo;
	}
	public void setPond_modulo(BigDecimal pond_modulo) {
		this.pond_modulo = pond_modulo;
	}
	public BigDecimal getPond_submod_1() {
		return pond_submod_1;
	}
	public void setPond_submod_1(BigDecimal pond_submod_1) {
		this.pond_submod_1 = pond_submod_1;
	}
	public BigDecimal getPond_submod_2() {
		return pond_submod_2;
	}
	public void setPond_submod_2(BigDecimal pond_submod_2) {
		this.pond_submod_2 = pond_submod_2;
	}
	public BigDecimal getPond_submod_3() {
		return pond_submod_3;
	}
	public void setPond_submod_3(BigDecimal pond_submod_3) {
		this.pond_submod_3 = pond_submod_3;
	}
	public BigDecimal getPond_submod_4() {
		return pond_submod_4;
	}
	public void setPond_submod_4(BigDecimal pond_submod_4) {
		this.pond_submod_4 = pond_submod_4;
	}
	public String getSub_modulo_1() {
		return sub_modulo_1;
	}
	public void setSub_modulo_1(String sub_modulo_1) {
		this.sub_modulo_1 = sub_modulo_1;
	}
	public String getSub_modulo_2() {
		return sub_modulo_2;
	}
	public void setSub_modulo_2(String sub_modulo_2) {
		this.sub_modulo_2 = sub_modulo_2;
	}
	public String getSub_modulo_3() {
		return sub_modulo_3;
	}
	public void setSub_modulo_3(String sub_modulo_3) {
		this.sub_modulo_3 = sub_modulo_3;
	}
	public String getSub_modulo_4() {
		return sub_modulo_4;
	}
	public void setSub_modulo_4(String sub_modulo_4) {
		this.sub_modulo_4 = sub_modulo_4;
	}

	
}
