package me.mtagab.repository;

import me.mtagab.entity.CredentialsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends CrudRepository<CredentialsEntity, Long> {
}
