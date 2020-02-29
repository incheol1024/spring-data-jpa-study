package com.data.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    private String subject;

    @ManyToOne
    private Account account;


}
