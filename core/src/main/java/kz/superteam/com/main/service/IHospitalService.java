package kz.superteam.com.main.service;

import kz.superteam.com.main.model.Hospital;

import java.util.List;

public interface IHospitalService {
    public Hospital getHospital(Integer id);
    public Hospital setHospital(Hospital hospital);
    public List<Hospital> getHospitalList();
}
