package me.mtagab.repository;

import me.mtagab.entity.WorkersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersRepository extends CrudRepository<WorkersEntity, Long> {
}
