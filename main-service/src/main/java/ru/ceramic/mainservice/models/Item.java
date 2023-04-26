package ru.ceramic.mainservice.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "items")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE )
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "price")
    Double price;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "item")
    List<Image> images;
    @Column(name = "preview_image_id")
    Long previewImageId;
    @Column(name = "creat")
    LocalDateTime creat;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @PrePersist
private void init(){
    creat=LocalDateTime.now();
}
}
