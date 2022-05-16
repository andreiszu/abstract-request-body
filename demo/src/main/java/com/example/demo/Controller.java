package com.example.demo;

import com.example.demo.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
    @PostMapping("/vehicle")
    public ResponseEntity<String> getVehicle(@RequestBody Vehicle vehicle) {
        if(vehicle instanceof Car){
            return ResponseEntity.ok("car");
        }
        else if (vehicle instanceof Airplane){
            return ResponseEntity.ok("airplane");
        }
        return ResponseEntity.badRequest().build();
    }


    @PostMapping("/animal")
    public ResponseEntity<String> getAnimal(@RequestBody Animal animal) {
        if(animal instanceof Dog){
            return ResponseEntity.ok("dog");
        }
        else if (animal instanceof Snake){
            return ResponseEntity.ok("snake");
        }
        return ResponseEntity.badRequest().build();
    }
}
