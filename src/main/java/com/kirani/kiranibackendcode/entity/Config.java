package com.kirani.kiranibackendcode.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sl_no;

    private int minimum_order;
    private String delivery_time;
    private String delivery_start;
    private String delivery_end;
    private String offers;
    private String contact_no1;
    private String contact_no2;
    private String email;

    public Config(){}

    public Config(int minimum_order, String delivery_time, String delivery_start, String delivery_end, String offers, String contact_no1, String contact_no2, String email) {
        this.minimum_order = minimum_order;
        this.delivery_time = delivery_time;
        this.delivery_start = delivery_start;
        this.delivery_end = delivery_end;
        this.offers = offers;
        this.contact_no1 = contact_no1;
        this.contact_no2 = contact_no2;
        this.email = email;
    }

    public int getMinimum_order() {
        return minimum_order;
    }

    public void setMinimum_order(int minimum_order) {
        this.minimum_order = minimum_order;
    }

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getDelivery_start() {
        return delivery_start;
    }

    public void setDelivery_start(String delivery_start) {
        this.delivery_start = delivery_start;
    }

    public String getDelivery_end() {
        return delivery_end;
    }

    public void setDelivery_end(String delivery_end) {
        this.delivery_end = delivery_end;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getContact_no1() {
        return contact_no1;
    }

    public void setContact_no1(String contact_no1) {
        this.contact_no1 = contact_no1;
    }

    public String getContact_no2() {
        return contact_no2;
    }

    public void setContact_no2(String contact_no2) {
        this.contact_no2 = contact_no2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
