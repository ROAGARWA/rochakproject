package com.example.ips;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rajorea on 06/08/16.
 */
@RestController
public class IPSController {

    @RequestMapping(value = "/rest/get/datafromips",produces = "application/json", method = RequestMethod.GET)
    public IPSResponse getJsonFromIPSService(){

        IPSResponse response = new IPSResponse();
        response.setIpsId("0000");

        List<MyPayload> myPayloads = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            MyPayload myPayload = new MyPayload();
            myPayload.setPayload("******* this is payload " +i );
            myPayload.setOrderId(String.valueOf(Math.round(Math.random() * 200)));
            myPayloads.add(myPayload);
        }
        response.setPayload(myPayloads);
        response.setStatus("SUCCESS");
        response.setUpdatedDate(new Date());
        return response;
    }








}
