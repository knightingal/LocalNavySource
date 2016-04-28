package com.home.knightingal.dao;

import com.home.knightingal.bean.Ship;

import java.util.List;

/**
 * Created by Knightingal on 2016/4/28.
 */
public interface NavyDao {
    List<Ship> queryShips();
}
