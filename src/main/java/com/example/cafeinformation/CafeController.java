package com.example.cafeinformation;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

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

    @ExceptionHandler(InformationNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleInformationNotFoundException(
            InformationNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
