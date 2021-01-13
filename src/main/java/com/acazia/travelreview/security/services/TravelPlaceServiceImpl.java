package com.acazia.travelreview.security.services;

import com.acazia.travelreview.models.TravelPlace;
import com.acazia.travelreview.repository.TravelPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class TravelPlaceServiceImpl implements TravelPlaceService{
    private TravelPlaceRepository travelPlaceRepository;
    @Autowired
    public void setTravelPlaceRepository(TravelPlaceRepository travelPlaceRepository){
        this.travelPlaceRepository = travelPlaceRepository;
    }
    @Override
    @Transactional
    public void createPost(TravelPlace travelPlace) {
        travelPlaceRepository.saveAndFlush(travelPlace);
    }
}
