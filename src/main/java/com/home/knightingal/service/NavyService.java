package com.home.knightingal.service;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.bean.ShipDetail;

import java.util.List;

/**
 * Created by Knightingal on 2016/4/28.
 */
public interface NavyService {
    List<Ship> queryShips();

    List<ShipDetail> queryShipDetail(Integer shitId);
    
}
