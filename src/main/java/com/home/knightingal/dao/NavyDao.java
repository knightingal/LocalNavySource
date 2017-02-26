package com.home.knightingal.dao;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.bean.ShipDetail;

import java.util.List;

/**
 * Created by Knightingal on 2016/4/28.
 */
public interface NavyDao {
    List<Ship> queryShips(Ship ship);

    List<ShipDetail> queryShipDetail(ShipDetail condition);
}
