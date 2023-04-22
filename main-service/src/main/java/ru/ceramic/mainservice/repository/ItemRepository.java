package ru.ceramic.mainservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ceramic.mainservice.models.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
