package com.home.knightingal.bean;

/**
 * Created by Knightingal on 2016/4/26.
 */
public class Ship {
    private Integer id;

    private String shipName;

    private String dirName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }
}
