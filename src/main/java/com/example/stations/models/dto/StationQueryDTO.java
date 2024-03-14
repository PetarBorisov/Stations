package com.example.stations.models.dto;


import java.math.BigDecimal;

public class StationQueryDTO {


    private String id;
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

    public StationQueryDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public BigDecimal getDieselPrice() {
        return dieselPrice;
    }

    public void setDieselPrice(BigDecimal dieselPrice) {
        this.dieselPrice = dieselPrice;
    }

    public BigDecimal getE5Price() {
        return e5Price;
    }

    public void setE5Price(BigDecimal e5Price) {
        this.e5Price = e5Price;
    }

    public BigDecimal getE10Price() {
        return e10Price;
    }

    public void setE10Price(BigDecimal e10Price) {
        this.e10Price = e10Price;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
}

