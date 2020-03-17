package me.mtagab.repository;

import me.mtagab.entity.CodeAlertEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeAlertRepository extends CrudRepository<CodeAlertEntity, Long> {
}
