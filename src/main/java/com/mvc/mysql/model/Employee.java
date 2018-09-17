package com.mvc.mysql.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {
	 private long id;
	    private String name;
	    private Set<Education> education;
	    
	    @Column(name="password")
	    private String password;
	    public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Employee(){

	    }

	   

	    public Employee(String name2, long id2, String password2) {
			// TODO Auto-generated constructor stub
	    	this.name = name2;
	        this.id=id2;
	        this.password=password2;
	 
		}

		@Id
	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @OneToMany(mappedBy = "employeeCategory", cascade = CascadeType.ALL,orphanRemoval=true)
	    @JsonManagedReference
	    public Set<Education> geteducation() {
	        return education;
	    }

	    public void seteducation(Set<Education> education) {
	        this.education = education;


	   	    }
}