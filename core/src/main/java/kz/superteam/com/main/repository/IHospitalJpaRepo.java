package kz.superteam.com.main.repository;

import kz.superteam.com.main.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalJpaRepo extends JpaRepository<Hospital,Integer> {

}
