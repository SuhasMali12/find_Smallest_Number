package service;

import dao.Dao;

public class Service {
	
	public void m1() {
		Dao dd=new Dao();
		int a=dd.m1();
		int b=dd.m2();
		if(a<b)
		{
			System.out.println("a is Smallest");
		}
		else {
			System.out.println("b is Smallest");
		}
	}

}
