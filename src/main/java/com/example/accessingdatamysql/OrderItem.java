package com.example.accessingdatamysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class OrderItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	
	@Column
	private String itemName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_order")
	private Bestellung bestellung;
}
