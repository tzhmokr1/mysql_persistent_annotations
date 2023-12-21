package com.example.accessingdatamysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by krist on Dec 21, 2023.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "shipping_address")
public class ShippingAddress {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	
    @Column
    private String shippingAddressName;
    
    @OneToOne(mappedBy = "shippingAddress", fetch = FetchType.LAZY)
    private Customer customer;
}
