package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	
	private int CustId;
	private String CustName;
	private long CustContactNo;
	private String CustAddress;
	private double CustAccountNo;
	
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public long getCustContactNo() {
		return CustContactNo;
	}
	public void setCustContactNo(long custContactNo) {
		CustContactNo = custContactNo;
	}
	public String getCustAddress() {
		return CustAddress;
	}
	public void setCustAddress(String custAddress) {
		CustAddress = custAddress;
	}
	public double getCustAccountNo() {
		return CustAccountNo;
	}
	public void setCustAccountNo(double custAccountNo) {
		CustAccountNo = custAccountNo;
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CustName=" + CustName + ", CustContactNo=" + CustContactNo
				+ ", CustAddress=" + CustAddress + ", CustAccountNo=" + CustAccountNo + "]";
	}

}
