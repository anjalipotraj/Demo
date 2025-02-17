package com.aggregation;

public class Address {

	private String laddress;
	
	private String paddress;
	
	private long pincode;

	public Address(String laddress, String paddress, long pincode) {
		super();
		this.laddress = laddress;
		this.paddress = paddress;
		this.pincode = pincode;
	}

	public String getLaddress() {
		return laddress;
	}

	public String getPaddress() {
		return paddress;
	}

	public long getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "Address [laddress=" + laddress + ", paddress=" + paddress + ", pincode=" + pincode + "]";
	}
	
}
