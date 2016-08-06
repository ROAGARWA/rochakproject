package com.example.system;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajorea on 06/08/16.
 */
@Configuration
public class YourConfig {

    @Value("${api.url}")
    private String apiUrl;

//    @Value("${your.user}")
//    private String user;
//    @Value("${your.password}")
//    private String password;
    /*
        you would need to read about the BasicAuthClientHttpRequestFactory to support the authentication based on username and password.
     */




    @Bean
    public RestTemplate yourRestTemplate() {
        RestTemplate rt = new RestTemplate();
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        converters.add(new FormHttpMessageConverter());
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MappingJackson2HttpMessageConverter converter  = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(om);
        converters.add(converter);
        rt.setMessageConverters(converters);
        return rt;
    }



}
