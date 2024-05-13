package com.example.cafeinformation;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeService {

    public CafeMapper cafeMapper;

    public CafeService(CafeMapper cafeMapper) {

        this.cafeMapper = cafeMapper;
    }

    public List<Cafe> findPlacesEqualWith(String place) {

        return cafeMapper.findByPlaceEqualWith(place);
    }

    public Cafe findId(int id) {
        Optional<Cafe> cafe = cafeMapper.findById(id);
        if (cafe.isPresent()) {
            return cafe.get();
        } else {
            throw new InformationNotFoundException("こちらの情報は存在しません。");
        }
    }
}
