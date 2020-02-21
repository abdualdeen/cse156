package com.tbf;
/**
 * 
 * This deals with the private investment entries in the assets file.
 *
 */
public class PrivateInvest {
	private String code;
	private String accType;
	private String label;
	private double quartDivi;
	private double baseROR;
	private double omega;
	private double totalValue;
	
	public PrivateInvest(String code, String accType, String label, double quartDivi, double baseROR, double omega, double totalValue) {
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
	public double getOmega() {
		return omega;
	}
	public void setOmega(double omega) {
		this.omega = omega;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}

}
