package ru.ceramic.mainservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ceramic.mainservice.service.ImageService;

@RestController
@RequestMapping(path = "/image")
@RequiredArgsConstructor
public class ImageController {
private final ImageService service;

}
