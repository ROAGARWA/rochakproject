package com.example.system.service;

import com.example.system.dto.IPSResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by rajorea on 06/08/16.
 */
@Service
public class YourService {

//    @Resource
//    private JdbcTemplate jdbcTemplate;

    /**
     * Here you can do the JDBC Operations as you like.
     *
     *  You have to create a repository and the domain objects,
     *  you have to use the objects and proper JDBC annotations.
     *
     * @return
     */
    public void saveData(IPSResponse ipsResponse){
        /**
         * Example two in the below link will suit your needs.
         * I will just output the data here.. caues I would need to setup DB for saving data.
         *  http://stackoverflow.com/questions/2770877/spring-jdbctemplate-insert-blob-and-return-generated-key
         */

        System.out.println("*********** saving the data ***** ");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("******** Saved data is " + ipsResponse);
    }


    public void processIPSData() {
        // Using JDBC Template we need to query for the data.
        // and apply for validations.
        // Here are some more examples
        // http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jdbc.html

        // You may choose to create a new class for applying validations and other things that you need to do

    }
}
