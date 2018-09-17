package com.mvc.mysql.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "education")
public class Education {
	 private long id;
	    private String qualification;
	    private Employee employeeCategory;

	    public Education() {

	    }

	    public Education(String qualification) {
	        this.qualification = qualification;
	    }

	    public Education(String qualification, Employee employeeCategory) {
	        this.qualification = qualification;
	        this.employeeCategory = employeeCategory;
	    }

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getqualification() {
	        return qualification;
	    }

	    public void setqualification(String qualification) {
	        this.qualification = qualification;
	    }

	    @ManyToOne
	    @JoinColumn(name = "employee_id")
	    @JsonBackReference
	    public Employee getemployeeCategory() {
	        return employeeCategory;
	    }

	    public void setemployeeCategory(Employee employeeCategory) {
	        this.employeeCategory = employeeCategory;
	    }	
}
