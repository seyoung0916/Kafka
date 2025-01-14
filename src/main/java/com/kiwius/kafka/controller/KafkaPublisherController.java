package com.kiwius.kafka.controller;

import com.kiwius.kafka.domain.Ping;
import com.kiwius.kafka.domain.Pong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaPublisherController {

    @Autowired
    PingService pingService;

    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    public Pong testPingAndPong(@RequestBody final Ping ping) throws Exception {
        return pingService.pingAndPong(ping);
    }

}
