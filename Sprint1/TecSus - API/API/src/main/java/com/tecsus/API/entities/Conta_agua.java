package com.tecsus.API.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "AGUA")
public class Conta_agua extends Conta{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String coisasdeagua;

}
