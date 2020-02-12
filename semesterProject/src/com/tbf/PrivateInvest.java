package com.tbf;
/**
 * 
 * This deals with the private investment entries in the assets file.
 *
 */
public class PrivateInvest {
	private String code;
	private String accType;
	private String quartDivi;
	private String baseROR;
	private String omega;
	private String totalValue;
	
	public PrivateInvest(String code, String accType, String quartDivi, String baseROR, String omega,
			String totalValue) {
		super();
		this.code = code;
		this.accType = accType;
		this.quartDivi = quartDivi;
		this.baseROR = baseROR;
		this.omega = omega;
		this.totalValue = totalValue;
	}
	
	
	public PrivateInvest() {
		
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
	public String getOmega() {
		return omega;
	}
	public void setOmega(String omega) {
		this.omega = omega;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

}
