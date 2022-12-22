package com.example.mygatedsociety.service.impl;

import com.example.mygatedsociety.service.Messenger;
import org.springframework.stereotype.Service;

@Service
public class SMS implements Messenger {
    @Override
    public String sendMessage(final String message) {
        //carrier connection
        //Balance check
        //Sender check
        return "I am from SMS";
    }
}
