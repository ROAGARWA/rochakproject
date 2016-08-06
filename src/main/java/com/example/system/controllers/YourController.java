package com.example.system.controllers;

import com.example.system.dto.IPSResponse;
import com.example.system.service.YourService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by rajorea on 06/08/16.
 */
@RestController
public class YourController {


    @Resource
    private YourService yourService;

    /**
     * You may choose to create a service that will be called from this contoller.
     * I have created it in this way.
     */
    @RequestMapping("/rest/ipsdata")
    public IPSResponse getIPSData()
    {
        return yourService.getDataFromIPSSystem();
    }

}
