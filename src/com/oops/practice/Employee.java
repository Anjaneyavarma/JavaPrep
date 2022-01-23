package com.oops.practice;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	

	private int id;
	private String name;
	private int price;
	
	
	
	public Employee(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getPrice() > o.getPrice()) {
			return -1;
		}
		else if(this.getPrice()<o.getPrice()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	

}
