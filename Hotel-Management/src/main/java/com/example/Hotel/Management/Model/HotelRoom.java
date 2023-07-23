package com.example.Hotel.Management.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HotelRoom {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private Integer roomno;

    @Column
    private Double roomPrice;

    @Column
    private Boolean roomStatus;

    @Column
    @Enumerated(EnumType.STRING)
    private Type roomType;

}
