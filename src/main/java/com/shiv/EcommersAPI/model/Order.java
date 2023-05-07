package com.shiv.EcommersAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_tbl")
@Entity
public class Order {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private Integer id;

    @Column(name = "quantity")
    private Integer productQuantity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_userId")
    User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_productId")
    Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_addressId")
    Address address;

}

