package com.springcore.ci;
//we perform constructor injection

public class Person {
	private String name;
	private int personId;
	private Cert cert;
	
	// constructor
	public Person(String name,int personId, Cert cert)
	{
		this.name = name;
		this.personId=personId;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + " "+this.cert.name+"]";
	}
	
	

}
