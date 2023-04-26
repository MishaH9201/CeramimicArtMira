package ru.ceramic.mainservice.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ceramic.mainservice.models.Item;
import ru.ceramic.mainservice.repository.ItemRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> getItems(){
        List <Item> items = null;
        items.add(new Item(1L,"vv","vv",99.9,null,null, LocalDateTime.now(),null));
        items.add(new Item(2L,"mm","mm",939.9,null,null, LocalDateTime.now(),null));
        return items;
    }
}

