package com.example.accessingdatamysql;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	
    @Column
    private String productName;
    
    @ManyToMany(mappedBy = "products")
    private Set<Store> stores = new HashSet<Store>();
}
