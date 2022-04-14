package com.rmagomadov.javapro.repository;

import com.rmagomadov.javapro.model.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, String> {
}
