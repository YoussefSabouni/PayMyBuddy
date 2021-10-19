package com.paymybuddy.paymybuddy.entities;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User donor;

    private String description;
    private Double amount;

    @ManyToOne
    private User beneficiary;

    public Transaction() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public Double getAmount() {

        return amount;
    }

    public void setAmount(Double amount) {

        this.amount = amount;
    }

    public User getDonor() {

        return donor;
    }

    public void setDonor(User donor) {

        this.donor = donor;
    }

    public User getBeneficiary() {

        return beneficiary;
    }

    public void setBeneficiary(User beneficiary) {

        this.beneficiary = beneficiary;
    }
}
