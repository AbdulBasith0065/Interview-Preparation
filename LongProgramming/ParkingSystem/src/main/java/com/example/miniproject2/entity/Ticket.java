package com.example.miniproject2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    private String ticketId;
    private String vehicleNo;
    private String vehicleType;

    public Ticket(){}

    public Ticket(String ticketId, String vehicleNo, String vehicleType) {
        this.ticketId = ticketId;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
