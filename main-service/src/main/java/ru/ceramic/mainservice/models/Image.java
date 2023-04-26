package ru.ceramic.mainservice.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "originalFileName")
    String originalFileName;
    @Column(name = "contentType")
    String contentType;
    @Column(name = "size")
    Long size;
    @Column(name = "isPreviewImage")
    boolean isPreviewImage;
    @Column(name = "bytes")
    @Lob
    byte[] bytes;


    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    Item item;

}
