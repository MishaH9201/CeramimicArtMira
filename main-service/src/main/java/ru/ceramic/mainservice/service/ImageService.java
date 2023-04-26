package ru.ceramic.mainservice.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import ru.ceramic.mainservice.mappers.ImageMappers;
import ru.ceramic.mainservice.repository.ImageRepository;

import java.awt.*;
import java.io.IOException;

@Service
@RequiredArgsConstructor
@Getter
public class ImageService {
    private final ImageRepository imageRepository;


    public void add(MultipartFile file) throws IOException {
        if(file != null) {
            imageRepository.save(ImageMappers.toImage(file));
        }else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "File isn`t exist");
        }

    }
    public void add(Image file) throws IOException {



    }
}
