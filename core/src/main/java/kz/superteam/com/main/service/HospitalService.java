package kz.superteam.com.main.service;

import kz.superteam.com.main.model.Hospital;
import kz.superteam.com.main.repository.IHospitalJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalService implements IHospitalService {

    @Autowired
    IHospitalJpaRepo hospitalJpaRepo;

    public Hospital getHospital(Integer id) {
        return hospitalJpaRepo.getOne(id);
    }

    public Hospital setHospital(Hospital hospital) {
        return hospitalJpaRepo.saveAndFlush(hospital);
    }

    public List<Hospital> getHospitalList() {
        return hospitalJpaRepo.findAll();
    }
}
