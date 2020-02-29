package com.data.jpa.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;

    private String gu;

    private String dong;

}
