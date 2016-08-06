package com.example.system.client;

import com.example.system.dto.IPSResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by rajorea on 06/08/16.
 */
@Component
public class RestClient {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${ips.restendpoint}")
    private String ipsRestEndpoint;

    @Resource
    private RestTemplate ipsRestTemplate;


    public IPSResponse getDataFromIpsSystem(){
//            logger.info("Calling Seo Service " + GET_KEYWORDS_RANKING_SNAPSHOT + " for webId: " + webId + " and locale: " + locale);
        /**
         * You can also read about the getForEntity.
         */
            return ipsRestTemplate.getForObject(getPath(), IPSResponse.class);

    }




    public String getPath(){
        return apiUrl + ipsRestEndpoint;
    }


}
