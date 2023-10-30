
  package com.patients.patients;
  
  import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.patients.patients.bean.Patient;
import com.patients.patients.controller.MainController;


@DataJpaTest
 class PatientsApplicationTests {
	 
	  
	  @Mock
	  MainController mainController;
	  
	  Patient patient;
	  
	   
	    
  @Test void contextLoads() { }
  
  @Test 
  public void getPatients() {
	  mainController.addNewUser("Patient1", 30, "Female");
	  Patient p=new Patient("Patient1", 30, "Female");
	  mainController.addNewUser("Patient2", 35, "Female");
	  mainController.addNewUser("Patient3", 31, "Male");
	  mainController.addNewUser("Patient4", 39, "Male");
		
		  Iterable tutorials = mainController.getAllPatients();
		  
		  assertThat(tutorials).hasSize(3).contains(p);
		 
	  
	  
	  
  }
  
  }
 