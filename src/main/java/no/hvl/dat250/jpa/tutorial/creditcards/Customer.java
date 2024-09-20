package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "owners")
    private Set<Address> addresses = new HashSet<Address>();

    @OneToMany
    private Set<CreditCard> creditCards = new HashSet<CreditCard>();

    public String getName() {
        return name;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return creditCards;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

    public void addAddress(Address address) {
        addresses.add(address);
    }

	public void setCreditCards(Set<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	public void addCreditCard(CreditCard creditCard) {
        this.creditCards.add(creditCard);
	}

}
