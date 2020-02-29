package com.data.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "account")
    private Set<Study> studies = new HashSet<>();


}
