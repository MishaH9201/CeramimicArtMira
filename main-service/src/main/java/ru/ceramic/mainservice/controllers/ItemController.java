package ru.ceramic.mainservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.ceramic.mainservice.service.ItemService;

@Controller
@RequiredArgsConstructor
public class ItemController {
private final ItemService itemService;


}
