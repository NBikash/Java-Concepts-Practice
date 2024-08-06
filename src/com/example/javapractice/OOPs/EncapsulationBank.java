package com.example.javapractice.OOPs;


//                         XYZ BANK

//                      --> ID  (Getter)
//                      -->Name (Getter)
//                      -->Branch (Getter/Setter)
//                      -->IFSC code (Getter)
//                      -->Customerno (Getter/Setter)

public class EncapsulationBank {
	private int id;
	private String name;
	private String branch;
	private String IFSC;
	private long customerno;
	
	EncapsulationBank(int id,String name,String branch,String IFSC,long customerno){
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.IFSC=IFSC;
		this.customerno=customerno;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getIfsc() {
		return IFSC;
	}
	public long getCustometno() {
		return customerno;
	}
	public void setCustometno(long customerno) {
		this.customerno=customerno;
	}
	
}
