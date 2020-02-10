package com.tbf;

public class Stocks {
	private String code;
	private String accType;
	private String label;
	private String quartDivi;
	private String baseROR;
	private String beta;
	private String stockSymb;
	private String sharePrice;
	
	
	public Stocks(String code, String accType, String label, String quartDivi, String baseROR, String beta,
			String stockSymb, String sharePrice) {
		super();
		this.code = code;
		this.accType = accType;
		this.label = label;
		this.quartDivi = quartDivi;
		this.baseROR = baseROR;
		this.beta = beta;
		this.stockSymb = stockSymb;
		this.sharePrice = sharePrice;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getQuartDivi() {
		return quartDivi;
	}
	public void setQuartDivi(String quartDivi) {
		this.quartDivi = quartDivi;
	}
	public String getBaseROR() {
		return baseROR;
	}
	public void setBaseROR(String baseROR) {
		this.baseROR = baseROR;
	}
	public String getBeta() {
		return beta;
	}
	public void setBeta(String beta) {
		this.beta = beta;
	}
	public String getStockSymb() {
		return stockSymb;
	}
	public void setStockSymb(String stockSymb) {
		this.stockSymb = stockSymb;
	}
	public String getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(String sharePrice) {
		this.sharePrice = sharePrice;
	}

}
