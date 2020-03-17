package me.mtagab.repository;

import me.mtagab.entity.TravelAlertLocalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelLocalAlertRepository extends CrudRepository<TravelAlertLocalEntity, Long> {
}
