package com.spring.jpademo.model.dto;

/**
 * OrderInfoDto
 *
 * @author clong
 */
public class OrderInfoDto {

    private String name;
    private String address;
    private String accept;

    public OrderInfoDto(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }
}
