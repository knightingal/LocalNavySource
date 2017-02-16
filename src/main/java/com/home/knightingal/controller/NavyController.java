package com.home.knightingal.controller;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.bean.ShipDetail;
import com.home.knightingal.service.NavyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/navy")
public class NavyController {

    @Autowired
    NavyService navyService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/queryShips")
    public List<Ship> queryShips() {
        return navyService.queryShips();
    }


    @RequestMapping(value = "/queryShipDetail")
    public List<ShipDetail> queryShipDetail(@RequestParam(value="shipId", defaultValue="1") Integer shitId) {
        return navyService.queryShipDetail(shitId);
    }
}
