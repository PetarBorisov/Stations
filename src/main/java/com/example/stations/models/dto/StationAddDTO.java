package com.example.stations.models.dto;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class StationAddDTO {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private String brand;
    @Expose
    private String street;
    @Expose
    private String place;
    @Expose
    private Double lat;
    @Expose
    private Double lng;
    @Expose
    @SerializedName("dist")
    private Double distance;
    @Expose
    @SerializedName("diesel")
    private BigDecimal dieselPrice;
    @Expose
    @SerializedName("e5")
    private BigDecimal e5Price;
    @Expose
    @SerializedName("e10")
    private BigDecimal e10Price;
    @Expose
    private Boolean isOpen;
    @Expose
    private String houseNumber;
    @Expose
    private Integer postCode;

    public StationAddDTO() {
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
