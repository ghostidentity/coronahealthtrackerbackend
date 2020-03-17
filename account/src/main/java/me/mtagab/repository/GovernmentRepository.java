package me.mtagab.repository;

import me.mtagab.entity.GovernmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GovernmentRepository extends CrudRepository<GovernmentEntity, Long> {
}
