package com.relevel.irctc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {

    @Id
    private long train_id;
}
