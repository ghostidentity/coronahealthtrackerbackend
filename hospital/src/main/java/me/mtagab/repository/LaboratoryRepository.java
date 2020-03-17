package me.mtagab.repository;

import me.mtagab.entity.LaboratoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryRepository extends CrudRepository<LaboratoryEntity, Long> {
}
