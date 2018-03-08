package com.sun.drug.domain;

import java.util.Date;

public class Indications {

    private int id;
    private String drugName;
    private String drugIndication;
    private String drugImg;
    private int indiCount;
    private Date updateTime;

    public Indications() {
    }

    public Indications(int id, String drugName, String drugIndication, String drugImg, int indiCount, Date updateTime) {
        this.id = id;
        this.drugName = drugName;
        this.drugIndication = drugIndication;
        this.drugImg = drugImg;
        this.indiCount = indiCount;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugIndication() {
        return drugIndication;
    }

    public void setDrugIndication(String drugIndication) {
        this.drugIndication = drugIndication;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public int getIndiCount() {
        return indiCount;
    }

    public void setIndiCount(int indiCount) {
        this.indiCount = indiCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
