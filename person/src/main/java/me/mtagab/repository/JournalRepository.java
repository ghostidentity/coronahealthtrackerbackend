package me.mtagab.repository;

import me.mtagab.entity.JournalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends CrudRepository<JournalEntity, Long> {
}
