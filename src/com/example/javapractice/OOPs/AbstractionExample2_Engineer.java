package com.example.javapractice.OOPs;

public class AbstractionExample2_Engineer extends AbstractionExample2_Manager{

	@Override
	public String conductMeeting() {
		return "Overall Month Summary Report";
	}

	@Override
	public void develop() {
		System.out.println("Developing Application");
		
	}
	public static void main(String[] args) {
		AbstractionExample2_Engineer a=new AbstractionExample2_Engineer();
		System.out.println(a.conductMeeting());
		a.develop();
	}
	

}
