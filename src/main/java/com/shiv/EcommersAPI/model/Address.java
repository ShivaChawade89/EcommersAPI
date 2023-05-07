package com.shiv.EcommersAPI.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address_tbl")
@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "state")
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    User user;
}

