package com.example.mygatedsociety.service;

import com.example.mygatedsociety.dto.GuestDto;
import com.example.mygatedsociety.enums.Status;
import com.example.mygatedsociety.model.Guest;

import java.util.List;

public interface GuestService {
    Status entry(List<GuestDto> guests);
}
