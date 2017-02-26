package com.home.knightingal.controller;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.bean.ShipDetail;
import com.home.knightingal.service.NavyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(value="/navy")
public class NavyController {

    @Autowired
    NavyService navyService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Ship> ships = navyService.queryShips(new Ship());
        model.addAttribute("ships", ships);
        return "index";
    }

    @RequestMapping(value = "/queryShips")
    @ResponseBody
    public List<Ship> queryShips() {
        return navyService.queryShips(new Ship());
    }


    @RequestMapping(value = "/queryShipDetail")
    public String queryShipDetail(@RequestParam(value="shipId", defaultValue="1") Integer shitId, Model model) {
        List<ShipDetail> shipDetailList = navyService.queryShipDetail(shitId);
        Ship condition = new Ship();
        condition.setId(shitId);
        Ship ship = navyService.queryShips(condition).get(0);
        model.addAttribute("shipDetailList", shipDetailList);
        model.addAttribute("ship", ship);
        return "shipDetail";
    }

    @RequestMapping(value = "/queryShipDetailJson")
    @ResponseBody
    public List<ShipDetail> queryShipDetailJson(@RequestParam(value="shipId", defaultValue="1") Integer shitId) {
        return navyService.queryShipDetail(shitId);
    }
}
