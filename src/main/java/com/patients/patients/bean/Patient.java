package com.patients.patients.bean;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.experimental.SuperBuilder;

@SuperBuilder

@Entity
@Table(name="patient_info")
@Component
public class Patient {
		
		  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer id;

	    private String name;

	    private int age;

	    private String gender;

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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Patient( String name, int age, String gender) {
			
			
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public Patient() {
			
		}
	    

	

}
