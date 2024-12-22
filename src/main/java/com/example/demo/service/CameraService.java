package com.example.demo.service;

import com.example.demo.entity.Camera;
import com.example.demo.repository.CameraRepository;
import com.example.demo.repository.PropertyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraService {
    @Autowired
    private CameraRepository cameraRepository;

    @Autowired
    private PropertyRepository propertyRepository; // Add this dependency

    public Camera createCamera(Camera camera) {
        return cameraRepository.save(camera);
    }

    public List<Camera> getAllCameras() {
        return cameraRepository.findAll();
    }

    public Camera getCameraById(Long id) {
        return cameraRepository.findById(id).orElse(null);
    }

    // public Camera saveCamera(Camera camera) {
    // return cameraRepository.save(camera);
    // }

    public Camera saveCamera(Camera camera) {
        // Check if the Property is valid
        if (camera.getProperty() != null && camera.getProperty().getId() != null) {
            camera.setProperty(propertyRepository.findById(camera.getProperty().getId())
                    .orElseThrow(() -> new RuntimeException("Property with given ID does not exist")));
        }
        return cameraRepository.save(camera);
    }

    public void deleteCamera(Long id) {
        cameraRepository.deleteById(id);
    }

    public List<Camera> getCamerasByBrand(String brand) {
        return cameraRepository.findByBrand(brand);
    }
}
