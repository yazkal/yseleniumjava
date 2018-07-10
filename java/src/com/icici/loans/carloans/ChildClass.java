package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass C = new ChildClass();
		C.m1();
		C.m2();
		

	}

	@Override
	public void m2(){
		// TODO Auto-generated method stub
		System.out.println("i am m2 overridden here");
		
	}

}
