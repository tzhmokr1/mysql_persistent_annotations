package com.example.accessingdatamysql;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by krist on Dec 20, 2023.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bestellung {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	
    @Column
    private String bestName;
    
    @OneToMany(mappedBy = "bestellung", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<OrderItem>();	
    
    
    
    
    
    public void addItem(OrderItem item) {
    	this.items.add(item);
    	item.setBestellung(this);
    }
}

