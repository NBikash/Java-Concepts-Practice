package com.example.javapractice.OOPs;

public class UpcastDowncastDriver {
	public static void main(String[] args) {	
		System.out.println("******UPCASTING*******");
	        UpcastDowncastFather f=new UpcastDowncastSon();
	        System.out.println("Father's Age: "+f.fage);
	        System.out.println("father's Name:"+f.fname);
	        f.fjob();
	        
	        System.out.println("******DOWNCASTING*******");
	        UpcastDowncastSon s=(UpcastDowncastSon)f;
	        System.out.println("Son's age:"+s.sage);
	        System.out.println("Son's Name:"+s.sname);
	        s.sjob();
	        System.out.println("Father's Age: "+s.fage);
	        System.out.println("father's Name:"+s.fname);
	        s.fjob();
	
	}
}
