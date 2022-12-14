package com.insurance.ATD.GoldInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GoldBean")
public class GoldBean {
	@Id
	@Column(name = "PolicyNumber")
	private int policynumber;
	@Column(name="Materials")
	private String Materials;
	@Column(name="Amount")
	private int amount;
	@Column(name="Tenure")
	private int Tenure;
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getMaterials() {
		return Materials;
	}
	public void setMaterials(String materials) {
		Materials = materials;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	

}
