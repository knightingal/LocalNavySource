package com.home.knightingal.bean;

/**
 * Created by Knightingal on 2017/2/15.
 */
public class ShipDetail {
    private Integer id;

    private String picName;

    private String picUrl;

    private String picDescription;

    private String picCopyright;

    private Integer shipId;

    private String picType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicDescription() {
        return picDescription;
    }

    public void setPicDescription(String picDescription) {
        this.picDescription = picDescription;
    }

    public String getPicCopyright() {
        return picCopyright;
    }

    public void setPicCopyright(String picCopyright) {
        this.picCopyright = picCopyright;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }
}
