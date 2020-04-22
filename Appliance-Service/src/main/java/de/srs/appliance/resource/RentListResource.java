package de.srs.appliance.resource;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class RentListResource extends ResourceSupport {

	private List<RentResource> rents;
	
	public RentListResource(List<RentResource> rents) {
		this.rents = rents;
	}

	public List<RentResource> getRents() {
		return rents;
	}

	public void setRents(List<RentResource> rents) {
		this.rents = rents;
	}
	
}