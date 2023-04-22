package ru.ceramic.mainservice.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ceramic.mainservice.repository.ItemRepository;

@Service
@RequiredArgsConstructor
@Getter
public class ItemService {
    private final ItemRepository itemRepository;
}
