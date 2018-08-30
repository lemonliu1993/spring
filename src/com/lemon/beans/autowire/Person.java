package com.lemon.beans.autowire;
/**
*@author created by liuyumeng
*@date 2018年8月30日 --- 下午10:09:14
*/
public class Person {

	private String name;
	
	private Address address;
	
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
	}
	
	
}


