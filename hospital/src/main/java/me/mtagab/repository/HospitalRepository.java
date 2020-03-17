package me.mtagab.repository;

import me.mtagab.entity.HospitalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<HospitalEntity, Long> {
}
