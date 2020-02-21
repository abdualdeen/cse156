package com.tbf;
/**
 * 
 * This deals with all the stock entries in the assets file.
 *
 */
public class Stocks {
	private String code;
	private String accType;
	private String label;
	private double quartDivi;
	private double baseROR;
	private double beta;
	private String stockSymb;
	private double sharePrice;
	
	
	public Stocks(String code, String accType, String label, double quartDivi, double baseROR, double beta,
			String stockSymb, double sharePrice) {
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
	
	
	public Stocks() {
		
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
	public double getQuartDivi() {
		return quartDivi;
	}
	public void setQuartDivi(double quartDivi) {
		this.quartDivi = quartDivi;
	}
	public double getBaseROR() {
		return baseROR;
	}
	public void setBaseROR(double baseROR) {
		this.baseROR = baseROR;
	}
	public double getBeta() {
		return beta;
	}
	public void setBeta(double beta) {
		this.beta = beta;
	}
	public String getStockSymb() {
		return stockSymb;
	}
	public void setStockSymb(String stockSymb) {
		this.stockSymb = stockSymb;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

}
