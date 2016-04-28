package com.home.knightingal.controller;

import com.home.knightingal.bean.Ship;
import com.home.knightingal.service.NavyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Knightingal on 2016/4/26.
 */

@Controller
@RequestMapping(value="/navy")
public class NavyController {

    @Autowired
    NavyService navyService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/queryShips")
    @ResponseBody
    public List<Ship> queryShips() {
        return navyService.queryShips();
    }
}
