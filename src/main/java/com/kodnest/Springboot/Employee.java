package com.kodnest.Springboot;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
@Column
String name;
@Column
int salary;
@Column
int deptid;
public Employee() {
	super();
}
public Employee(String name, int salary, int deptid) {
	super();
	this.name = name;
	this.salary = salary;
	this.deptid = deptid;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}


}
