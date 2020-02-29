package com.data.jpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Study {

    @Id
    @GeneratedValue
    long id;

    String name;


    @ManyToOne
    Account account;


}
