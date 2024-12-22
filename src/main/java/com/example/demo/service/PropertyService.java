package com.example.demo.service;

import com.example.demo.entity.Property;
import com.example.demo.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    // public Property getPropertyById(Long id) {
    //     return propertyRepository.findById(id).orElse(null);
    // }

    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }

    public Property getPropertyById(Long id) {
    return propertyRepository.findById(id).orElseThrow(() -> new
    RuntimeException("Property not found"));
    }
}
