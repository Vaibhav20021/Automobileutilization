package com.railworld.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
private Integer id;
private String name;
private Integer mobile;


public Customer() {
	super();
}


public Customer(Integer id, String name, Integer mobile) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Integer getMobile() {
	return mobile;
}


public void setMobile(Integer mobile) {
	this.mobile = mobile;
}

}
