package kz.superteam.com.main.controller;

import kz.superteam.com.main.model.Hospital;
import kz.superteam.com.main.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    IHospitalService service;

    @RequestMapping("/list")
    public List<Hospital> getHospitalList(){
        return service.getHospitalList();
    }

    @GetMapping("/{id}")
    public Hospital getHospital(Integer id){
        return service.getHospital(id);
    }

    @PostMapping("/")
    public Hospital setHospital(Hospital hospital){
        return service.setHospital(hospital);
    }

}
