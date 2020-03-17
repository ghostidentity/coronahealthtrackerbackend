package me.mtagab.repository;

import me.mtagab.entity.PatientsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<PatientsEntity, Long> {
}
