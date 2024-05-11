package com.example.cafeinformation;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeService {

    public CafeMapper cafeMapper;

    public CafeService(CafeMapper cafeMapper) {
        this.cafeMapper = cafeMapper;
    }

    public List<Cafe> findPlacesEqualWith(String place) {
        return cafeMapper.findByPlaceEqualWith(place);
    }
}
