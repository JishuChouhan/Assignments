package com.example.Hotel.Management.Repository;

import com.example.Hotel.Management.Model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRoomRepository extends JpaRepository<HotelRoom, Long> {
    boolean existsByRoomno(Integer roomno);
}
