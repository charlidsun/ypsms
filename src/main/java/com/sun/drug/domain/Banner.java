package com.sun.drug.domain;

public class Banner {

    private int id;
    private String imageName;
    private String imageUrl;
    private String updateTime;
    private int isOpen;


    public Banner() {
    }

    public Banner(int id, String imageName, String imageUrl, String updateTime, int isOpen) {
        this.id = id;
        this.imageName = imageName;
        this.imageUrl = imageUrl;
        this.updateTime = updateTime;
        this.isOpen = isOpen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }
}
