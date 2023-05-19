package com.example.mspush.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/push")
public class PushController {
    private static final Logger log = LoggerFactory.getLogger(PushController.class);
    @PostMapping("/send")
    public ResponseEntity<String> sendPush() {
        log.info("Push was sent");
        return ResponseEntity.ok("Push sent");
    }

}
