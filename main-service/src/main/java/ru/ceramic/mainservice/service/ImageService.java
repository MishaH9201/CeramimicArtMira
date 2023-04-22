package ru.ceramic.mainservice.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ceramic.mainservice.repository.ImageRepository;

@Service
@RequiredArgsConstructor
@Getter
public class ImageService {
    private final ImageRepository imageRepository;
}
