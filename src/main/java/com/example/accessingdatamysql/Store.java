package com.example.accessingdatamysql;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Store {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	
    @Column
    private String storeName;
    
    @ManyToMany
    @JoinTable(name = "store_product",
    			joinColumns = {@JoinColumn(name ="store_fk")},
    			inverseJoinColumns = {@JoinColumn(name ="product_fk")})
    private Set<Product> products = new HashSet<Product>();
    
    

    public void addProduct(Product p) {
    	this.products.add(p);
    	p.getStores().add(this);
    }
    
    public void removeProduct(Product p) {
    	this.products.remove(p);
    	p.getStores().remove(p);
    }
}
