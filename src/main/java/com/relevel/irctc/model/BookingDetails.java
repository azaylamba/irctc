package com.relevel.irctc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingDetails {

    @Id
    private long booking_id;
}
