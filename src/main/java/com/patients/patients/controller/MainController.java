package com.patients.patients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.patients.patients.bean.Patient;
import com.patients.patients.dao.PatientRepository;

@RestController
public class MainController {
    @Autowired
    private PatientRepository patientRepository;
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello";
    }

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam int age,
            @RequestParam String gender) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Patient n = new Patient();
        n.setName(name);
        n.setAge(age);
        n.setGender(gender);
        
        patientRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/patients") // Map ONLY GET Requests
    public @ResponseBody Iterable<Patient> getAllPatients() {
        // This returns a JSON or XML with the users
    	
    	
        return patientRepository.findAll();
    }
}
