package me.mtagab.repository;

import me.mtagab.entity.VaccineStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineStatusRepository extends CrudRepository<VaccineStatusEntity, Long> {
}
