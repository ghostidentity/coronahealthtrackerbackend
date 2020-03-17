package me.mtagab.repository;

import me.mtagab.entity.PhotosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends CrudRepository<PhotosEntity, Long> {
}
