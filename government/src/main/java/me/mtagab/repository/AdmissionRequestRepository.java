package me.mtagab.repository;

import me.mtagab.entity.AdmissionRequestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRequestRepository extends CrudRepository<AdmissionRequestEntity, Long> {
}
