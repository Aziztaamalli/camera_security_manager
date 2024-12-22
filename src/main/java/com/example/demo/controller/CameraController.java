// package com.example.demo.controller;

// import com.example.demo.entity.Camera;
// import com.example.demo.service.CameraService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import com.example.demo.entity.Property;  // Add this import statement
// import com.example.demo.service.PropertyService;

// import java.util.List;

// @RestController
// @RequestMapping("/api/cameras")
// public class CameraController {
//     @Autowired
//     private CameraService cameraService;

//     @GetMapping
//     public List<Camera> getAllCameras() {
//         return cameraService.getAllCameras();
//     }

//     @GetMapping("/{id}")
//     public Camera getCameraById(@PathVariable Long id) {
//         return cameraService.getCameraById(id);
//     }

// @PostMapping
// public Camera ccreateCamera(@RequestBody Camera camera) {
//     return cameraService.saveCamera(camera);
// }

//     @PutMapping("/{id}")
//     public Camera updateCamera(@PathVariable Long id, @RequestBody Camera camera) {
//         camera.setId(id);
//         return cameraService.saveCamera(camera);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteCamera(@PathVariable Long id) {
//         cameraService.deleteCamera(id);
//     }

//     @GetMapping("/search")
//     public List<Camera> getCamerasByBrand(@RequestParam String brand) {
//         return cameraService.getCamerasByBrand(brand);
//     }

//     @PostMapping
//     public Camera createCamera(@RequestBody Camera camera) {
//         // Find the property by ID to associate the camera with
//         Property property = PropertyService.getPropertyById(camera.getProperty().getId());

//         // Set the property to the camera
//         camera.setProperty(property);

//         // Save the camera (this will also save the relationship)
//         return cameraService.createCamera(camera);
//     }
// }

package com.example.demo.controller;

import com.example.demo.entity.Camera;
//import com.example.demo.entity.Property;
import com.example.demo.service.CameraService;
//import com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cameras")
public class CameraController {

    @Autowired
    private CameraService cameraService;

    // @Autowired
    // private PropertyService propertyService; // Autowire PropertyService

    @GetMapping
    public List<Camera> getAllCameras() {
        return cameraService.getAllCameras();
    }

    @PostMapping
    public Camera createCamera(@RequestBody Camera camera) {
        return cameraService.saveCamera(camera);
    }

    @GetMapping("/{id}")
    public Camera getCameraById(@PathVariable Long id) {
        return cameraService.getCameraById(id);
    }

    @PutMapping("/{id}")
    public Camera updateCamera(@PathVariable Long id, @RequestBody Camera camera) {
        camera.setId(id);
        return cameraService.saveCamera(camera);
    }

    @DeleteMapping("/{id}")
    public void deleteCamera(@PathVariable Long id) {
        cameraService.deleteCamera(id);
    }

    @GetMapping("/search")
    public List<Camera> getCamerasByBrand(@RequestParam String brand) {
        return cameraService.getCamerasByBrand(brand);
    }

    // @PostMapping
    // public Camera createCamera(@RequestBody Camera camera) {
    // // Use the autowired PropertyService instance to fetch the Property
    // Property property =
    // propertyService.getPropertyById(camera.getProperty().getId());

    // // Set the property to the camera
    // camera.setProperty(property);

    // // Save the camera (this will also save the relationship)
    // return cameraService.createCamera(camera);
    // }
}
