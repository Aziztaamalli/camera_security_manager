package com.example.demo.repository;

import com.example.demo.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CameraRepository extends JpaRepository<Camera, Long> {
    List<Camera> findByBrand(String brand);
}
