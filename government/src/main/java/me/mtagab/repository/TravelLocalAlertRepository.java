package me.mtagab.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelLocalAlertRepository extends CrudRepository<TravelLocalAlertRepository, Long> {
}
