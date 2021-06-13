package com.data.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@SequenceGenerator(name = "accountSequenceGenerator"
        , initialValue = 1
        , allocationSize = 100)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "accountSequenceGenerator")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String nickName;

    @OneToMany(mappedBy = "account")
    private Set<Study> studies = new HashSet<>();


    public void addStudy(Study study) {
        studies.add(study);
    }


}
