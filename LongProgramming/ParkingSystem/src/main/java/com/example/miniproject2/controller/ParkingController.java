package com.example.miniproject2.controller;

import com.example.miniproject2.entity.Ticket;
import com.example.miniproject2.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

//    private ParkingService parkingService=new ParkingService();

    @Autowired
    private  ParkingService parkingService;

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return parkingService.createTicket(ticket);
    }
}
