package com.example.cafeinformation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CafeController {

    private CafeService cafeService;

    public CafeController(CafeService cafeService) {
        this.cafeService = cafeService;
    }

    @GetMapping("/cafes")
    public List<Cafe> findByPlaces(@RequestParam String place) {
        List<Cafe> cafes = cafeService.findPlacesEqualWith(place);
        return cafes;
    }

    @GetMapping("/cafes/{id}")
    public Cafe findInformation(@PathVariable("id") int id) {
        return cafeService.findId(id);
    }
}
