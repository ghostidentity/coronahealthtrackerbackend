package me.mtagab.repository;

import me.mtagab.entity.MonitoringEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitoringRepository extends CrudRepository<MonitoringEntity, Long> {
}
