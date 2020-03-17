package me.mtagab.repository;

import me.mtagab.entity.QuarantineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuarantineRepository extends CrudRepository<QuarantineEntity, Long> {
}
