package com.example.miniproject2.service;

import com.example.miniproject2.entity.Ticket;
import com.example.miniproject2.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        Ticket saved = ticketRepository.save(ticket);
        return saved;
    }
}
