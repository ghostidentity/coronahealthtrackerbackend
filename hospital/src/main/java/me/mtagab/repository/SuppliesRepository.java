package me.mtagab.repository;

import me.mtagab.entity.SupplieslEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliesRepository extends CrudRepository<SupplieslEntity, Long> {
}
