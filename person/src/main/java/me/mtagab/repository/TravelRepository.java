package me.mtagab.repository;

import me.mtagab.entity.TravelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends CrudRepository<TravelEntity, Long> {
}
