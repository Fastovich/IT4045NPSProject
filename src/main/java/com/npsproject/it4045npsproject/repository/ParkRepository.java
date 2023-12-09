package com.npsproject.it4045npsproject.repository;


import com.npsproject.it4045npsproject.dto.ParkDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ParkRepository extends JpaRepository<ParkDTO, String> {
    // TODO: Define methods to query the database
    // API: https://developer.nps.gov/api/v1/parks?api_key=Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5
    @Query
    ( "SELECT p FROM ParkDTO p WHERE UPPER (p.fullName) LIKE UPPER(:searchTerm)")
    List<ParkDTO> getBySearch(@Param("searchTerm") String searchTerm);
}
