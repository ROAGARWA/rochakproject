package com.example.system.service;

import com.example.system.client.RestClient;
import com.example.system.dto.IPSResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by rajorea on 06/08/16.
 */
@Service
public class YourService {

    @Resource
    private RestClient restClient;


    /**
     * Here you can do the JDBC Operations as you like.
     *
     *  You have to create a repository and the domain objects,
     *  you have to use the objects and proper JDBC annotations.
     *
     * @return
     */

    public IPSResponse getDataFromIPSSystem() {
        final IPSResponse responseFromIps = restClient.getDataFromIpsSystem();
        System.out.println("*********** " + responseFromIps);
        return responseFromIps;
    }










}
