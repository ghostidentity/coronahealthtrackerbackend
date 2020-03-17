package me.mtagab.repository;

import me.mtagab.entity.PublicAdvisoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicAdvisoryRepository extends CrudRepository<PublicAdvisoryEntity, Long> {
}
