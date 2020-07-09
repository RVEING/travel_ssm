package com.rveing.service.impl;

import com.rveing.pojo.Travels;
import com.rveing.pojo.TravelsWithBLOBs;
import com.rveing.service.TravelsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelsServiceImpl implements TravelsService {
    @Override
    public Travels getTravelsVo(int Travels_id) {
        return null;
    }

    @Override
    public List<Travels> getAllTravels() {
        return null;
    }

    @Override
    public void saveTravel(Travels travel) {

    }

    @Override
    public List<Travels> getUserAllTravels(int userid) {
        return null;
    }

    @Override
    public void editTravel(Travels travelsVo) {

    }

    @Override
    public void deleteTravel(int travelid) {

    }
}
