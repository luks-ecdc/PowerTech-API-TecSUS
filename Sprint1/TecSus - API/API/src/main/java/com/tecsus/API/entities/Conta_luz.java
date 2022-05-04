package com.tecsus.API.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "LUZ")
public class Conta_luz extends Conta {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String coisasdeluz;
}
