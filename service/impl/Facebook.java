package com.example.mygatedsociety.service.impl;

import com.example.mygatedsociety.service.Messenger;
import org.springframework.stereotype.Service;

@Service
public class Facebook implements Messenger {
    @Override
    public String sendMessage(final String message) {
        return "I am from facebook";
    }
}
