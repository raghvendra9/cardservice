package com.express.digital.service;

public class MarketDetails {
	
	String marketcode = "moo";
	String productcode = "poo";
	String subproductcode = "soo";
	long dPAN = (long) (Math.random() * 1000000000000000L);
			
	public String getMarketcode() {
		return marketcode;
	}
	public void setMarketcode(String marketcode) {
		this.marketcode = marketcode;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getSubproductcode() {
		return subproductcode;
	}
	public void setSubproductcode(String subproductcode) {
		this.subproductcode = subproductcode;
	}
	public long getdPAN() {
		return dPAN;
	}
	public void setdPAN(long dPAN) {
		this.dPAN = dPAN;
	}
	
	
	
	
	
	

}
