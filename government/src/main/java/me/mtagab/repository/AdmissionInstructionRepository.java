package me.mtagab.repository;

import me.mtagab.entity.AdmissionInstructionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionInstructionRepository extends CrudRepository<AdmissionInstructionEntity, Long> {
}
