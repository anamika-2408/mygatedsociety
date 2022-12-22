package com.example.mygatedsociety.controller;

import com.example.mygatedsociety.dto.GuestDto;
import com.example.mygatedsociety.enums.Status;
import com.example.mygatedsociety.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping(path = "/entry")
    public @ResponseBody Status entry(@RequestBody List<GuestDto> guests) {
        return guestService.entry(guests);
    }

}
