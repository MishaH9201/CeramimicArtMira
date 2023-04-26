package ru.ceramic.mainservice.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @OneToMany
    Set<Item> items;
    @ManyToOne
    User user;
    @Column(name = "time_order")
    LocalDateTime timeOrder;
    @Column(name = "payment")
    boolean payment;

    @PrePersist
    void unit(){
        timeOrder=LocalDateTime.now();
    }
}
