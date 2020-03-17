package me.mtagab.repository;

import me.mtagab.entity.TravelAlertNationalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelNationalAlertRepository extends CrudRepository<TravelAlertNationalEntity, Long> {
}
