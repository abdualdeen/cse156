package com.tbf;
/**
 * This class deals specifically with all the deposit accounts in the Assets file.
 * 
 *
 */
public class DepositAssets{
	private String code;
	private String accType;
	private String label;
    private double apr;
    
    
	public DepositAssets(String code, String accType, String label, double apr) {
		super();
		this.code = code;
		this.accType = accType;
		this.label = label;
		this.apr = apr;
	}
	
	
	public DepositAssets() {
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
	public double getApr() {
		return apr;
	}
	public void setApr(double apr) {
		this.apr = apr;
	}
}
