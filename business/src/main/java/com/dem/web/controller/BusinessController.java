package com.dem.web.controller;

import com.dem.service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("business")
public class BusinessController {

    @Autowired
    private IBusinessService businessService;

    @RequestMapping(value = "/purchase", method = RequestMethod.POST)
    @ResponseBody
    public String purchase(String userId, String commodityCode, int orderCount) {
        businessService.purchase(userId, commodityCode, orderCount);
        return "SUCCESS";
    }
}
