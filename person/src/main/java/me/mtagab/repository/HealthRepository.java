package me.mtagab.repository;

import me.mtagab.entity.HealthEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends CrudRepository<HealthEntity, Long> {
}
