package com.example.stations.models.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "stations")
public class Station {


    private UUID id;
    private String name;
    private String brand;
    private String street;
    private String place;
    private Double lat;
    private Double lng;
    private Double distance;
    private BigDecimal dieselPrice;
    private BigDecimal e5Price;
    private BigDecimal e10Price;
    private Boolean isOpen;
    private String houseNumber;
    private Integer postCode;

    public Station() {
    }
    public Station(String name, BigDecimal dieselPrice, BigDecimal e5Price, BigDecimal e10Price) {
        this.name = name;
        this.dieselPrice = dieselPrice;
        this.e5Price = e5Price;
        this.e10Price = e10Price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "brand",nullable = false)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Column(name = "street",nullable = false)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "place",nullable = false)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Column(name = "lat",nullable = false)
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Column(name = "lng",nullable = false)
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Column(name = "dist")
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
    @Column(name = "diesel")
    public BigDecimal getDieselPrice() {
        return dieselPrice;
    }

    public void setDieselPrice(BigDecimal dieselPrice) {
        this.dieselPrice = dieselPrice;
    }

    @Column(name = "e5")
    public BigDecimal getE5Price() {
        return e5Price;
    }

    public void setE5Price(BigDecimal e5Price) {
        this.e5Price = e5Price;
    }

    @Column(name = "e10")
    public BigDecimal getE10Price() {
        return e10Price;
    }

    public void setE10Price(BigDecimal e10Price) {
        this.e10Price = e10Price;
    }

    @Column(name = "isOpen")
    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    @Column(name = "houseNumber", nullable = false)
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Column(name = "postCode",nullable = false)
    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
}
