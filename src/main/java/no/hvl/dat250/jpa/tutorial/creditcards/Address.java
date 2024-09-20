package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;

    @ManyToMany
    private Set<Customer> owners = new HashSet<Customer>();

    public String getStreet() {
        return this.street;
    }

    public Integer getNumber() {
        return number;
    }

    public Set<Customer> getOwners() {
        return owners;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setOwners(Set<Customer> owners) {
		this.owners = owners;
	}

    public void addOwner(Customer owner) {
        owners.add(owner);
    }

}
