package me.mtagab.repository;

import me.mtagab.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends CrudRepository<UsersEntity, Long> {
}
