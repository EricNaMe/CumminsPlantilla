package com.cummins.jacksonPartesIndiv;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PartesIndivData {

	@JsonProperty("header")
	private PartesIndivHead header;
	@JsonProperty("data")
	private List<PartesIndivBdy> data = new ArrayList<PartesIndivBdy>();
	
	public PartesIndivHead getHeader() {
		return header;
	}
	public void setHeader(PartesIndivHead header) {
		this.header = header;
	}
	public List<PartesIndivBdy> getData() {
		return data;
	}
	public void setData(List<PartesIndivBdy> data) {
		this.data = data;
	}
	
	
}
