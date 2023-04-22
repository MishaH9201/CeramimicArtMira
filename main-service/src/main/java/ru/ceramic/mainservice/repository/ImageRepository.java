package ru.ceramic.mainservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ceramic.mainservice.models.Image;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
