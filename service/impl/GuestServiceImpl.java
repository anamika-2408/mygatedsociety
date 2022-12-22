package com.example.mygatedsociety.service.impl;

import com.example.mygatedsociety.dto.GuestDto;
import com.example.mygatedsociety.enums.Status;
import com.example.mygatedsociety.mapper.GuestMapper;
import com.example.mygatedsociety.model.Guest;
import com.example.mygatedsociety.repository.GuestRepository;
import com.example.mygatedsociety.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private GuestMapper guestMapper;


    @Override
    public Status entry(List<GuestDto> guests) {
        List<Guest> guestList = guestMapper.convertListToEntity(guests);
         guestList = guestList.stream()
                 .peek(guest -> guest.setEntryTime(LocalDateTime.now()))
                 .toList();
        final List<Guest> savedGuests = guestRepository.saveAll(guestList);
        if(CollectionUtils.isEmpty(savedGuests)) {
            return Status.REJECTED;
        }
        return Status.APPROVED;
    }
}
