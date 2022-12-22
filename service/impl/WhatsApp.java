package com.example.mygatedsociety.service.impl;

import com.example.mygatedsociety.service.Messenger;
import org.springframework.stereotype.Service;

@Service
public class WhatsApp implements Messenger {
    @Override
    public String sendMessage(final String message) {
        //Network check
        //Encryption
        return "I am from Whatsapp";
    }
}
