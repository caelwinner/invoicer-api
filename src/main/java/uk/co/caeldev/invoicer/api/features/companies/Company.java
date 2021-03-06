package uk.co.caeldev.invoicer.api.features.companies;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.mongodb.morphia.annotations.Entity;
import uk.co.caeldev.invoicer.api.features.common.domain.Bank;
import uk.co.caeldev.invoicer.api.features.common.domain.BaseEntity;

import java.util.UUID;

@Entity("companies")
public class Company extends BaseEntity {

    private String username;
    private String name;
    private String address;
    private String postCode;
    private Bank bank;
    private String vatNumber;

    public Company() {
    }


    public Company(final UUID guid,
                   final String username,
                   final String name,
                   final String address,
                   final String postCode,
                   final Bank bank,
                   final String vatNumber) {
        this.guid = guid;
        this.username = username;
        this.name = name;
        this.address = address;
        this.postCode = postCode;
        this.bank = bank;
        this.vatNumber = vatNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public Bank getBank() {
        return bank;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
