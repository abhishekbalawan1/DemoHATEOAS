package com.example.HATEOASDemo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

@Component
public class Address extends RepresentationModel<Address> {
    String City;
    String Area;
    String houseNumber;
    String street;

    public Address(){}

    public Address(String city, String area, String houseNumber, String street) {
        City = city;
        Area = area;
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public Address(Link initialLink, String city, String area, String houseNumber, String street) {
        super(initialLink);
        City = city;
        Area = area;
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public Address(Iterable<Link> initialLinks, String city, String area, String houseNumber, String street) {
        super(initialLinks);
        City = city;
        Area = area;
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
