package ru.ceramic.mainservice.mappers;

import org.springframework.web.multipart.MultipartFile;
import ru.ceramic.mainservice.models.Image;

import java.io.IOException;

public class ImageMappers {
    public static Image toImage(MultipartFile file) throws IOException {
        return new Image().builder()
                .name(file.getName())
                .originalFileName(file.getOriginalFilename())
                .contentType(file.getContentType())
                .size(file.getSize())
                .bytes(file.getBytes())
                .build();

    }
}
