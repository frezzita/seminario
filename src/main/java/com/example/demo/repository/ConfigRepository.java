package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Config;
import java.util.List;


public interface ConfigRepository extends JpaRepository<Config, Long> {
    @Query("SELECT c FROM Config c WHERE c.id_building = ?1")
    List<Config> getConfigForBuilding(int id_building);
}
