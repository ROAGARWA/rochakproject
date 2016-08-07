package com.example.ips;

import com.example.system.dto.IPSResponse;
import com.example.system.service.YourService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rajorea on 06/08/16.
 * This is what you need to expose to the IPS system
 */
@RestController
public class IPSController {

    @Resource
    private YourService yourService;

    @RequestMapping(value = "/rest/get/datafromips",produces = "application/json", method = RequestMethod.GET)
    public String getJsonFromIPSService(){
        ObjectMapper mapper = new ObjectMapper();

        // You can add this as request param and also make the rest end point as post.
        String jsonInString = "{\n" +
                "\"ipsId\": \"0000\",\n" +
                "\"updatedDate\": 1470500690481,\n" +
                "\"status\": \"SUCCESS\",\n" +
                "\"payload\": [\n" +
                "{\n" +
                "\"orderId\": \"3\",\n" +
                "\"payload\": \"******* this is payload 0\",\n" +
                "\"amount\": 0\n" +
                "},\n" +
                "{\n" +
                "\"orderId\": \"29\",\n" +
                "\"payload\": \"******* this is payload 1\",\n" +
                "\"amount\": 0\n" +
                "},\n" +
                "{\n" +
                "\"orderId\": \"126\",\n" +
                "\"payload\": \"******* this is payload 2\",\n" +
                "\"amount\": 0\n" +
                "},\n" +
                "{\n" +
                "\"orderId\": \"50\",\n" +
                "\"payload\": \"******* this is payload 3\",\n" +
                "\"amount\": 0\n" +
                "},\n" +
                "{\n" +
                "\"orderId\": \"106\",\n" +
                "\"payload\": \"******* this is payload 4\",\n" +
                "\"amount\": 0\n" +
                "}\n" +
                "]\n" +
                "}";

//JSON from file to Object
        try {
            // Convert the String to the object received from IPS system
            IPSResponse obj = mapper.readValue(jsonInString, IPSResponse.class);

            // Now calling the service to save the data.
            yourService.saveData(obj);

        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }
}
