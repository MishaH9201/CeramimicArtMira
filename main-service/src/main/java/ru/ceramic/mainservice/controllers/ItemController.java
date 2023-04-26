package ru.ceramic.mainservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ceramic.mainservice.service.ItemService;

@Controller
@RequiredArgsConstructor
public class ItemController {
private final ItemService itemService;

@GetMapping("/items")
   public String getItems(Model model){

    model.addAttribute("items",itemService.getItems());
    return "items";
}
}
