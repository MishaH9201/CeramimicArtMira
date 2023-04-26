package ru.ceramic.mainservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.ceramic.mainservice.service.ImageService;
import java.io.IOException;

@RestController
@RequestMapping(path = "/image")
@RequiredArgsConstructor
public class ImageController {
private final ImageService service;
@PostMapping("/user/{userId}/event/{eventId}")
    void add(@RequestParam("image") MultipartFile file,
             @PathVariable long userId,
             @PathVariable long eventId) throws IOException {
    service.add(file);
}


}
