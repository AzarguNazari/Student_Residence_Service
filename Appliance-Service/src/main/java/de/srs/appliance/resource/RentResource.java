package de.srs.appliance.resource;

import org.springframework.hateoas.ResourceSupport;

import de.srs.appliance.model.Rent;

public class RentResource extends ResourceSupport {

	private Rent rent;
	
	public RentResource(Rent rent) {
		this.rent = rent;
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	
}