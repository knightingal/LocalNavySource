package com.home.knightingal.service.impl;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.bean.ShipDetail;
import com.home.knightingal.dao.NavyDao;
import com.home.knightingal.service.NavyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Knightingal on 2016/4/28.
 */
public class NavyServiceImpl implements NavyService {

    @Autowired
    NavyDao navyDao;

    public List<Ship> queryShips(Ship ship) {
        return navyDao.queryShips(ship);
    }

    public List<ShipDetail> queryShipDetail(Integer shitId) {
        ShipDetail condition = new ShipDetail();
        condition.setShipId(shitId);
        return navyDao.queryShipDetail(condition);
    }
}
