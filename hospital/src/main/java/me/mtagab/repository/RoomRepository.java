package me.mtagab.repository;

import me.mtagab.entity.RoomsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<RoomsEntity, Long> {
}
