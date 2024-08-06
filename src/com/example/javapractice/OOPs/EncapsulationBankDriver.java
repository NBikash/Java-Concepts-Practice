package com.example.javapractice.OOPs;

public class EncapsulationBankDriver {
	public static void main(String[] args) {
		EncapsulationBank e=new EncapsulationBank(101,"XYZ Bank","Kormangala","XYZ0514AE",52515251l);
		System.out.println("Bank id-->"+e.getId());
		System.out.println("Bank Name-->"+e.getName());
		System.out.println("Branch Name-->"+e.getBranch());
		System.out.println("Branch IFSC no-->"+e.getIfsc());
		System.out.println("Customet Number-->"+e.getCustometno());
		System.out.println("--------------------------------------");
		e.setBranch("JP Nagar");
		e.setCustometno(13456152l);
		System.out.println("**After Changing Branch name and Customer No details**");
		System.out.println("Bank id-->"+e.getId());
		System.out.println("Bank Name-->"+e.getName());
		System.out.println("Branch Name-->"+e.getBranch());
		System.out.println("Branch IFSC no-->"+e.getIfsc());
		System.out.println("Customet Number-->"+e.getCustometno());
		
		
			
	
	}

}
